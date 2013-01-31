/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.leo;
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
public class databusAnswerT extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"databusAnswerT\",\"namespace\":\"com.linkedin.events.leo\",\"fields\":[{\"name\":\"answerId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ANSWER_ID;dbFieldPosition=0;\"},{\"name\":\"questionId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=QUESTION_ID;dbFieldPosition=1;\"},{\"name\":\"askerId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ASKER_ID;dbFieldPosition=2;\"},{\"name\":\"answererId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ANSWERER_ID;dbFieldPosition=3;\"},{\"name\":\"xmlVersion\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=XML_VERSION;dbFieldPosition=4;\"},{\"name\":\"good\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GOOD;dbFieldPosition=5;\"},{\"name\":\"best\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=BEST;dbFieldPosition=6;\"},{\"name\":\"withdrawn\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=WITHDRAWN;dbFieldPosition=7;\"},{\"name\":\"hiddenByCs\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HIDDEN_BY_CS;dbFieldPosition=8;\"},{\"name\":\"answererAccountClosed\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ANSWERER_ACCOUNT_CLOSED;dbFieldPosition=9;\"},{\"name\":\"abuseLevel\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=ABUSE_LEVEL;dbFieldPosition=10;\"},{\"name\":\"createDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATE_DATE;dbFieldPosition=11;\"},{\"name\":\"modifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MODIFIED_DATE;dbFieldPosition=12;\"},{\"name\":\"type\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=TYPE;dbFieldPosition=13;\"},{\"name\":\"answerLevel\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ANSWER_LEVEL;dbFieldPosition=14;\"},{\"name\":\"details\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DETAILS;dbFieldPosition=15;\"},{\"name\":\"hiddenByUsers\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HIDDEN_BY_USERS;dbFieldPosition=16;\"},{\"name\":\"celebrityType\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CELEBRITY_TYPE;dbFieldPosition=17;\"}],\"meta\":\"dbFieldName=ANSWERS;dbFieldPosition=23;\"}");
  public java.lang.Integer answerId;
  public java.lang.Integer questionId;
  public java.lang.Integer askerId;
  public java.lang.Integer answererId;
  public java.lang.Integer xmlVersion;
  public java.lang.CharSequence good;
  public java.lang.Integer best;
  public java.lang.CharSequence withdrawn;
  public java.lang.CharSequence hiddenByCs;
  public java.lang.CharSequence answererAccountClosed;
  public java.lang.Integer abuseLevel;
  public java.lang.Long createDate;
  public java.lang.Long modifiedDate;
  public java.lang.CharSequence type;
  public java.lang.CharSequence answerLevel;
  public java.lang.CharSequence details;
  public java.lang.CharSequence hiddenByUsers;
  public java.lang.CharSequence celebrityType;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return answerId;
    case 1: return questionId;
    case 2: return askerId;
    case 3: return answererId;
    case 4: return xmlVersion;
    case 5: return good;
    case 6: return best;
    case 7: return withdrawn;
    case 8: return hiddenByCs;
    case 9: return answererAccountClosed;
    case 10: return abuseLevel;
    case 11: return createDate;
    case 12: return modifiedDate;
    case 13: return type;
    case 14: return answerLevel;
    case 15: return details;
    case 16: return hiddenByUsers;
    case 17: return celebrityType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: answerId = (java.lang.Integer)value$; break;
    case 1: questionId = (java.lang.Integer)value$; break;
    case 2: askerId = (java.lang.Integer)value$; break;
    case 3: answererId = (java.lang.Integer)value$; break;
    case 4: xmlVersion = (java.lang.Integer)value$; break;
    case 5: good = (java.lang.CharSequence)value$; break;
    case 6: best = (java.lang.Integer)value$; break;
    case 7: withdrawn = (java.lang.CharSequence)value$; break;
    case 8: hiddenByCs = (java.lang.CharSequence)value$; break;
    case 9: answererAccountClosed = (java.lang.CharSequence)value$; break;
    case 10: abuseLevel = (java.lang.Integer)value$; break;
    case 11: createDate = (java.lang.Long)value$; break;
    case 12: modifiedDate = (java.lang.Long)value$; break;
    case 13: type = (java.lang.CharSequence)value$; break;
    case 14: answerLevel = (java.lang.CharSequence)value$; break;
    case 15: details = (java.lang.CharSequence)value$; break;
    case 16: hiddenByUsers = (java.lang.CharSequence)value$; break;
    case 17: celebrityType = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
