/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.targeting;
/*
 *
 * Copyright 2013 LinkedIn Corp. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/


@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$lix_target. Generated at Jul 02, 2012 07:15:41 PM PDT */
public class LixTarget_V1 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"LixTarget_V1\",\"namespace\":\"com.linkedin.events.targeting\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"id\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ID;dbFieldPosition=2;\"},{\"name\":\"targetid\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TARGETID;dbFieldPosition=3;\"},{\"name\":\"testkey\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=TESTKEY;dbFieldPosition=4;\"},{\"name\":\"hashid\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=HASHID;dbFieldPosition=5;\"},{\"name\":\"dsl\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DSL;dbFieldPosition=6;\"},{\"name\":\"defaultTreatment\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DEFAULT_TREATMENT;dbFieldPosition=7;\"},{\"name\":\"state\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=STATE;dbFieldPosition=8;\"},{\"name\":\"tracking\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=TRACKING;dbFieldPosition=9;\"},{\"name\":\"services\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SERVICES;dbFieldPosition=10;\"},{\"name\":\"lastModified\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=LAST_MODIFIED;dbFieldPosition=11;\"},{\"name\":\"activatedBy\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVATED_BY;dbFieldPosition=12;\"},{\"name\":\"activatedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ACTIVATED_DATE;dbFieldPosition=13;\"},{\"name\":\"terminatedBy\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=TERMINATED_BY;dbFieldPosition=14;\"},{\"name\":\"terminatedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TERMINATED_DATE;dbFieldPosition=15;\"}],\"meta\":\"dbFieldName=sy$lix_target;pk=key;\"}");
  public java.lang.Long txn;
  public java.lang.Long key;
  public java.lang.Long id;
  public java.lang.Long targetid;
  public java.lang.CharSequence testkey;
  public java.lang.Long hashid;
  public java.lang.CharSequence dsl;
  public java.lang.CharSequence defaultTreatment;
  public java.lang.CharSequence state;
  public java.lang.CharSequence tracking;
  public java.lang.CharSequence services;
  public java.lang.Long lastModified;
  public java.lang.CharSequence activatedBy;
  public java.lang.Long activatedDate;
  public java.lang.CharSequence terminatedBy;
  public java.lang.Long terminatedDate;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return id;
    case 3: return targetid;
    case 4: return testkey;
    case 5: return hashid;
    case 6: return dsl;
    case 7: return defaultTreatment;
    case 8: return state;
    case 9: return tracking;
    case 10: return services;
    case 11: return lastModified;
    case 12: return activatedBy;
    case 13: return activatedDate;
    case 14: return terminatedBy;
    case 15: return terminatedDate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.Long)value$; break;
    case 2: id = (java.lang.Long)value$; break;
    case 3: targetid = (java.lang.Long)value$; break;
    case 4: testkey = (java.lang.CharSequence)value$; break;
    case 5: hashid = (java.lang.Long)value$; break;
    case 6: dsl = (java.lang.CharSequence)value$; break;
    case 7: defaultTreatment = (java.lang.CharSequence)value$; break;
    case 8: state = (java.lang.CharSequence)value$; break;
    case 9: tracking = (java.lang.CharSequence)value$; break;
    case 10: services = (java.lang.CharSequence)value$; break;
    case 11: lastModified = (java.lang.Long)value$; break;
    case 12: activatedBy = (java.lang.CharSequence)value$; break;
    case 13: activatedDate = (java.lang.Long)value$; break;
    case 14: terminatedBy = (java.lang.CharSequence)value$; break;
    case 15: terminatedDate = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
