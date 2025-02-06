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


package io.tiledb.cloud.rest_api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * TileDB filter option
 */
@JsonAdapter(FilterOption.Adapter.class)
public enum FilterOption {
  
  COMPRESSION_LEVEL("COMPRESSION_LEVEL"),
  
  BIT_WIDTH_MAX_WINDOW("BIT_WIDTH_MAX_WINDOW"),
  
  POSITIVE_DELTA_MAX_WINDOW("POSITIVE_DELTA_MAX_WINDOW");

  private String value;

  FilterOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilterOption fromValue(String value) {
    for (FilterOption b : FilterOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FilterOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final FilterOption enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FilterOption read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FilterOption.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FilterOption.fromValue(value);
  }
}

