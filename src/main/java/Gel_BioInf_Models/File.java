/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;  
@SuppressWarnings("all")
/** This defines a file
This Record is defined by the sampleID and a URI
Currently SampleID can be a single String or an array of strings if multiple samples are associated with the same file */
@org.apache.avro.specific.AvroGenerated
public class File extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"File\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This defines a file\\nThis Record is defined by the sampleID and a URI\\nCurrently SampleID can be a single String or an array of strings if multiple samples are associated with the same file\",\"fields\":[{\"name\":\"SampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"},{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"doc\":\"Unique ID(s) of the Sample, for example in a multisample vcf this would have an array of all the smaple ids\"},{\"name\":\"URIFile\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"URI PATH\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Unique ID(s) of the Sample, for example in a multisample vcf this would have an array of all the smaple ids */
   public java.lang.Object SampleId;
  /** URI PATH */
   public java.lang.String URIFile;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public File() {}

  /**
   * All-args constructor.
   */
  public File(java.lang.Object SampleId, java.lang.String URIFile) {
    this.SampleId = SampleId;
    this.URIFile = URIFile;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return SampleId;
    case 1: return URIFile;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: SampleId = (java.lang.Object)value$; break;
    case 1: URIFile = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'SampleId' field.
   * Unique ID(s) of the Sample, for example in a multisample vcf this would have an array of all the smaple ids   */
  public java.lang.Object getSampleId() {
    return SampleId;
  }

  /**
   * Sets the value of the 'SampleId' field.
   * Unique ID(s) of the Sample, for example in a multisample vcf this would have an array of all the smaple ids   * @param value the value to set.
   */
  public void setSampleId(java.lang.Object value) {
    this.SampleId = value;
  }

  /**
   * Gets the value of the 'URIFile' field.
   * URI PATH   */
  public java.lang.String getURIFile() {
    return URIFile;
  }

  /**
   * Sets the value of the 'URIFile' field.
   * URI PATH   * @param value the value to set.
   */
  public void setURIFile(java.lang.String value) {
    this.URIFile = value;
  }

  /** Creates a new File RecordBuilder */
  public static Gel_BioInf_Models.File.Builder newBuilder() {
    return new Gel_BioInf_Models.File.Builder();
  }
  
  /** Creates a new File RecordBuilder by copying an existing Builder */
  public static Gel_BioInf_Models.File.Builder newBuilder(Gel_BioInf_Models.File.Builder other) {
    return new Gel_BioInf_Models.File.Builder(other);
  }
  
  /** Creates a new File RecordBuilder by copying an existing File instance */
  public static Gel_BioInf_Models.File.Builder newBuilder(Gel_BioInf_Models.File other) {
    return new Gel_BioInf_Models.File.Builder(other);
  }
  
  /**
   * RecordBuilder for File instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<File>
    implements org.apache.avro.data.RecordBuilder<File> {

    private java.lang.Object SampleId;
    private java.lang.String URIFile;

    /** Creates a new Builder */
    private Builder() {
      super(Gel_BioInf_Models.File.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Gel_BioInf_Models.File.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.SampleId)) {
        this.SampleId = data().deepCopy(fields()[0].schema(), other.SampleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.URIFile)) {
        this.URIFile = data().deepCopy(fields()[1].schema(), other.URIFile);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing File instance */
    private Builder(Gel_BioInf_Models.File other) {
            super(Gel_BioInf_Models.File.SCHEMA$);
      if (isValidValue(fields()[0], other.SampleId)) {
        this.SampleId = data().deepCopy(fields()[0].schema(), other.SampleId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.URIFile)) {
        this.URIFile = data().deepCopy(fields()[1].schema(), other.URIFile);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'SampleId' field */
    public java.lang.Object getSampleId() {
      return SampleId;
    }
    
    /** Sets the value of the 'SampleId' field */
    public Gel_BioInf_Models.File.Builder setSampleId(java.lang.Object value) {
      validate(fields()[0], value);
      this.SampleId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'SampleId' field has been set */
    public boolean hasSampleId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'SampleId' field */
    public Gel_BioInf_Models.File.Builder clearSampleId() {
      SampleId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'URIFile' field */
    public java.lang.String getURIFile() {
      return URIFile;
    }
    
    /** Sets the value of the 'URIFile' field */
    public Gel_BioInf_Models.File.Builder setURIFile(java.lang.String value) {
      validate(fields()[1], value);
      this.URIFile = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'URIFile' field has been set */
    public boolean hasURIFile() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'URIFile' field */
    public Gel_BioInf_Models.File.Builder clearURIFile() {
      URIFile = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public File build() {
      try {
        File record = new File();
        record.SampleId = fieldSetFlags()[0] ? this.SampleId : (java.lang.Object) defaultValue(fields()[0]);
        record.URIFile = fieldSetFlags()[1] ? this.URIFile : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
