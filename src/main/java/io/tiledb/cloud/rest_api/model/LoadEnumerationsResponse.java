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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.tiledb.cloud.rest_api.model.Enumeration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tiledb.cloud.rest_api.JSON;

/**
 * Contains the enumerations of the array&#39;s attributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class LoadEnumerationsResponse {
  public static final String SERIALIZED_NAME_ENUMERATIONS = "enumerations";
  @SerializedName(SERIALIZED_NAME_ENUMERATIONS)
  private List<Enumeration> enumerations = new ArrayList<>();

  public LoadEnumerationsResponse() {
  }

  public LoadEnumerationsResponse enumerations(List<Enumeration> enumerations) {
    this.enumerations = enumerations;
    return this;
  }

  public LoadEnumerationsResponse addEnumerationsItem(Enumeration enumerationsItem) {
    if (this.enumerations == null) {
      this.enumerations = new ArrayList<>();
    }
    this.enumerations.add(enumerationsItem);
    return this;
  }

  /**
   * Get enumerations
   * @return enumerations
   */
  @javax.annotation.Nullable
  public List<Enumeration> getEnumerations() {
    return enumerations;
  }

  public void setEnumerations(List<Enumeration> enumerations) {
    this.enumerations = enumerations;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LoadEnumerationsResponse instance itself
   */
  public LoadEnumerationsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadEnumerationsResponse loadEnumerationsResponse = (LoadEnumerationsResponse) o;
    return Objects.equals(this.enumerations, loadEnumerationsResponse.enumerations)&&
        Objects.equals(this.additionalProperties, loadEnumerationsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumerations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadEnumerationsResponse {\n");
    sb.append("    enumerations: ").append(toIndentedString(enumerations)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("enumerations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LoadEnumerationsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoadEnumerationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadEnumerationsResponse is not found in the empty JSON string", LoadEnumerationsResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("enumerations") != null && !jsonObj.get("enumerations").isJsonNull()) {
        JsonArray jsonArrayenumerations = jsonObj.getAsJsonArray("enumerations");
        if (jsonArrayenumerations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("enumerations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `enumerations` to be an array in the JSON string but got `%s`", jsonObj.get("enumerations").toString()));
          }

          // validate the optional field `enumerations` (array)
          for (int i = 0; i < jsonArrayenumerations.size(); i++) {
            Enumeration.validateJsonElement(jsonArrayenumerations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoadEnumerationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadEnumerationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadEnumerationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadEnumerationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadEnumerationsResponse>() {
           @Override
           public void write(JsonWriter out, LoadEnumerationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadEnumerationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LoadEnumerationsResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LoadEnumerationsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LoadEnumerationsResponse
   * @throws IOException if the JSON string is invalid with respect to LoadEnumerationsResponse
   */
  public static LoadEnumerationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadEnumerationsResponse.class);
  }

  /**
   * Convert an instance of LoadEnumerationsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

