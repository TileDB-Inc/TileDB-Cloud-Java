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
 * File types represented as TileDB arrays
 */
@JsonAdapter(FileType.Adapter.class)
public enum FileType {
  
  NOTEBOOK("notebook"),
  
  USER_DEFINED_FUNCTION("user_defined_function"),
  
  ML_MODEL("ml_model"),
  
  FILE("file"),
  
  REGISTERED_TASK_GRAPH("registered_task_graph");

  private String value;

  FileType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileType fromValue(String value) {
    for (FileType b : FileType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FileType.fromValue(value);
  }
}

