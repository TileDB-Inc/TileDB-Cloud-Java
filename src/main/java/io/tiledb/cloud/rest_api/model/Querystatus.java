/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.17.51
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of query
 */
@JsonAdapter(Querystatus.Adapter.class)
public enum Querystatus {
  
  FAILED("FAILED"),
  
  COMPLETED("COMPLETED"),
  
  INPROGRESS("INPROGRESS"),
  
  INCOMPLETE("INCOMPLETE"),
  
  UNINITIALIZED("UNINITIALIZED");

  private String value;

  Querystatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Querystatus fromValue(String value) {
    for (Querystatus b : Querystatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Querystatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final Querystatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Querystatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Querystatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Querystatus.fromValue(value);
  }
}

