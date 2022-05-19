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
 * Query parameter to get array metadatas
 */
@JsonAdapter(PublicShareFilter.Adapter.class)
public enum PublicShareFilter {
  
  EXCLUDE("exclude"),
  
  ONLY("only");

  private String value;

  PublicShareFilter(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PublicShareFilter fromValue(String value) {
    for (PublicShareFilter b : PublicShareFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PublicShareFilter> {
    @Override
    public void write(final JsonWriter jsonWriter, final PublicShareFilter enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PublicShareFilter read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PublicShareFilter.fromValue(value);
    }
  }
}

