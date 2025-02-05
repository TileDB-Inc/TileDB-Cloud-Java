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
 * Interval for pricing
 */
@JsonAdapter(PricingInterval.Adapter.class)
public enum PricingInterval {
  
  MONTH("month");

  private String value;

  PricingInterval(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricingInterval fromValue(String value) {
    for (PricingInterval b : PricingInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricingInterval> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricingInterval enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricingInterval read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricingInterval.fromValue(value);
    }
  }
}

