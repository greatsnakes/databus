/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.company;

@SuppressWarnings("all")
public class COMPANY_LOCATIONS_T extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"COMPANY_LOCATIONS_T\",\"namespace\":\"com.linkedin.events.company\",\"fields\":[{\"name\":\"companyLocations\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"companyLocationT\",\"fields\":[{\"name\":\"crudType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CRUD_TYPE;dbFieldPosition=0;\"},{\"name\":\"companyLocationId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_LOCATION_ID;dbFieldPosition=1;\"},{\"name\":\"companyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_ID;dbFieldPosition=2;\"},{\"name\":\"street1\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STREET1;dbFieldPosition=3;\"},{\"name\":\"street2\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STREET2;dbFieldPosition=4;\"},{\"name\":\"city\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CITY;dbFieldPosition=5;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=6;\"},{\"name\":\"postalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=POSTAL_CODE;dbFieldPosition=7;\"},{\"name\":\"countryCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COUNTRY_CODE;dbFieldPosition=8;\"},{\"name\":\"regionCode\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=REGION_CODE;dbFieldPosition=9;\"},{\"name\":\"phone1\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PHONE1;dbFieldPosition=10;\"},{\"name\":\"phone2\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PHONE2;dbFieldPosition=11;\"},{\"name\":\"fax\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=FAX;dbFieldPosition=12;\"},{\"name\":\"hq\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=HQ;dbFieldPosition=13;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=14;\"},{\"name\":\"description\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DESCRIPTION;dbFieldPosition=15;\"},{\"name\":\"locationSize\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=LOCATION_SIZE;dbFieldPosition=16;\"}],\"meta\":\"dbFieldName=COMPANY_LOCATIONS;dbFieldPosition=0;\"}}}]}");
  public java.util.List<com.linkedin.events.company.companyLocationT> companyLocations;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return companyLocations;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: companyLocations = (java.util.List<com.linkedin.events.company.companyLocationT>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}