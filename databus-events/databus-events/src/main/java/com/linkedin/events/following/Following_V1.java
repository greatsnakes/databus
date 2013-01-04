/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.following;

@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$following. Generated at Dec 12, 2012 06:24:13 PM PST */
public class Following_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Following_V1\",\"namespace\":\"com.linkedin.events.following\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"followingId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=FOLLOWING_ID;dbFieldPosition=1;\"},{\"name\":\"followerMemberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=FOLLOWER_MEMBER_ID;dbFieldPosition=2;\"},{\"name\":\"followeeMemberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=FOLLOWEE_MEMBER_ID;dbFieldPosition=3;\"},{\"name\":\"isActive\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_ACTIVE;dbFieldPosition=4;\"},{\"name\":\"sendEmail\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SEND_EMAIL;dbFieldPosition=5;\"},{\"name\":\"createDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATE_DATE;dbFieldPosition=6;\"},{\"name\":\"modifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MODIFIED_DATE;dbFieldPosition=7;\"}],\"meta\":\"dbFieldName=sy$following;pk=followingId;\"}");
  public java.lang.Long txn;
  public java.lang.Long followingId;
  public java.lang.Long followerMemberId;
  public java.lang.Long followeeMemberId;
  public java.lang.CharSequence isActive;
  public java.lang.CharSequence sendEmail;
  public java.lang.Long createDate;
  public java.lang.Long modifiedDate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return followingId;
    case 2: return followerMemberId;
    case 3: return followeeMemberId;
    case 4: return isActive;
    case 5: return sendEmail;
    case 6: return createDate;
    case 7: return modifiedDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: followingId = (java.lang.Long)value$; break;
    case 2: followerMemberId = (java.lang.Long)value$; break;
    case 3: followeeMemberId = (java.lang.Long)value$; break;
    case 4: isActive = (java.lang.CharSequence)value$; break;
    case 5: sendEmail = (java.lang.CharSequence)value$; break;
    case 6: createDate = (java.lang.Long)value$; break;
    case 7: modifiedDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
