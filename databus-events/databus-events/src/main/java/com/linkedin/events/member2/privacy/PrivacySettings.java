/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.member2.privacy;
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
/** Auto-generated Avro schema for SY$PRIVACY_SETTINGS_104. Generated at Jun 28, 2011 01:39:56 PM PDT */
public class PrivacySettings extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"PrivacySettings\",\"namespace\":\"com.linkedin.events.member2.privacy\",\"fields\":[{\"name\":\"txn\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"memberId\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=2;\"},{\"name\":\"lastNamePreference\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LAST_NAME_PREFERENCE;dbFieldPosition=3;\"},{\"name\":\"displayWebProfile\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DISPLAY_WEB_PROFILE;dbFieldPosition=4;\"},{\"name\":\"webProfileSettings\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=WEB_PROFILE_SETTINGS;dbFieldPosition=5;\"},{\"name\":\"proposalAccepts\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=PROPOSAL_ACCEPTS;dbFieldPosition=6;\"},{\"name\":\"locationAccepts\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LOCATION_ACCEPTS;dbFieldPosition=7;\"},{\"name\":\"allowConnectionsBrowse\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ALLOW_CONNECTIONS_BROWSE;dbFieldPosition=8;\"},{\"name\":\"requireReferral\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=REQUIRE_REFERRAL;dbFieldPosition=9;\"},{\"name\":\"showSubscriberIcon\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SHOW_SUBSCRIBER_ICON;dbFieldPosition=10;\"},{\"name\":\"allowOpenlinkReq\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ALLOW_OPENLINK_REQ;dbFieldPosition=11;\"},{\"name\":\"allowOpenlinkSearch\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=ALLOW_OPENLINK_SEARCH;dbFieldPosition=12;\"},{\"name\":\"excludeFromSprDir\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=EXCLUDE_FROM_SPR_DIR;dbFieldPosition=13;\"},{\"name\":\"hideQaOnProfile\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=HIDE_QA_ON_PROFILE;dbFieldPosition=14;\"},{\"name\":\"discloseAsProfileViewer\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DISCLOSE_AS_PROFILE_VIEWER;dbFieldPosition=15;\"},{\"name\":\"memberPicture\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_PICTURE;dbFieldPosition=16;\"},{\"name\":\"memberStatus\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_STATUS;dbFieldPosition=17;\"},{\"name\":\"memberFeed\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=MEMBER_FEED;dbFieldPosition=18;\"},{\"name\":\"jobSeekerSetting\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=JOB_SEEKER_SETTING;dbFieldPosition=19;\"},{\"name\":\"showGeoPlace\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=SHOW_GEO_PLACE;dbFieldPosition=20;\"}],\"meta\":\"dbFieldName=SY$PRIVACY_SETTINGS_104;\"}");
  public java.lang.Integer txn;
  public java.lang.Integer key;
  public java.lang.Integer memberId;
  public java.lang.CharSequence lastNamePreference;
  public java.lang.CharSequence displayWebProfile;
  public java.lang.Integer webProfileSettings;
  public java.lang.Integer proposalAccepts;
  public java.lang.CharSequence locationAccepts;
  public java.lang.CharSequence allowConnectionsBrowse;
  public java.lang.CharSequence requireReferral;
  public java.lang.CharSequence showSubscriberIcon;
  public java.lang.CharSequence allowOpenlinkReq;
  public java.lang.CharSequence allowOpenlinkSearch;
  public java.lang.CharSequence excludeFromSprDir;
  public java.lang.CharSequence hideQaOnProfile;
  public java.lang.CharSequence discloseAsProfileViewer;
  public java.lang.CharSequence memberPicture;
  public java.lang.CharSequence memberStatus;
  public java.lang.CharSequence memberFeed;
  public java.lang.CharSequence jobSeekerSetting;
  public java.lang.CharSequence showGeoPlace;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return memberId;
    case 3: return lastNamePreference;
    case 4: return displayWebProfile;
    case 5: return webProfileSettings;
    case 6: return proposalAccepts;
    case 7: return locationAccepts;
    case 8: return allowConnectionsBrowse;
    case 9: return requireReferral;
    case 10: return showSubscriberIcon;
    case 11: return allowOpenlinkReq;
    case 12: return allowOpenlinkSearch;
    case 13: return excludeFromSprDir;
    case 14: return hideQaOnProfile;
    case 15: return discloseAsProfileViewer;
    case 16: return memberPicture;
    case 17: return memberStatus;
    case 18: return memberFeed;
    case 19: return jobSeekerSetting;
    case 20: return showGeoPlace;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Integer)value$; break;
    case 1: key = (java.lang.Integer)value$; break;
    case 2: memberId = (java.lang.Integer)value$; break;
    case 3: lastNamePreference = (java.lang.CharSequence)value$; break;
    case 4: displayWebProfile = (java.lang.CharSequence)value$; break;
    case 5: webProfileSettings = (java.lang.Integer)value$; break;
    case 6: proposalAccepts = (java.lang.Integer)value$; break;
    case 7: locationAccepts = (java.lang.CharSequence)value$; break;
    case 8: allowConnectionsBrowse = (java.lang.CharSequence)value$; break;
    case 9: requireReferral = (java.lang.CharSequence)value$; break;
    case 10: showSubscriberIcon = (java.lang.CharSequence)value$; break;
    case 11: allowOpenlinkReq = (java.lang.CharSequence)value$; break;
    case 12: allowOpenlinkSearch = (java.lang.CharSequence)value$; break;
    case 13: excludeFromSprDir = (java.lang.CharSequence)value$; break;
    case 14: hideQaOnProfile = (java.lang.CharSequence)value$; break;
    case 15: discloseAsProfileViewer = (java.lang.CharSequence)value$; break;
    case 16: memberPicture = (java.lang.CharSequence)value$; break;
    case 17: memberStatus = (java.lang.CharSequence)value$; break;
    case 18: memberFeed = (java.lang.CharSequence)value$; break;
    case 19: jobSeekerSetting = (java.lang.CharSequence)value$; break;
    case 20: showGeoPlace = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
