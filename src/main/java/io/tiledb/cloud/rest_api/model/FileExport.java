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
import java.util.Arrays;

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
 * Output information required to export a file
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class FileExport {
  public static final String SERIALIZED_NAME_OUTPUT_URI = "output_uri";
  @SerializedName(SERIALIZED_NAME_OUTPUT_URI)
  @javax.annotation.Nullable
  private String outputUri;

  public FileExport() {
  }

  public FileExport outputUri(@javax.annotation.Nullable String outputUri) {
    this.outputUri = outputUri;
    return this;
  }

  /**
   * output location of the TileDB File
   * @return outputUri
   */
  @javax.annotation.Nullable
  public String getOutputUri() {
    return outputUri;
  }

  public void setOutputUri(@javax.annotation.Nullable String outputUri) {
    this.outputUri = outputUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileExport fileExport = (FileExport) o;
    return Objects.equals(this.outputUri, fileExport.outputUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileExport {\n");
    sb.append("    outputUri: ").append(toIndentedString(outputUri)).append("\n");
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
    openapiFields.add("output_uri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FileExport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FileExport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileExport is not found in the empty JSON string", FileExport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FileExport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileExport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("output_uri") != null && !jsonObj.get("output_uri").isJsonNull()) && !jsonObj.get("output_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output_uri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileExport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileExport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileExport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileExport.class));

       return (TypeAdapter<T>) new TypeAdapter<FileExport>() {
           @Override
           public void write(JsonWriter out, FileExport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileExport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FileExport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FileExport
   * @throws IOException if the JSON string is invalid with respect to FileExport
   */
  public static FileExport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileExport.class);
  }

  /**
   * Convert an instance of FileExport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

