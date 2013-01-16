/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.entitlements;

@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$entitlements. Generated at Oct 15, 2012 03:56:20 PM PDT */
public class Entitlements_V2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Entitlements_V2\",\"namespace\":\"com.linkedin.events.entitlements\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"entityType\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ENTITY_TYPE;dbFieldPosition=2;\"},{\"name\":\"entityId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ENTITY_ID;dbFieldPosition=3;\"},{\"name\":\"entitlements\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ENTITLEMENTS;dbFieldPosition=4;\"},{\"name\":\"version\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=VERSION;dbFieldPosition=5;\"},{\"name\":\"createdOn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_ON;dbFieldPosition=6;\"},{\"name\":\"lastModified\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=LAST_MODIFIED;dbFieldPosition=7;\"},{\"name\":\"updateCount\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=UPDATE_COUNT;dbFieldPosition=8;\"}],\"meta\":\"dbFieldName=sy$entitlements;\"}");
  public java.lang.Long txn;
  public java.lang.CharSequence key;
  public java.lang.Long entityType;
  public java.lang.Long entityId;
  public java.lang.CharSequence entitlements;
  public java.lang.Long version;
  public java.lang.Long createdOn;
  public java.lang.Long lastModified;
  public java.lang.Long updateCount;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return entityType;
    case 3: return entityId;
    case 4: return entitlements;
    case 5: return version;
    case 6: return createdOn;
    case 7: return lastModified;
    case 8: return updateCount;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.CharSequence)value$; break;
    case 2: entityType = (java.lang.Long)value$; break;
    case 3: entityId = (java.lang.Long)value$; break;
    case 4: entitlements = (java.lang.CharSequence)value$; break;
    case 5: version = (java.lang.Long)value$; break;
    case 6: createdOn = (java.lang.Long)value$; break;
    case 7: lastModified = (java.lang.Long)value$; break;
    case 8: updateCount = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}