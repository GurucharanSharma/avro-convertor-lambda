/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.paytmlabs.adtech.adtechdecisionengine.schema.audit;
@org.apache.avro.specific.AvroGenerated
public enum ExternalSelectionAction implements org.apache.avro.generic.GenericEnumSymbol<ExternalSelectionAction> {
  NOT_PERFORMED, COMPLETED, NOT_COMPLETED, ERROR  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"ExternalSelectionAction\",\"namespace\":\"com.paytmlabs.adtech.adtechdecisionengine.schema.audit\",\"symbols\":[\"NOT_PERFORMED\",\"COMPLETED\",\"NOT_COMPLETED\",\"ERROR\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
