/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.member2.searchprofile;
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
public class databusProfEduT extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"databusProfEduT\",\"namespace\":\"com.linkedin.events.member2.searchprofile\",\"fields\":[{\"name\":\"profileEducationId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=PROFILE_EDUCATION_ID;dbFieldPosition=0;\"},{\"name\":\"memberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=1;\"},{\"name\":\"createdDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_DATE;dbFieldPosition=2;\"},{\"name\":\"modifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MODIFIED_DATE;dbFieldPosition=3;\"},{\"name\":\"xmlSchemaVersion\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=XML_SCHEMA_VERSION;dbFieldPosition=4;\"},{\"name\":\"startMonthyear\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=START_MONTHYEAR;dbFieldPosition=5;\"},{\"name\":\"endMonthyear\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=END_MONTHYEAR;dbFieldPosition=6;\"},{\"name\":\"schoolId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=SCHOOL_ID;dbFieldPosition=7;\"},{\"name\":\"countryCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COUNTRY_CODE;dbFieldPosition=8;\"},{\"name\":\"provinceCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PROVINCE_CODE;dbFieldPosition=9;\"},{\"name\":\"xmlContent\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=XML_CONTENT;dbFieldPosition=10;\"}],\"meta\":\"dbFieldName=PROF_EDUCATIONS;dbFieldPosition=17;\"}");
  public java.lang.Long profileEducationId;
  public java.lang.Long memberId;
  public java.lang.Long createdDate;
  public java.lang.Long modifiedDate;
  public java.lang.Long xmlSchemaVersion;
  public java.lang.Long startMonthyear;
  public java.lang.Long endMonthyear;
  public java.lang.Long schoolId;
  public java.lang.CharSequence countryCode;
  public java.lang.CharSequence provinceCode;
  public java.lang.CharSequence xmlContent;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return profileEducationId;
    case 1: return memberId;
    case 2: return createdDate;
    case 3: return modifiedDate;
    case 4: return xmlSchemaVersion;
    case 5: return startMonthyear;
    case 6: return endMonthyear;
    case 7: return schoolId;
    case 8: return countryCode;
    case 9: return provinceCode;
    case 10: return xmlContent;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: profileEducationId = (java.lang.Long)value$; break;
    case 1: memberId = (java.lang.Long)value$; break;
    case 2: createdDate = (java.lang.Long)value$; break;
    case 3: modifiedDate = (java.lang.Long)value$; break;
    case 4: xmlSchemaVersion = (java.lang.Long)value$; break;
    case 5: startMonthyear = (java.lang.Long)value$; break;
    case 6: endMonthyear = (java.lang.Long)value$; break;
    case 7: schoolId = (java.lang.Long)value$; break;
    case 8: countryCode = (java.lang.CharSequence)value$; break;
    case 9: provinceCode = (java.lang.CharSequence)value$; break;
    case 10: xmlContent = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
