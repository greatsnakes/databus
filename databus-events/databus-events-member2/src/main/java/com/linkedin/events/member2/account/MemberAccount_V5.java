/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.linkedin.events.member2.account;

@SuppressWarnings("all")
/** Auto-generated Avro schema for sy$member_account_2. Generated at Mar 02, 2012 04:52:43 PM PST */
public class MemberAccount_V5 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"MemberAccount_V5\",\"namespace\":\"com.linkedin.events.member2.account\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"memberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MEMBER_ID;dbFieldPosition=2;\"},{\"name\":\"createdDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=CREATED_DATE;dbFieldPosition=3;\"},{\"name\":\"modifiedDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=MODIFIED_DATE;dbFieldPosition=4;\"},{\"name\":\"loginAuthKey\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LOGIN_AUTH_KEY;dbFieldPosition=5;\"},{\"name\":\"passwordHash\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=PASSWORD_HASH;dbFieldPosition=6;\"},{\"name\":\"isActive\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_ACTIVE;dbFieldPosition=7;\"},{\"name\":\"linkedinGenerationNum\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=LINKEDIN_GENERATION_NUM;dbFieldPosition=8;\"},{\"name\":\"industryId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=INDUSTRY_ID;dbFieldPosition=9;\"},{\"name\":\"registrationDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=REGISTRATION_DATE;dbFieldPosition=10;\"},{\"name\":\"registrationFirstName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=REGISTRATION_FIRST_NAME;dbFieldPosition=11;\"},{\"name\":\"registrationLastName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=REGISTRATION_LAST_NAME;dbFieldPosition=12;\"},{\"name\":\"registrationMaidenName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=REGISTRATION_MAIDEN_NAME;dbFieldPosition=13;\"},{\"name\":\"subscriberLevel\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=SUBSCRIBER_LEVEL;dbFieldPosition=14;\"},{\"name\":\"subscriberUntil\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=SUBSCRIBER_UNTIL;dbFieldPosition=15;\"},{\"name\":\"inviterMemberId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=INVITER_MEMBER_ID;dbFieldPosition=16;\"},{\"name\":\"joinIp\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=JOIN_IP;dbFieldPosition=17;\"},{\"name\":\"userCategory\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=USER_CATEGORY;dbFieldPosition=18;\"},{\"name\":\"cobrandGroupId\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=COBRAND_GROUP_ID;dbFieldPosition=19;\"},{\"name\":\"cpaCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CPA_CODE;dbFieldPosition=20;\"},{\"name\":\"countryCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=COUNTRY_CODE;dbFieldPosition=21;\"},{\"name\":\"postalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=POSTAL_CODE;dbFieldPosition=22;\"},{\"name\":\"geoPostalCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_POSTAL_CODE;dbFieldPosition=23;\"},{\"name\":\"geoPlaceCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_CODE;dbFieldPosition=24;\"},{\"name\":\"latitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LATITUDE_DEG;dbFieldPosition=25;\"},{\"name\":\"longitudeDeg\",\"type\":[\"float\",\"null\"],\"meta\":\"dbFieldName=LONGITUDE_DEG;dbFieldPosition=26;\"},{\"name\":\"regionCode\",\"type\":[\"int\",\"null\"],\"meta\":\"dbFieldName=REGION_CODE;dbFieldPosition=27;\"},{\"name\":\"gmtOffset\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=GMT_OFFSET;dbFieldPosition=28;\"},{\"name\":\"usesDaylightSavings\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=USES_DAYLIGHT_SAVINGS;dbFieldPosition=29;\"},{\"name\":\"city\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=CITY;dbFieldPosition=30;\"},{\"name\":\"geoPlaceMaskCode\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=GEO_PLACE_MASK_CODE;dbFieldPosition=31;\"},{\"name\":\"defaultLocale\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DEFAULT_LOCALE;dbFieldPosition=32;\"},{\"name\":\"isPurged\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=IS_PURGED;dbFieldPosition=33;\"}],\"meta\":\"dbFieldName=sy$member_account_2;\"}");
  public java.lang.Long txn;
  public java.lang.Long key;
  public java.lang.Long memberId;
  public java.lang.Long createdDate;
  public java.lang.Long modifiedDate;
  public java.lang.CharSequence loginAuthKey;
  public java.lang.CharSequence passwordHash;
  public java.lang.CharSequence isActive;
  public java.lang.Long linkedinGenerationNum;
  public java.lang.Long industryId;
  public java.lang.Long registrationDate;
  public java.lang.CharSequence registrationFirstName;
  public java.lang.CharSequence registrationLastName;
  public java.lang.CharSequence registrationMaidenName;
  public java.lang.Long subscriberLevel;
  public java.lang.Long subscriberUntil;
  public java.lang.Long inviterMemberId;
  public java.lang.CharSequence joinIp;
  public java.lang.Long userCategory;
  public java.lang.Long cobrandGroupId;
  public java.lang.CharSequence cpaCode;
  public java.lang.CharSequence countryCode;
  public java.lang.CharSequence postalCode;
  public java.lang.CharSequence geoPostalCode;
  public java.lang.CharSequence geoPlaceCode;
  public java.lang.Float latitudeDeg;
  public java.lang.Float longitudeDeg;
  public java.lang.Integer regionCode;
  public java.lang.Long gmtOffset;
  public java.lang.CharSequence usesDaylightSavings;
  public java.lang.CharSequence city;
  public java.lang.CharSequence geoPlaceMaskCode;
  public java.lang.CharSequence defaultLocale;
  public java.lang.CharSequence isPurged;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return txn;
    case 1: return key;
    case 2: return memberId;
    case 3: return createdDate;
    case 4: return modifiedDate;
    case 5: return loginAuthKey;
    case 6: return passwordHash;
    case 7: return isActive;
    case 8: return linkedinGenerationNum;
    case 9: return industryId;
    case 10: return registrationDate;
    case 11: return registrationFirstName;
    case 12: return registrationLastName;
    case 13: return registrationMaidenName;
    case 14: return subscriberLevel;
    case 15: return subscriberUntil;
    case 16: return inviterMemberId;
    case 17: return joinIp;
    case 18: return userCategory;
    case 19: return cobrandGroupId;
    case 20: return cpaCode;
    case 21: return countryCode;
    case 22: return postalCode;
    case 23: return geoPostalCode;
    case 24: return geoPlaceCode;
    case 25: return latitudeDeg;
    case 26: return longitudeDeg;
    case 27: return regionCode;
    case 28: return gmtOffset;
    case 29: return usesDaylightSavings;
    case 30: return city;
    case 31: return geoPlaceMaskCode;
    case 32: return defaultLocale;
    case 33: return isPurged;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: txn = (java.lang.Long)value$; break;
    case 1: key = (java.lang.Long)value$; break;
    case 2: memberId = (java.lang.Long)value$; break;
    case 3: createdDate = (java.lang.Long)value$; break;
    case 4: modifiedDate = (java.lang.Long)value$; break;
    case 5: loginAuthKey = (java.lang.CharSequence)value$; break;
    case 6: passwordHash = (java.lang.CharSequence)value$; break;
    case 7: isActive = (java.lang.CharSequence)value$; break;
    case 8: linkedinGenerationNum = (java.lang.Long)value$; break;
    case 9: industryId = (java.lang.Long)value$; break;
    case 10: registrationDate = (java.lang.Long)value$; break;
    case 11: registrationFirstName = (java.lang.CharSequence)value$; break;
    case 12: registrationLastName = (java.lang.CharSequence)value$; break;
    case 13: registrationMaidenName = (java.lang.CharSequence)value$; break;
    case 14: subscriberLevel = (java.lang.Long)value$; break;
    case 15: subscriberUntil = (java.lang.Long)value$; break;
    case 16: inviterMemberId = (java.lang.Long)value$; break;
    case 17: joinIp = (java.lang.CharSequence)value$; break;
    case 18: userCategory = (java.lang.Long)value$; break;
    case 19: cobrandGroupId = (java.lang.Long)value$; break;
    case 20: cpaCode = (java.lang.CharSequence)value$; break;
    case 21: countryCode = (java.lang.CharSequence)value$; break;
    case 22: postalCode = (java.lang.CharSequence)value$; break;
    case 23: geoPostalCode = (java.lang.CharSequence)value$; break;
    case 24: geoPlaceCode = (java.lang.CharSequence)value$; break;
    case 25: latitudeDeg = (java.lang.Float)value$; break;
    case 26: longitudeDeg = (java.lang.Float)value$; break;
    case 27: regionCode = (java.lang.Integer)value$; break;
    case 28: gmtOffset = (java.lang.Long)value$; break;
    case 29: usesDaylightSavings = (java.lang.CharSequence)value$; break;
    case 30: city = (java.lang.CharSequence)value$; break;
    case 31: geoPlaceMaskCode = (java.lang.CharSequence)value$; break;
    case 32: defaultLocale = (java.lang.CharSequence)value$; break;
    case 33: isPurged = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}