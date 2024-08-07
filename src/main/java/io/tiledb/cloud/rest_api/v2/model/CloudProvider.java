/*
 * Tiledb Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v2.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A service where data is stored or computations take place.
 */
@JsonAdapter(CloudProvider.Adapter.class)
public enum CloudProvider {
  
  AWS("AWS"),
  
  AZURE("AZURE"),
  
  GCP("GCP");

  private String value;

  CloudProvider(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CloudProvider fromValue(String value) {
    for (CloudProvider b : CloudProvider.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CloudProvider> {
    @Override
    public void write(final JsonWriter jsonWriter, final CloudProvider enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CloudProvider read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CloudProvider.fromValue(value);
    }
  }
}

