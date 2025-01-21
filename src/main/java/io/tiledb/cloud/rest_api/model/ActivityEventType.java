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
 * Type of activity logged
 */
@JsonAdapter(ActivityEventType.Adapter.class)
public enum ActivityEventType {
  
  READ_SCHEMA("read_schema"),
  
  MAX_BUFFER_SIZES("max_buffer_sizes"),
  
  NON_EMPTY_DOMAIN("non_empty_domain"),
  
  QUERY_READ("query_read"),
  
  QUERY_WRITE("query_write"),
  
  QUERY_DELETE("query_delete"),
  
  CREATE("create"),
  
  DELETE("delete"),
  
  REGISTER("register"),
  
  DEREGISTER("deregister"),
  
  UDF("udf"),
  
  ARRAY_METADATA_GET("array_metadata_get"),
  
  ARRAY_METADATA_UPDATE("array_metadata_update"),
  
  ESTIMATED_RESULT_SIZES("estimated_result_sizes"),
  
  READ_FRAGMENT_INFO("read_fragment_info"),
  
  READ_ENUMERATIONS("read_enumerations");

  private String value;

  ActivityEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityEventType fromValue(String value) {
    for (ActivityEventType b : ActivityEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityEventType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ActivityEventType.fromValue(value);
  }
}

