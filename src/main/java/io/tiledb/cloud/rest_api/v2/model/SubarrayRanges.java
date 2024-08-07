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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * A set of 1D ranges for a subarray
 */
@ApiModel(description = "A set of 1D ranges for a subarray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class SubarrayRanges {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Datatype type;

  public static final String SERIALIZED_NAME_HAS_DEFAULT_RANGE = "hasDefaultRange";
  @SerializedName(SERIALIZED_NAME_HAS_DEFAULT_RANGE)
  private Boolean hasDefaultRange;

  public static final String SERIALIZED_NAME_BUFFER = "buffer";
  @SerializedName(SERIALIZED_NAME_BUFFER)
  private List<Integer> buffer = null;

  public static final String SERIALIZED_NAME_BUFFER_SIZES = "bufferSizes";
  @SerializedName(SERIALIZED_NAME_BUFFER_SIZES)
  private List<Integer> bufferSizes = null;

  public static final String SERIALIZED_NAME_BUFFER_START_SIZES = "bufferStartSizes";
  @SerializedName(SERIALIZED_NAME_BUFFER_START_SIZES)
  private List<Integer> bufferStartSizes = null;

  public SubarrayRanges() { 
  }

  public SubarrayRanges type(Datatype type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Datatype getType() {
    return type;
  }


  public void setType(Datatype type) {
    this.type = type;
  }


  public SubarrayRanges hasDefaultRange(Boolean hasDefaultRange) {
    
    this.hasDefaultRange = hasDefaultRange;
    return this;
  }

   /**
   * True if the range is the default range
   * @return hasDefaultRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the range is the default range")

  public Boolean getHasDefaultRange() {
    return hasDefaultRange;
  }


  public void setHasDefaultRange(Boolean hasDefaultRange) {
    this.hasDefaultRange = hasDefaultRange;
  }


  public SubarrayRanges buffer(List<Integer> buffer) {
    
    this.buffer = buffer;
    return this;
  }

  public SubarrayRanges addBufferItem(Integer bufferItem) {
    if (this.buffer == null) {
      this.buffer = new ArrayList<>();
    }
    this.buffer.add(bufferItem);
    return this;
  }

   /**
   * The bytes of the ranges
   * @return buffer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bytes of the ranges")

  public List<Integer> getBuffer() {
    return buffer;
  }


  public void setBuffer(List<Integer> buffer) {
    this.buffer = buffer;
  }


  public SubarrayRanges bufferSizes(List<Integer> bufferSizes) {
    
    this.bufferSizes = bufferSizes;
    return this;
  }

  public SubarrayRanges addBufferSizesItem(Integer bufferSizesItem) {
    if (this.bufferSizes == null) {
      this.bufferSizes = new ArrayList<>();
    }
    this.bufferSizes.add(bufferSizesItem);
    return this;
  }

   /**
   * The list of sizes per range
   * @return bufferSizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of sizes per range")

  public List<Integer> getBufferSizes() {
    return bufferSizes;
  }


  public void setBufferSizes(List<Integer> bufferSizes) {
    this.bufferSizes = bufferSizes;
  }


  public SubarrayRanges bufferStartSizes(List<Integer> bufferStartSizes) {
    
    this.bufferStartSizes = bufferStartSizes;
    return this;
  }

  public SubarrayRanges addBufferStartSizesItem(Integer bufferStartSizesItem) {
    if (this.bufferStartSizes == null) {
      this.bufferStartSizes = new ArrayList<>();
    }
    this.bufferStartSizes.add(bufferStartSizesItem);
    return this;
  }

   /**
   * The list of start sizes per range
   * @return bufferStartSizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of start sizes per range")

  public List<Integer> getBufferStartSizes() {
    return bufferStartSizes;
  }


  public void setBufferStartSizes(List<Integer> bufferStartSizes) {
    this.bufferStartSizes = bufferStartSizes;
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
  public SubarrayRanges putAdditionalProperty(String key, Object value) {
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
    SubarrayRanges subarrayRanges = (SubarrayRanges) o;
    return Objects.equals(this.type, subarrayRanges.type) &&
        Objects.equals(this.hasDefaultRange, subarrayRanges.hasDefaultRange) &&
        Objects.equals(this.buffer, subarrayRanges.buffer) &&
        Objects.equals(this.bufferSizes, subarrayRanges.bufferSizes) &&
        Objects.equals(this.bufferStartSizes, subarrayRanges.bufferStartSizes)&&
        Objects.equals(this.additionalProperties, subarrayRanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hasDefaultRange, buffer, bufferSizes, bufferStartSizes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubarrayRanges {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hasDefaultRange: ").append(toIndentedString(hasDefaultRange)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    bufferSizes: ").append(toIndentedString(bufferSizes)).append("\n");
    sb.append("    bufferStartSizes: ").append(toIndentedString(bufferStartSizes)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("hasDefaultRange");
    openapiFields.add("buffer");
    openapiFields.add("bufferSizes");
    openapiFields.add("bufferStartSizes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubarrayRanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubarrayRanges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubarrayRanges is not found in the empty JSON string", SubarrayRanges.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("buffer") != null && !jsonObj.get("buffer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buffer` to be an array in the JSON string but got `%s`", jsonObj.get("buffer").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("bufferSizes") != null && !jsonObj.get("bufferSizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bufferSizes` to be an array in the JSON string but got `%s`", jsonObj.get("bufferSizes").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("bufferStartSizes") != null && !jsonObj.get("bufferStartSizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bufferStartSizes` to be an array in the JSON string but got `%s`", jsonObj.get("bufferStartSizes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubarrayRanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubarrayRanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubarrayRanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubarrayRanges.class));

       return (TypeAdapter<T>) new TypeAdapter<SubarrayRanges>() {
           @Override
           public void write(JsonWriter out, SubarrayRanges value) throws IOException {
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
           public SubarrayRanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubarrayRanges instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubarrayRanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubarrayRanges
  * @throws IOException if the JSON string is invalid with respect to SubarrayRanges
  */
  public static SubarrayRanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubarrayRanges.class);
  }

 /**
  * Convert an instance of SubarrayRanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

