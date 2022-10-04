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
 * state for reads
 */
@ApiModel(description = "state for reads")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class ReadState {
  public static final String SERIALIZED_NAME_INITIALIZED = "initialized";
  @SerializedName(SERIALIZED_NAME_INITIALIZED)
  private Boolean initialized;

  public static final String SERIALIZED_NAME_OVERFLOWED = "overflowed";
  @SerializedName(SERIALIZED_NAME_OVERFLOWED)
  private Boolean overflowed;

  public static final String SERIALIZED_NAME_UNSPLITTABLE = "unsplittable";
  @SerializedName(SERIALIZED_NAME_UNSPLITTABLE)
  private Boolean unsplittable;

  public static final String SERIALIZED_NAME_SUBARRAY_PARTITIONER = "subarrayPartitioner";
  @SerializedName(SERIALIZED_NAME_SUBARRAY_PARTITIONER)
  private SubarrayPartitioner subarrayPartitioner;

  public ReadState() { 
  }

  public ReadState initialized(Boolean initialized) {
    
    this.initialized = initialized;
    return this;
  }

   /**
   * True if the reader has been initialized.
   * @return initialized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the reader has been initialized.")

  public Boolean getInitialized() {
    return initialized;
  }


  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }


  public ReadState overflowed(Boolean overflowed) {
    
    this.overflowed = overflowed;
    return this;
  }

   /**
   * True if the query produced results that could not fit in some buffer.
   * @return overflowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the query produced results that could not fit in some buffer.")

  public Boolean getOverflowed() {
    return overflowed;
  }


  public void setOverflowed(Boolean overflowed) {
    this.overflowed = overflowed;
  }


  public ReadState unsplittable(Boolean unsplittable) {
    
    this.unsplittable = unsplittable;
    return this;
  }

   /**
   * True if the current subarray partition is unsplittable.
   * @return unsplittable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the current subarray partition is unsplittable.")

  public Boolean getUnsplittable() {
    return unsplittable;
  }


  public void setUnsplittable(Boolean unsplittable) {
    this.unsplittable = unsplittable;
  }


  public ReadState subarrayPartitioner(SubarrayPartitioner subarrayPartitioner) {
    
    this.subarrayPartitioner = subarrayPartitioner;
    return this;
  }

   /**
   * Get subarrayPartitioner
   * @return subarrayPartitioner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubarrayPartitioner getSubarrayPartitioner() {
    return subarrayPartitioner;
  }


  public void setSubarrayPartitioner(SubarrayPartitioner subarrayPartitioner) {
    this.subarrayPartitioner = subarrayPartitioner;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadState readState = (ReadState) o;
    return Objects.equals(this.initialized, readState.initialized) &&
        Objects.equals(this.overflowed, readState.overflowed) &&
        Objects.equals(this.unsplittable, readState.unsplittable) &&
        Objects.equals(this.subarrayPartitioner, readState.subarrayPartitioner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialized, overflowed, unsplittable, subarrayPartitioner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadState {\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    overflowed: ").append(toIndentedString(overflowed)).append("\n");
    sb.append("    unsplittable: ").append(toIndentedString(unsplittable)).append("\n");
    sb.append("    subarrayPartitioner: ").append(toIndentedString(subarrayPartitioner)).append("\n");
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
    openapiFields.add("initialized");
    openapiFields.add("overflowed");
    openapiFields.add("unsplittable");
    openapiFields.add("subarrayPartitioner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReadState.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadState is not found in the empty JSON string", ReadState.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!ReadState.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadState` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      // validate the optional field `subarrayPartitioner`
      if (jsonObj.getAsJsonObject("subarrayPartitioner") != null) {
        SubarrayPartitioner.validateJsonObject(jsonObj.getAsJsonObject("subarrayPartitioner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadState.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadState>() {
           @Override
           public void write(JsonWriter out, ReadState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadState
  * @throws IOException if the JSON string is invalid with respect to ReadState
  */
  public static ReadState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadState.class);
  }

 /**
  * Convert an instance of ReadState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
