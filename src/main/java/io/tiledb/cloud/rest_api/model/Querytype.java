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
 * Type of query
 */
@JsonAdapter(Querytype.Adapter.class)
public enum Querytype {
  
  READ("READ"),
  
  WRITE("WRITE"),
  
  DELETE("DELETE");

  private String value;

  Querytype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Querytype fromValue(String value) {
    for (Querytype b : Querytype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Querytype> {
    @Override
    public void write(final JsonWriter jsonWriter, final Querytype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Querytype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Querytype.fromValue(value);
    }
  }
}

