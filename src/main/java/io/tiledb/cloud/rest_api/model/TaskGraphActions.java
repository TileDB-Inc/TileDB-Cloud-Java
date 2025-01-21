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
 * actions a user can take on a UDF
 */
@JsonAdapter(TaskGraphActions.Adapter.class)
public enum TaskGraphActions {
  
  FETCH_TASK_GRAPH("fetch_task_graph"),
  
  SHARE_TASK_GRAPH("share_task_graph");

  private String value;

  TaskGraphActions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskGraphActions fromValue(String value) {
    for (TaskGraphActions b : TaskGraphActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TaskGraphActions> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskGraphActions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskGraphActions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskGraphActions.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TaskGraphActions.fromValue(value);
  }
}

