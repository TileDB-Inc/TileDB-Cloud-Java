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


import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of a task graph. 
 */
@JsonAdapter(TaskGraphType.Adapter.class)
public enum TaskGraphType {
  
  BATCH("batch"),
  
  REALTIME("realtime"),
  
  NEXTFLOW("nextflow");

  private String value;

  TaskGraphType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskGraphType fromValue(String value) {
    for (TaskGraphType b : TaskGraphType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TaskGraphType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskGraphType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskGraphType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskGraphType.fromValue(value);
    }
  }
}

