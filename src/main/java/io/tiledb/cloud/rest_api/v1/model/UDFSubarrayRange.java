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


package io.tiledb.cloud.rest_api.v1.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v1.JSON;

/**
 * A dimension range to query
 */
@ApiModel(description = "A dimension range to query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class UDFSubarrayRange {
  public static final String SERIALIZED_NAME_DIMENSION_ID = "dimension_id";
  @SerializedName(SERIALIZED_NAME_DIMENSION_ID)
  private Integer dimensionId;

  public static final String SERIALIZED_NAME_RANGE_START = "range_start";
  @SerializedName(SERIALIZED_NAME_RANGE_START)
  private DimensionCoordinate rangeStart;

  public static final String SERIALIZED_NAME_RANGE_END = "range_end";
  @SerializedName(SERIALIZED_NAME_RANGE_END)
  private DimensionCoordinate rangeEnd;

  public UDFSubarrayRange() {
  }

  public UDFSubarrayRange dimensionId(Integer dimensionId) {
    
    this.dimensionId = dimensionId;
    return this;
  }

   /**
   * The dimension index
   * @return dimensionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dimension index")

  public Integer getDimensionId() {
    return dimensionId;
  }


  public void setDimensionId(Integer dimensionId) {
    this.dimensionId = dimensionId;
  }


  public UDFSubarrayRange rangeStart(DimensionCoordinate rangeStart) {
    
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * Get rangeStart
   * @return rangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DimensionCoordinate getRangeStart() {
    return rangeStart;
  }


  public void setRangeStart(DimensionCoordinate rangeStart) {
    this.rangeStart = rangeStart;
  }


  public UDFSubarrayRange rangeEnd(DimensionCoordinate rangeEnd) {
    
    this.rangeEnd = rangeEnd;
    return this;
  }

   /**
   * Get rangeEnd
   * @return rangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DimensionCoordinate getRangeEnd() {
    return rangeEnd;
  }


  public void setRangeEnd(DimensionCoordinate rangeEnd) {
    this.rangeEnd = rangeEnd;
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
  public UDFSubarrayRange putAdditionalProperty(String key, Object value) {
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
    UDFSubarrayRange udFSubarrayRange = (UDFSubarrayRange) o;
    return Objects.equals(this.dimensionId, udFSubarrayRange.dimensionId) &&
        Objects.equals(this.rangeStart, udFSubarrayRange.rangeStart) &&
        Objects.equals(this.rangeEnd, udFSubarrayRange.rangeEnd)&&
        Objects.equals(this.additionalProperties, udFSubarrayRange.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionId, rangeStart, rangeEnd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFSubarrayRange {\n");
    sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
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
    openapiFields.add("dimension_id");
    openapiFields.add("range_start");
    openapiFields.add("range_end");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UDFSubarrayRange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UDFSubarrayRange.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UDFSubarrayRange is not found in the empty JSON string", UDFSubarrayRange.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `range_start`
      if (jsonObj.get("range_start") != null && !jsonObj.get("range_start").isJsonNull()) {
        DimensionCoordinate.validateJsonObject(jsonObj.getAsJsonObject("range_start"));
      }
      // validate the optional field `range_end`
      if (jsonObj.get("range_end") != null && !jsonObj.get("range_end").isJsonNull()) {
        DimensionCoordinate.validateJsonObject(jsonObj.getAsJsonObject("range_end"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UDFSubarrayRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UDFSubarrayRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UDFSubarrayRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UDFSubarrayRange.class));

       return (TypeAdapter<T>) new TypeAdapter<UDFSubarrayRange>() {
           @Override
           public void write(JsonWriter out, UDFSubarrayRange value) throws IOException {
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
           public UDFSubarrayRange read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UDFSubarrayRange instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UDFSubarrayRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UDFSubarrayRange
  * @throws IOException if the JSON string is invalid with respect to UDFSubarrayRange
  */
  public static UDFSubarrayRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UDFSubarrayRange.class);
  }

 /**
  * Convert an instance of UDFSubarrayRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

