/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.paytmlabs.adtech.adtechdecisionengine.schema.audit;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ReservationContext extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8574990463239764470L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReservationContext\",\"namespace\":\"com.paytmlabs.adtech.adtechdecisionengine.schema.audit\",\"fields\":[{\"name\":\"gratification\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GratificationDetails\",\"fields\":[{\"name\":\"ads_funded\",\"type\":\"boolean\"},{\"name\":\"scratch_card\",\"type\":\"boolean\"},{\"name\":\"redemption_type\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"}]}}},{\"name\":\"segmentation_context\",\"type\":{\"type\":\"map\",\"values\":\"boolean\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ReservationContext> ENCODER =
      new BinaryMessageEncoder<ReservationContext>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReservationContext> DECODER =
      new BinaryMessageDecoder<ReservationContext>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ReservationContext> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ReservationContext> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ReservationContext> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReservationContext>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ReservationContext to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ReservationContext from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ReservationContext instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ReservationContext fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> gratification;
  private java.util.Map<java.lang.CharSequence,java.lang.Boolean> segmentation_context;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReservationContext() {}

  /**
   * All-args constructor.
   * @param gratification The new value for gratification
   * @param segmentation_context The new value for segmentation_context
   */
  public ReservationContext(java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> gratification, java.util.Map<java.lang.CharSequence,java.lang.Boolean> segmentation_context) {
    this.gratification = gratification;
    this.segmentation_context = segmentation_context;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return gratification;
    case 1: return segmentation_context;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: gratification = (java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>)value$; break;
    case 1: segmentation_context = (java.util.Map<java.lang.CharSequence,java.lang.Boolean>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'gratification' field.
   * @return The value of the 'gratification' field.
   */
  public java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> getGratification() {
    return gratification;
  }


  /**
   * Sets the value of the 'gratification' field.
   * @param value the value to set.
   */
  public void setGratification(java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> value) {
    this.gratification = value;
  }

  /**
   * Gets the value of the 'segmentation_context' field.
   * @return The value of the 'segmentation_context' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Boolean> getSegmentationContext() {
    return segmentation_context;
  }


  /**
   * Sets the value of the 'segmentation_context' field.
   * @param value the value to set.
   */
  public void setSegmentationContext(java.util.Map<java.lang.CharSequence,java.lang.Boolean> value) {
    this.segmentation_context = value;
  }

  /**
   * Creates a new ReservationContext RecordBuilder.
   * @return A new ReservationContext RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder newBuilder() {
    return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder();
  }

  /**
   * Creates a new ReservationContext RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReservationContext RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder newBuilder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder other) {
    if (other == null) {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder();
    } else {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder(other);
    }
  }

  /**
   * Creates a new ReservationContext RecordBuilder by copying an existing ReservationContext instance.
   * @param other The existing instance to copy.
   * @return A new ReservationContext RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder newBuilder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext other) {
    if (other == null) {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder();
    } else {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder(other);
    }
  }

  /**
   * RecordBuilder for ReservationContext instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReservationContext>
    implements org.apache.avro.data.RecordBuilder<ReservationContext> {

    private java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> gratification;
    private java.util.Map<java.lang.CharSequence,java.lang.Boolean> segmentation_context;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.gratification)) {
        this.gratification = data().deepCopy(fields()[0].schema(), other.gratification);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.segmentation_context)) {
        this.segmentation_context = data().deepCopy(fields()[1].schema(), other.segmentation_context);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ReservationContext instance
     * @param other The existing instance to copy.
     */
    private Builder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.gratification)) {
        this.gratification = data().deepCopy(fields()[0].schema(), other.gratification);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.segmentation_context)) {
        this.segmentation_context = data().deepCopy(fields()[1].schema(), other.segmentation_context);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'gratification' field.
      * @return The value.
      */
    public java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> getGratification() {
      return gratification;
    }


    /**
      * Sets the value of the 'gratification' field.
      * @param value The value of 'gratification'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder setGratification(java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> value) {
      validate(fields()[0], value);
      this.gratification = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'gratification' field has been set.
      * @return True if the 'gratification' field has been set, false otherwise.
      */
    public boolean hasGratification() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'gratification' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder clearGratification() {
      gratification = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'segmentation_context' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Boolean> getSegmentationContext() {
      return segmentation_context;
    }


    /**
      * Sets the value of the 'segmentation_context' field.
      * @param value The value of 'segmentation_context'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder setSegmentationContext(java.util.Map<java.lang.CharSequence,java.lang.Boolean> value) {
      validate(fields()[1], value);
      this.segmentation_context = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'segmentation_context' field has been set.
      * @return True if the 'segmentation_context' field has been set, false otherwise.
      */
    public boolean hasSegmentationContext() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'segmentation_context' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.ReservationContext.Builder clearSegmentationContext() {
      segmentation_context = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReservationContext build() {
      try {
        ReservationContext record = new ReservationContext();
        record.gratification = fieldSetFlags()[0] ? this.gratification : (java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>) defaultValue(fields()[0]);
        record.segmentation_context = fieldSetFlags()[1] ? this.segmentation_context : (java.util.Map<java.lang.CharSequence,java.lang.Boolean>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReservationContext>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReservationContext>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReservationContext>
    READER$ = (org.apache.avro.io.DatumReader<ReservationContext>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.gratification.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails e0: this.gratification) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    long size1 = this.segmentation_context.size();
    out.writeMapStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, java.lang.Boolean> e1: this.segmentation_context.entrySet()) {
      actualSize1++;
      out.startItem();
      out.writeString(e1.getKey());
      java.lang.Boolean v1 = e1.getValue();
      out.writeBoolean(v1);
    }
    out.writeMapEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size1 + ", but element count was " + actualSize1 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> a0 = this.gratification;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>((int)size0, SCHEMA$.getField("gratification").schema());
        this.gratification = a0;
      } else a0.clear();
      SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      long size1 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,java.lang.Boolean> m1 = this.segmentation_context; // Need fresh name due to limitation of macro system
      if (m1 == null) {
        m1 = new java.util.HashMap<java.lang.CharSequence,java.lang.Boolean>((int)size1);
        this.segmentation_context = m1;
      } else m1.clear();
      for ( ; 0 < size1; size1 = in.mapNext()) {
        for ( ; size1 != 0; size1--) {
          java.lang.CharSequence k1 = null;
          k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
          java.lang.Boolean v1 = null;
          v1 = in.readBoolean();
          m1.put(k1, v1);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> a0 = this.gratification;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>((int)size0, SCHEMA$.getField("gratification").schema());
            this.gratification = a0;
          } else a0.clear();
          SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 1:
          long size1 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,java.lang.Boolean> m1 = this.segmentation_context; // Need fresh name due to limitation of macro system
          if (m1 == null) {
            m1 = new java.util.HashMap<java.lang.CharSequence,java.lang.Boolean>((int)size1);
            this.segmentation_context = m1;
          } else m1.clear();
          for ( ; 0 < size1; size1 = in.mapNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.CharSequence k1 = null;
              k1 = in.readString(k1 instanceof Utf8 ? (Utf8)k1 : null);
              java.lang.Boolean v1 = null;
              v1 = in.readBoolean();
              m1.put(k1, v1);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










