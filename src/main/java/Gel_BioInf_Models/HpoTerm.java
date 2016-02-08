/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;  
@SuppressWarnings("all")
/** This defines an HPO term and its modifiers (possibly multiple)
If HPO term presence is unknown we don't have a entry on the list */
@org.apache.avro.specific.AvroGenerated
public class HpoTerm extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HpoTerm\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This defines an HPO term and its modifiers (possibly multiple)\\nIf HPO term presence is unknown we don't have a entry on the list\",\"fields\":[{\"name\":\"term\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Identifier of the HPO term\"},{\"name\":\"termPresence\",\"type\":\"boolean\",\"doc\":\"This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,\\n    false=term is not present\"},{\"name\":\"modifiers\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"Modifier associated with the HPO term\"},{\"name\":\"ageOfOnset\",\"type\":[\"null\",\"int\"],\"doc\":\"Age of onset in months\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Identifier of the HPO term */
   public java.lang.String term;
  /** This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,
    false=term is not present */
   public boolean termPresence;
  /** Modifier associated with the HPO term */
   public java.util.Map<java.lang.String,java.lang.String> modifiers;
  /** Age of onset in months */
   public java.lang.Integer ageOfOnset;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public HpoTerm() {}

  /**
   * All-args constructor.
   */
  public HpoTerm(java.lang.String term, java.lang.Boolean termPresence, java.util.Map<java.lang.String,java.lang.String> modifiers, java.lang.Integer ageOfOnset) {
    this.term = term;
    this.termPresence = termPresence;
    this.modifiers = modifiers;
    this.ageOfOnset = ageOfOnset;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return term;
    case 1: return termPresence;
    case 2: return modifiers;
    case 3: return ageOfOnset;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: term = (java.lang.String)value$; break;
    case 1: termPresence = (java.lang.Boolean)value$; break;
    case 2: modifiers = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 3: ageOfOnset = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'term' field.
   * Identifier of the HPO term   */
  public java.lang.String getTerm() {
    return term;
  }

  /**
   * Sets the value of the 'term' field.
   * Identifier of the HPO term   * @param value the value to set.
   */
  public void setTerm(java.lang.String value) {
    this.term = value;
  }

  /**
   * Gets the value of the 'termPresence' field.
   * This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,
    false=term is not present   */
  public java.lang.Boolean getTermPresence() {
    return termPresence;
  }

  /**
   * Sets the value of the 'termPresence' field.
   * This is whether the term is present in the participant (default is null=unkown) true=term is present in participant,
    false=term is not present   * @param value the value to set.
   */
  public void setTermPresence(java.lang.Boolean value) {
    this.termPresence = value;
  }

  /**
   * Gets the value of the 'modifiers' field.
   * Modifier associated with the HPO term   */
  public java.util.Map<java.lang.String,java.lang.String> getModifiers() {
    return modifiers;
  }

  /**
   * Sets the value of the 'modifiers' field.
   * Modifier associated with the HPO term   * @param value the value to set.
   */
  public void setModifiers(java.util.Map<java.lang.String,java.lang.String> value) {
    this.modifiers = value;
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

  /** Creates a new HpoTerm RecordBuilder */
  public static Gel_BioInf_Models.HpoTerm.Builder newBuilder() {
    return new Gel_BioInf_Models.HpoTerm.Builder();
  }
  
  /** Creates a new HpoTerm RecordBuilder by copying an existing Builder */
  public static Gel_BioInf_Models.HpoTerm.Builder newBuilder(Gel_BioInf_Models.HpoTerm.Builder other) {
    return new Gel_BioInf_Models.HpoTerm.Builder(other);
  }
  
  /** Creates a new HpoTerm RecordBuilder by copying an existing HpoTerm instance */
  public static Gel_BioInf_Models.HpoTerm.Builder newBuilder(Gel_BioInf_Models.HpoTerm other) {
    return new Gel_BioInf_Models.HpoTerm.Builder(other);
  }
  
  /**
   * RecordBuilder for HpoTerm instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HpoTerm>
    implements org.apache.avro.data.RecordBuilder<HpoTerm> {

    private java.lang.String term;
    private boolean termPresence;
    private java.util.Map<java.lang.String,java.lang.String> modifiers;
    private java.lang.Integer ageOfOnset;

    /** Creates a new Builder */
    private Builder() {
      super(Gel_BioInf_Models.HpoTerm.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(Gel_BioInf_Models.HpoTerm.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.term)) {
        this.term = data().deepCopy(fields()[0].schema(), other.term);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.termPresence)) {
        this.termPresence = data().deepCopy(fields()[1].schema(), other.termPresence);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.modifiers)) {
        this.modifiers = data().deepCopy(fields()[2].schema(), other.modifiers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ageOfOnset)) {
        this.ageOfOnset = data().deepCopy(fields()[3].schema(), other.ageOfOnset);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing HpoTerm instance */
    private Builder(Gel_BioInf_Models.HpoTerm other) {
            super(Gel_BioInf_Models.HpoTerm.SCHEMA$);
      if (isValidValue(fields()[0], other.term)) {
        this.term = data().deepCopy(fields()[0].schema(), other.term);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.termPresence)) {
        this.termPresence = data().deepCopy(fields()[1].schema(), other.termPresence);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.modifiers)) {
        this.modifiers = data().deepCopy(fields()[2].schema(), other.modifiers);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ageOfOnset)) {
        this.ageOfOnset = data().deepCopy(fields()[3].schema(), other.ageOfOnset);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'term' field */
    public java.lang.String getTerm() {
      return term;
    }
    
    /** Sets the value of the 'term' field */
    public Gel_BioInf_Models.HpoTerm.Builder setTerm(java.lang.String value) {
      validate(fields()[0], value);
      this.term = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'term' field has been set */
    public boolean hasTerm() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'term' field */
    public Gel_BioInf_Models.HpoTerm.Builder clearTerm() {
      term = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'termPresence' field */
    public java.lang.Boolean getTermPresence() {
      return termPresence;
    }
    
    /** Sets the value of the 'termPresence' field */
    public Gel_BioInf_Models.HpoTerm.Builder setTermPresence(boolean value) {
      validate(fields()[1], value);
      this.termPresence = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'termPresence' field has been set */
    public boolean hasTermPresence() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'termPresence' field */
    public Gel_BioInf_Models.HpoTerm.Builder clearTermPresence() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'modifiers' field */
    public java.util.Map<java.lang.String,java.lang.String> getModifiers() {
      return modifiers;
    }
    
    /** Sets the value of the 'modifiers' field */
    public Gel_BioInf_Models.HpoTerm.Builder setModifiers(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[2], value);
      this.modifiers = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'modifiers' field has been set */
    public boolean hasModifiers() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'modifiers' field */
    public Gel_BioInf_Models.HpoTerm.Builder clearModifiers() {
      modifiers = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ageOfOnset' field */
    public java.lang.Integer getAgeOfOnset() {
      return ageOfOnset;
    }
    
    /** Sets the value of the 'ageOfOnset' field */
    public Gel_BioInf_Models.HpoTerm.Builder setAgeOfOnset(java.lang.Integer value) {
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
    public Gel_BioInf_Models.HpoTerm.Builder clearAgeOfOnset() {
      ageOfOnset = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public HpoTerm build() {
      try {
        HpoTerm record = new HpoTerm();
        record.term = fieldSetFlags()[0] ? this.term : (java.lang.String) defaultValue(fields()[0]);
        record.termPresence = fieldSetFlags()[1] ? this.termPresence : (java.lang.Boolean) defaultValue(fields()[1]);
        record.modifiers = fieldSetFlags()[2] ? this.modifiers : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[2]);
        record.ageOfOnset = fieldSetFlags()[3] ? this.ageOfOnset : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
