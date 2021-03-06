/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.2.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * TileDB data type
 */
@JsonAdapter(Datatype.Adapter.class)
public enum Datatype {
  
  INT32("INT32"),
  
  INT64("INT64"),
  
  FLOAT32("FLOAT32"),
  
  FLOAT64("FLOAT64"),
  
  CHAR("CHAR"),
  
  INT8("INT8"),
  
  UINT8("UINT8"),
  
  INT16("INT16"),
  
  UINT16("UINT16"),
  
  UINT32("UINT32"),
  
  UINT64("UINT64"),
  
  STRING_ASCII("STRING_ASCII"),
  
  STRING_UTF8("STRING_UTF8"),
  
  STRING_UTF16("STRING_UTF16"),
  
  STRING_UTF32("STRING_UTF32"),
  
  STRING_UCS2("STRING_UCS2"),
  
  STRING_UCS4("STRING_UCS4"),
  
  ANY("ANY");

  private String value;

  Datatype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Datatype fromValue(String value) {
    for (Datatype b : Datatype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Datatype> {
    @Override
    public void write(final JsonWriter jsonWriter, final Datatype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Datatype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Datatype.fromValue(value);
    }
  }
}

