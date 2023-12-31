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
public class GratificationDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8931691397654138044L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GratificationDetails\",\"namespace\":\"com.paytmlabs.adtech.adtechdecisionengine.schema.audit\",\"fields\":[{\"name\":\"ads_funded\",\"type\":\"boolean\"},{\"name\":\"scratch_card\",\"type\":\"boolean\"},{\"name\":\"redemption_type\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GratificationDetails> ENCODER =
      new BinaryMessageEncoder<GratificationDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GratificationDetails> DECODER =
      new BinaryMessageDecoder<GratificationDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GratificationDetails> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GratificationDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GratificationDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GratificationDetails>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GratificationDetails to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GratificationDetails from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GratificationDetails instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GratificationDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private boolean ads_funded;
  private boolean scratch_card;
  private java.lang.CharSequence redemption_type;
  private double amount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GratificationDetails() {}

  /**
   * All-args constructor.
   * @param ads_funded The new value for ads_funded
   * @param scratch_card The new value for scratch_card
   * @param redemption_type The new value for redemption_type
   * @param amount The new value for amount
   */
  public GratificationDetails(java.lang.Boolean ads_funded, java.lang.Boolean scratch_card, java.lang.CharSequence redemption_type, java.lang.Double amount) {
    this.ads_funded = ads_funded;
    this.scratch_card = scratch_card;
    this.redemption_type = redemption_type;
    this.amount = amount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ads_funded;
    case 1: return scratch_card;
    case 2: return redemption_type;
    case 3: return amount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ads_funded = (java.lang.Boolean)value$; break;
    case 1: scratch_card = (java.lang.Boolean)value$; break;
    case 2: redemption_type = (java.lang.CharSequence)value$; break;
    case 3: amount = (java.lang.Double)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ads_funded' field.
   * @return The value of the 'ads_funded' field.
   */
  public boolean getAdsFunded() {
    return ads_funded;
  }


  /**
   * Sets the value of the 'ads_funded' field.
   * @param value the value to set.
   */
  public void setAdsFunded(boolean value) {
    this.ads_funded = value;
  }

  /**
   * Gets the value of the 'scratch_card' field.
   * @return The value of the 'scratch_card' field.
   */
  public boolean getScratchCard() {
    return scratch_card;
  }


  /**
   * Sets the value of the 'scratch_card' field.
   * @param value the value to set.
   */
  public void setScratchCard(boolean value) {
    this.scratch_card = value;
  }

  /**
   * Gets the value of the 'redemption_type' field.
   * @return The value of the 'redemption_type' field.
   */
  public java.lang.CharSequence getRedemptionType() {
    return redemption_type;
  }


  /**
   * Sets the value of the 'redemption_type' field.
   * @param value the value to set.
   */
  public void setRedemptionType(java.lang.CharSequence value) {
    this.redemption_type = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public double getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(double value) {
    this.amount = value;
  }

  /**
   * Creates a new GratificationDetails RecordBuilder.
   * @return A new GratificationDetails RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder newBuilder() {
    return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder();
  }

  /**
   * Creates a new GratificationDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GratificationDetails RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder newBuilder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder other) {
    if (other == null) {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder();
    } else {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder(other);
    }
  }

  /**
   * Creates a new GratificationDetails RecordBuilder by copying an existing GratificationDetails instance.
   * @param other The existing instance to copy.
   * @return A new GratificationDetails RecordBuilder
   */
  public static com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder newBuilder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails other) {
    if (other == null) {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder();
    } else {
      return new com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder(other);
    }
  }

  /**
   * RecordBuilder for GratificationDetails instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GratificationDetails>
    implements org.apache.avro.data.RecordBuilder<GratificationDetails> {

    private boolean ads_funded;
    private boolean scratch_card;
    private java.lang.CharSequence redemption_type;
    private double amount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ads_funded)) {
        this.ads_funded = data().deepCopy(fields()[0].schema(), other.ads_funded);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.scratch_card)) {
        this.scratch_card = data().deepCopy(fields()[1].schema(), other.scratch_card);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.redemption_type)) {
        this.redemption_type = data().deepCopy(fields()[2].schema(), other.redemption_type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing GratificationDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ads_funded)) {
        this.ads_funded = data().deepCopy(fields()[0].schema(), other.ads_funded);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.scratch_card)) {
        this.scratch_card = data().deepCopy(fields()[1].schema(), other.scratch_card);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.redemption_type)) {
        this.redemption_type = data().deepCopy(fields()[2].schema(), other.redemption_type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.amount)) {
        this.amount = data().deepCopy(fields()[3].schema(), other.amount);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'ads_funded' field.
      * @return The value.
      */
    public boolean getAdsFunded() {
      return ads_funded;
    }


    /**
      * Sets the value of the 'ads_funded' field.
      * @param value The value of 'ads_funded'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder setAdsFunded(boolean value) {
      validate(fields()[0], value);
      this.ads_funded = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ads_funded' field has been set.
      * @return True if the 'ads_funded' field has been set, false otherwise.
      */
    public boolean hasAdsFunded() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ads_funded' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder clearAdsFunded() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'scratch_card' field.
      * @return The value.
      */
    public boolean getScratchCard() {
      return scratch_card;
    }


    /**
      * Sets the value of the 'scratch_card' field.
      * @param value The value of 'scratch_card'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder setScratchCard(boolean value) {
      validate(fields()[1], value);
      this.scratch_card = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'scratch_card' field has been set.
      * @return True if the 'scratch_card' field has been set, false otherwise.
      */
    public boolean hasScratchCard() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'scratch_card' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder clearScratchCard() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'redemption_type' field.
      * @return The value.
      */
    public java.lang.CharSequence getRedemptionType() {
      return redemption_type;
    }


    /**
      * Sets the value of the 'redemption_type' field.
      * @param value The value of 'redemption_type'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder setRedemptionType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.redemption_type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'redemption_type' field has been set.
      * @return True if the 'redemption_type' field has been set, false otherwise.
      */
    public boolean hasRedemptionType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'redemption_type' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder clearRedemptionType() {
      redemption_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public double getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder setAmount(double value) {
      validate(fields()[3], value);
      this.amount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.paytmlabs.adtech.adtechdecisionengine.schema.audit.GratificationDetails.Builder clearAmount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GratificationDetails build() {
      try {
        GratificationDetails record = new GratificationDetails();
        record.ads_funded = fieldSetFlags()[0] ? this.ads_funded : (java.lang.Boolean) defaultValue(fields()[0]);
        record.scratch_card = fieldSetFlags()[1] ? this.scratch_card : (java.lang.Boolean) defaultValue(fields()[1]);
        record.redemption_type = fieldSetFlags()[2] ? this.redemption_type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.amount = fieldSetFlags()[3] ? this.amount : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GratificationDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<GratificationDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GratificationDetails>
    READER$ = (org.apache.avro.io.DatumReader<GratificationDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeBoolean(this.ads_funded);

    out.writeBoolean(this.scratch_card);

    out.writeString(this.redemption_type);

    out.writeDouble(this.amount);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ads_funded = in.readBoolean();

      this.scratch_card = in.readBoolean();

      this.redemption_type = in.readString(this.redemption_type instanceof Utf8 ? (Utf8)this.redemption_type : null);

      this.amount = in.readDouble();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ads_funded = in.readBoolean();
          break;

        case 1:
          this.scratch_card = in.readBoolean();
          break;

        case 2:
          this.redemption_type = in.readString(this.redemption_type instanceof Utf8 ? (Utf8)this.redemption_type : null);
          break;

        case 3:
          this.amount = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










