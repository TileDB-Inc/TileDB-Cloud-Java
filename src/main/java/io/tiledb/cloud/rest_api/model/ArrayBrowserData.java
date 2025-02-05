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
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * Object including array info and pagination metadata
 */
@ApiModel(description = "Object including array info and pagination metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class ArrayBrowserData {
  public static final String SERIALIZED_NAME_ARRAYS = "arrays";
  @SerializedName(SERIALIZED_NAME_ARRAYS)
  private List<ArrayInfo> arrays = null;

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  private PaginationMetadata paginationMetadata;

  public ArrayBrowserData() {
  }

  public ArrayBrowserData arrays(List<ArrayInfo> arrays) {
    
    this.arrays = arrays;
    return this;
  }

  public ArrayBrowserData addArraysItem(ArrayInfo arraysItem) {
    if (this.arrays == null) {
      this.arrays = new ArrayList<>();
    }
    this.arrays.add(arraysItem);
    return this;
  }

   /**
   * Array Info
   * @return arrays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array Info")

  public List<ArrayInfo> getArrays() {
    return arrays;
  }


  public void setArrays(List<ArrayInfo> arrays) {
    this.arrays = arrays;
  }


  public ArrayBrowserData paginationMetadata(PaginationMetadata paginationMetadata) {
    
    this.paginationMetadata = paginationMetadata;
    return this;
  }

   /**
   * Get paginationMetadata
   * @return paginationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }


  public void setPaginationMetadata(PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
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
   */
  public ArrayBrowserData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
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
    ArrayBrowserData arrayBrowserData = (ArrayBrowserData) o;
    return Objects.equals(this.arrays, arrayBrowserData.arrays) &&
        Objects.equals(this.paginationMetadata, arrayBrowserData.paginationMetadata)&&
        Objects.equals(this.additionalProperties, arrayBrowserData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrays, paginationMetadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayBrowserData {\n");
    sb.append("    arrays: ").append(toIndentedString(arrays)).append("\n");
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
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
    openapiFields.add("arrays");
    openapiFields.add("pagination_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayBrowserData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayBrowserData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayBrowserData is not found in the empty JSON string", ArrayBrowserData.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayarrays = jsonObj.getAsJsonArray("arrays");
      if (jsonArrayarrays != null) {
        // ensure the json data is an array
        if (!jsonObj.get("arrays").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `arrays` to be an array in the JSON string but got `%s`", jsonObj.get("arrays").toString()));
        }

        // validate the optional field `arrays` (array)
        for (int i = 0; i < jsonArrayarrays.size(); i++) {
          ArrayInfo.validateJsonObject(jsonArrayarrays.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `pagination_metadata`
      if (jsonObj.get("pagination_metadata") != null && !jsonObj.get("pagination_metadata").isJsonNull()) {
        PaginationMetadata.validateJsonObject(jsonObj.getAsJsonObject("pagination_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayBrowserData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayBrowserData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayBrowserData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayBrowserData.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayBrowserData>() {
           @Override
           public void write(JsonWriter out, ArrayBrowserData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ArrayBrowserData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayBrowserData instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else { // non-primitive type
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
  * Create an instance of ArrayBrowserData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayBrowserData
  * @throws IOException if the JSON string is invalid with respect to ArrayBrowserData
  */
  public static ArrayBrowserData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayBrowserData.class);
  }

 /**
  * Convert an instance of ArrayBrowserData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

