/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.following;

@SuppressWarnings("all")
/** Auto-generated Avro schema for following.SY$FOLLOW_ATTR. Generated at Nov 21, 2011 07:17:18 PM PST */
public class FollowAttr_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"FollowAttr_V1\",\"namespace\":\"com.linkedin.events.following\",\"fields\":[{\"name\":\"txn\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"id\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ID;dbFieldPosition=1;\"},{\"name\":\"followId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=FOLLOW_ID;dbFieldPosition=2;\"},{\"name\":\"key\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=3;\"},{\"name\":\"value\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=VALUE;dbFieldPosition=4;\"},{\"name\":\"status\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATUS;dbFieldPosition=5;\"}],\"meta\":\"dbFieldName=following.SY$FOLLOW_ATTR;\"}");
  public java.lang.Integer txn;
  public java.lang.CharSequence id;
  public java.lang.Integer followId;
  public java.lang.CharSequence key;
  public java.lang.CharSequence value;
  public java.lang.CharSequence status;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return id;
    case 2: return followId;
    case 3: return key;
    case 4: return value;
    case 5: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Integer)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: followId = (java.lang.Integer)value$; break;
    case 3: key = (java.lang.CharSequence)value$; break;
    case 4: value = (java.lang.CharSequence)value$; break;
    case 5: status = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}