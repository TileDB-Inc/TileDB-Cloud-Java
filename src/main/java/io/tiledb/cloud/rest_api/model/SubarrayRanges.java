/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.2.19
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

import io.tiledb.cloud.rest_api.JSON;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * A set of 1D ranges for a subarray
 */
@ApiModel(description = "A set of 1D ranges for a subarray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
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
        Objects.equals(this.buffer, subarrayRanges.buffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hasDefaultRange, buffer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubarrayRanges {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hasDefaultRange: ").append(toIndentedString(hasDefaultRange)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
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

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!SubarrayRanges.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubarrayRanges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      // ensure the json data is an array
      if (jsonObj.get("buffer") != null && !jsonObj.get("buffer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buffer` to be an array in the JSON string but got `%s`", jsonObj.get("buffer").toString()));
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
             elementAdapter.write(out, obj);
           }

           @Override
           public SubarrayRanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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
