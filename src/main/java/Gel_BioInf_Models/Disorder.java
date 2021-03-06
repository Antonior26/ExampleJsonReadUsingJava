/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;  
@SuppressWarnings("all")
/** This is quite GEL specific. This is the way is stored in ModelCatalogue and PanelApp.
Currently all specific disease titles are assigned to a disease subgroup so really only specificDisease needs to be
completed but we add the others for generality */
@org.apache.avro.specific.AvroGenerated
public class Disorder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Disorder\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This is quite GEL specific. This is the way is stored in ModelCatalogue and PanelApp.\\nCurrently all specific disease titles are assigned to a disease subgroup so really only specificDisease needs to be\\ncompleted but we add the others for generality\",\"fields\":[{\"name\":\"diseaseGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level2 Title for this disorder\"},{\"name\":\"diseaseSubGroup\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level3 Title for this disorder\"},{\"name\":\"specificDisease\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"This is Level4 Title for this disorder\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** This is Level2 Title for this disorder */
   public java.lang.String diseaseGroup;
  /** This is Level3 Title for this disorder */
   public java.lang.String diseaseSubGroup;
  /** This is Level4 Title for this disorder */
   public java.lang.String specificDisease;
  /** Age of onset in months */
   public java.lang.Integer ageOfOnset;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Disorder() {}

  /**
   * All-args constructor.
   */
  public Disorder(java.lang.String diseaseGroup, java.lang.String diseaseSubGroup, java.lang.String specificDisease, java.lang.Integer ageOfOnset) {
    this.diseaseGroup = diseaseGroup;
    this.diseaseSubGroup = diseaseSubGroup;
    this.specificDisease = specificDisease;
    this.ageOfOnset = ageOfOnset;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return diseaseGroup;
    case 1: return diseaseSubGroup;
    case 2: return specificDisease;
    case 3: return ageOfOnset;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: diseaseGroup = (java.lang.String)value$; break;
    case 1: diseaseSubGroup = (java.lang.String)value$; break;
    case 2: specificDisease = (java.lang.String)value$; break;
    case 3: ageOfOnset = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'diseaseGroup' field.
   * This is Level2 Title for this disorder   */
  public java.lang.String getDiseaseGroup() {
    return diseaseGroup;
  }

  /**
   * Sets the value of the 'diseaseGroup' field.
   * This is Level2 Title for this disorder   * @param value the value to set.
   */
  public void setDiseaseGroup(java.lang.String value) {
    this.diseaseGroup = value;
  }

  /**
   * Gets the value of the 'diseaseSubGroup' field.
   * This is Level3 Title for this disorder   */
  public java.lang.String getDiseaseSubGroup() {
    return diseaseSubGroup;
  }

  /**
   * Sets the value of the 'diseaseSubGroup' field.
   * This is Level3 Title for this disorder   * @param value the value to set.
   */
  public void setDiseaseSubGroup(java.lang.String value) {
    this.diseaseSubGroup = value;
  }

  /**
   * Gets the value of the 'specificDisease' field.
   * This is Level4 Title for this disorder   */
  public java.lang.String getSpecificDisease() {
    return specificDisease;
  }

  /**
   * Sets the value of the 'specificDisease' field.
   * This is Level4 Title for this disorder   * @param value the value to set.
   */
  public void setSpecificDisease(java.lang.String value) {
    this.specificDisease = value;
  }

  /**
   * Gets the value of the 'ageOfOnset' field.
   * Age of onset in months   */
  public java.lang.Integer getAgeOfOnset() {
    return ageOfOnset;
  }

  /**
   * Sets the value of the 'ageOfOnset' field.
   * Age of onset in months   * @param value the value to set.
   */
  public void setAgeOfOnset(java.lang.Integer value) {
    this.ageOfOnset = value;
  }

  /** Creates a new Disorder RecordBuilder */
  public static Gel_BioInf_Models.Disorder.Builder newBuilder() {
    return new Gel_BioInf_Models.Disorder.Builder();
  }
  
  /** Creates a new Disorder RecordBuilder by copying an existing Builder */
  public static Gel_BioInf_Models.Disorder.Builder newBuilder(Gel_BioInf_Models.Disorder.Builder other) {
    return new Gel_BioInf_Models.Disorder.Builder(other);
  }
  
  /** Creates a new Disorder RecordBuilder by copying an existing Disorder instance */
  public static Gel_BioInf_Models.Disorder.Builder newBuilder(Gel_BioInf_Models.Disorder other) {
    return new Gel_BioInf_Models.Disorder.Builder(other);
  }
  
  /**
   * RecordBuilder for Disorder instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Disorder>
    implements org.apache.avro.data.RecordBuilder<Disorder> {

    private java.lang.String diseaseGroup;
    private java.lang.String diseaseSubGroup;
    private java.lang.String specificDisease;
    private java.lang.Integer ageOfOnset;

    /** Creates a new Builder */
    private Builder() {
      super(Gel_BioInf_Models.Disorder.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Gel_BioInf_Models.Disorder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.diseaseGroup)) {
        this.diseaseGroup = data().deepCopy(fields()[0].schema(), other.diseaseGroup);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.diseaseSubGroup)) {
        this.diseaseSubGroup = data().deepCopy(fields()[1].schema(), other.diseaseSubGroup);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specificDisease)) {
        this.specificDisease = data().deepCopy(fields()[2].schema(), other.specificDisease);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ageOfOnset)) {
        this.ageOfOnset = data().deepCopy(fields()[3].schema(), other.ageOfOnset);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Disorder instance */
    private Builder(Gel_BioInf_Models.Disorder other) {
            super(Gel_BioInf_Models.Disorder.SCHEMA$);
      if (isValidValue(fields()[0], other.diseaseGroup)) {
        this.diseaseGroup = data().deepCopy(fields()[0].schema(), other.diseaseGroup);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.diseaseSubGroup)) {
        this.diseaseSubGroup = data().deepCopy(fields()[1].schema(), other.diseaseSubGroup);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specificDisease)) {
        this.specificDisease = data().deepCopy(fields()[2].schema(), other.specificDisease);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ageOfOnset)) {
        this.ageOfOnset = data().deepCopy(fields()[3].schema(), other.ageOfOnset);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'diseaseGroup' field */
    public java.lang.String getDiseaseGroup() {
      return diseaseGroup;
    }
    
    /** Sets the value of the 'diseaseGroup' field */
    public Gel_BioInf_Models.Disorder.Builder setDiseaseGroup(java.lang.String value) {
      validate(fields()[0], value);
      this.diseaseGroup = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'diseaseGroup' field has been set */
    public boolean hasDiseaseGroup() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'diseaseGroup' field */
    public Gel_BioInf_Models.Disorder.Builder clearDiseaseGroup() {
      diseaseGroup = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'diseaseSubGroup' field */
    public java.lang.String getDiseaseSubGroup() {
      return diseaseSubGroup;
    }
    
    /** Sets the value of the 'diseaseSubGroup' field */
    public Gel_BioInf_Models.Disorder.Builder setDiseaseSubGroup(java.lang.String value) {
      validate(fields()[1], value);
      this.diseaseSubGroup = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'diseaseSubGroup' field has been set */
    public boolean hasDiseaseSubGroup() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'diseaseSubGroup' field */
    public Gel_BioInf_Models.Disorder.Builder clearDiseaseSubGroup() {
      diseaseSubGroup = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'specificDisease' field */
    public java.lang.String getSpecificDisease() {
      return specificDisease;
    }
    
    /** Sets the value of the 'specificDisease' field */
    public Gel_BioInf_Models.Disorder.Builder setSpecificDisease(java.lang.String value) {
      validate(fields()[2], value);
      this.specificDisease = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'specificDisease' field has been set */
    public boolean hasSpecificDisease() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'specificDisease' field */
    public Gel_BioInf_Models.Disorder.Builder clearSpecificDisease() {
      specificDisease = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ageOfOnset' field */
    public java.lang.Integer getAgeOfOnset() {
      return ageOfOnset;
    }
    
    /** Sets the value of the 'ageOfOnset' field */
    public Gel_BioInf_Models.Disorder.Builder setAgeOfOnset(java.lang.Integer value) {
      validate(fields()[3], value);
      this.ageOfOnset = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'ageOfOnset' field has been set */
    public boolean hasAgeOfOnset() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'ageOfOnset' field */
    public Gel_BioInf_Models.Disorder.Builder clearAgeOfOnset() {
      ageOfOnset = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Disorder build() {
      try {
        Disorder record = new Disorder();
        record.diseaseGroup = fieldSetFlags()[0] ? this.diseaseGroup : (java.lang.String) defaultValue(fields()[0]);
        record.diseaseSubGroup = fieldSetFlags()[1] ? this.diseaseSubGroup : (java.lang.String) defaultValue(fields()[1]);
        record.specificDisease = fieldSetFlags()[2] ? this.specificDisease : (java.lang.String) defaultValue(fields()[2]);
        record.ageOfOnset = fieldSetFlags()[3] ? this.ageOfOnset : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
