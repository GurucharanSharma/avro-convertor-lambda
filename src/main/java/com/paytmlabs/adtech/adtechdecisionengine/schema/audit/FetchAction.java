/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.paytmlabs.adtech.adtechdecisionengine.schema.audit;
@org.apache.avro.specific.AvroGenerated
public enum FetchAction implements org.apache.avro.generic.GenericEnumSymbol<FetchAction> {
  FETCHED, NOT_FETCHED, ERROR  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"FetchAction\",\"namespace\":\"com.paytmlabs.adtech.adtechdecisionengine.schema.audit\",\"symbols\":[\"FETCHED\",\"NOT_FETCHED\",\"ERROR\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
