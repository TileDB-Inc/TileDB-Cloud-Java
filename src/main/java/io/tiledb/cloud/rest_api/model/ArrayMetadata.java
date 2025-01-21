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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ArrayMetadataEntry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * user&#39;s TileDB array metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class ArrayMetadata {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  @javax.annotation.Nullable
  private List<ArrayMetadataEntry> entries = new ArrayList<>();

  public ArrayMetadata() {
  }

  public ArrayMetadata entries(@javax.annotation.Nullable List<ArrayMetadataEntry> entries) {
    this.entries = entries;
    return this;
  }

  public ArrayMetadata addEntriesItem(ArrayMetadataEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * List of metadata entries
   * @return entries
   */
  @javax.annotation.Nullable
  public List<ArrayMetadataEntry> getEntries() {
    return entries;
  }

  public void setEntries(@javax.annotation.Nullable List<ArrayMetadataEntry> entries) {
    this.entries = entries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayMetadata arrayMetadata = (ArrayMetadata) o;
    return Objects.equals(this.entries, arrayMetadata.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayMetadata {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("entries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ArrayMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArrayMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayMetadata is not found in the empty JSON string", ArrayMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ArrayMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArrayMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("entries") != null && !jsonObj.get("entries").isJsonNull()) {
        JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
        if (jsonArrayentries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("entries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
          }

          // validate the optional field `entries` (array)
          for (int i = 0; i < jsonArrayentries.size(); i++) {
            ArrayMetadataEntry.validateJsonElement(jsonArrayentries.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayMetadata>() {
           @Override
           public void write(JsonWriter out, ArrayMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArrayMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ArrayMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ArrayMetadata
   * @throws IOException if the JSON string is invalid with respect to ArrayMetadata
   */
  public static ArrayMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayMetadata.class);
  }

  /**
   * Convert an instance of ArrayMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

