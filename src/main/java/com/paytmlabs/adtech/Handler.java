package com.paytmlabs.adtech;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.KinesisAnalyticsInputPreprocessingResponse;
import com.amazonaws.services.lambda.runtime.events.KinesisAnalyticsInputPreprocessingResponse.Record;
import com.amazonaws.services.lambda.runtime.events.KinesisAnalyticsInputPreprocessingResponse.Result;
import com.amazonaws.services.lambda.runtime.events.KinesisFirehoseEvent;
import com.paytmlabs.adtech.adtechdecisionengine.schema.audit.AuditLogEvent;
import com.paytmlabs.adtech.exception.AvroConvertorException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.json.JSONObject;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Handler implements RequestHandler<KinesisFirehoseEvent, KinesisAnalyticsInputPreprocessingResponse> {

  @Override
  public KinesisAnalyticsInputPreprocessingResponse handleRequest(KinesisFirehoseEvent event, Context context) {
    LambdaLogger logger = context.getLogger();
    logger.log("EVENT TYPE: " + event.getClass().toString());

    return Flux.fromIterable(event.getRecords())
        .flatMap(record -> transformRecord(record, logger))
        .collectList()
        .map(KinesisAnalyticsInputPreprocessingResponse::new)
        .block();
  }

  private Mono<Record> transformRecord(KinesisFirehoseEvent.Record record, LambdaLogger logger) {
    return Mono.just(record.getData())
        //.map(StandardCharsets.UTF_8::decode)
        .flatMap(data -> Mono.fromCallable(() -> convertToJson(data, logger)))
        .map(StandardCharsets.UTF_8::encode)
        .map(data -> new KinesisAnalyticsInputPreprocessingResponse.Record(record.getRecordId(), Result.Ok, data))
        .doOnError(e -> logger.log("ERROR: " + e.getMessage()))
        .onErrorResume(e -> Mono.just(new KinesisAnalyticsInputPreprocessingResponse.Record(record.getRecordId(), Result.ProcessingFailed, record.getData())));
  }

  public String convertToJson(ByteBuffer byteBuffer, LambdaLogger logger) {
    ByteBuffer avroDataBuffer = byteBuffer.asReadOnlyBuffer();
    byte[] avroDataBytes = new byte[avroDataBuffer.remaining()];
    avroDataBuffer.get(avroDataBytes);

    logger.log("EVENT VALUE: " + Arrays.toString(avroDataBytes));

    try (ByteArrayInputStream stream = new ByteArrayInputStream(avroDataBytes)) {
      // Deserialize Avro data
      DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(AuditLogEvent.getClassSchema());
      Decoder binaryDecoder = DecoderFactory.get().binaryDecoder(stream, null);
      GenericRecord avroRecord = datumReader.read(null, binaryDecoder);

      // Convert Avro data to JSON and perform any necessary transformation
      return new JSONObject(avroRecord.toString()).toString();
    } catch (IOException e) {
      throw new AvroConvertorException("Error converting Avro to JSON: " + e.getMessage());
    }
  }
}
