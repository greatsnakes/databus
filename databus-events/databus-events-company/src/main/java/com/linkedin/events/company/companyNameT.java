/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.company;
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
public class companyNameT extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"companyNameT\",\"namespace\":\"com.linkedin.events.company\",\"fields\":[{\"name\":\"crudType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CRUD_TYPE;dbFieldPosition=0;\"},{\"name\":\"companyNameId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_NAME_ID;dbFieldPosition=1;\"},{\"name\":\"companyId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COMPANY_ID;dbFieldPosition=2;\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=NAME;dbFieldPosition=3;\"},{\"name\":\"locale\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LOCALE;dbFieldPosition=4;\"},{\"name\":\"changesetId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CHANGESET_ID;dbFieldPosition=5;\"},{\"name\":\"nameType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=NAME_TYPE;dbFieldPosition=6;\"},{\"name\":\"active\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ACTIVE;dbFieldPosition=7;\"}],\"meta\":\"dbFieldName=COMPANY_NAMES;dbFieldPosition=0;\"}");
  public java.lang.CharSequence crudType;
  public java.lang.Long companyNameId;
  public java.lang.Long companyId;
  public java.lang.CharSequence name;
  public java.lang.CharSequence locale;
  public java.lang.Long changesetId;
  public java.lang.CharSequence nameType;
  public java.lang.CharSequence active;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return crudType;
    case 1: return companyNameId;
    case 2: return companyId;
    case 3: return name;
    case 4: return locale;
    case 5: return changesetId;
    case 6: return nameType;
    case 7: return active;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: crudType = (java.lang.CharSequence)value$; break;
    case 1: companyNameId = (java.lang.Long)value$; break;
    case 2: companyId = (java.lang.Long)value$; break;
    case 3: name = (java.lang.CharSequence)value$; break;
    case 4: locale = (java.lang.CharSequence)value$; break;
    case 5: changesetId = (java.lang.Long)value$; break;
    case 6: nameType = (java.lang.CharSequence)value$; break;
    case 7: active = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
