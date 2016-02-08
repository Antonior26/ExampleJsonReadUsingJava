/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package Gel_BioInf_Models;  
@SuppressWarnings("all")
/** This is the list of ethnics in ONS16

* `D`:  Mixed: White and Black Caribbean
* `E`:  Mixed: White and Black African
* `F`:  Mixed: White and Asian
* `G`:  Mixed: Any other mixed background
* `A`:  White: British
* `B`:  White: Irish
* `C`:  White: Any other White background
* `L`:  Asian or Asian British: Any other Asian background
* `M`:  Black or Black British: Caribbean
* `N`:  Black or Black British: African
* `H`:  Asian or Asian British: Indian
* `J`:  Asian or Asian British: Pakistani
* `K`:  Asian or Asian British: Bangladeshi
* `P`:  Black or Black British: Any other Black background
* `S`:  Other Ethnic Groups: Any other ethnic group
* `R`:  Other Ethnic Groups: Chinese
* `Z`:  Not stated */
@org.apache.avro.specific.AvroGenerated
public enum EthnicCategory { 
  D, E, F, G, A, B, C, L, M, N, H, J, K, P, S, R, Z  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EthnicCategory\",\"namespace\":\"Gel_BioInf_Models\",\"doc\":\"This is the list of ethnics in ONS16\\n\\n* `D`:  Mixed: White and Black Caribbean\\n* `E`:  Mixed: White and Black African\\n* `F`:  Mixed: White and Asian\\n* `G`:  Mixed: Any other mixed background\\n* `A`:  White: British\\n* `B`:  White: Irish\\n* `C`:  White: Any other White background\\n* `L`:  Asian or Asian British: Any other Asian background\\n* `M`:  Black or Black British: Caribbean\\n* `N`:  Black or Black British: African\\n* `H`:  Asian or Asian British: Indian\\n* `J`:  Asian or Asian British: Pakistani\\n* `K`:  Asian or Asian British: Bangladeshi\\n* `P`:  Black or Black British: Any other Black background\\n* `S`:  Other Ethnic Groups: Any other ethnic group\\n* `R`:  Other Ethnic Groups: Chinese\\n* `Z`:  Not stated\",\"symbols\":[\"D\",\"E\",\"F\",\"G\",\"A\",\"B\",\"C\",\"L\",\"M\",\"N\",\"H\",\"J\",\"K\",\"P\",\"S\",\"R\",\"Z\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}