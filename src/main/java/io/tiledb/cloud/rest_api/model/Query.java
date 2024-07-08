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
 * Query
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
/**
 * @deprecated This class is now moved to io.tiledb.cloud.rest_api.v1.model
 */
@Deprecated
public class Query {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Querytype type;

  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private Layout layout;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Querystatus status;

  public static final String SERIALIZED_NAME_ATTRIBUTE_BUFFER_HEADERS = "attributeBufferHeaders";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_BUFFER_HEADERS)
  private List<AttributeBufferHeader> attributeBufferHeaders = new ArrayList<>();

  public static final String SERIALIZED_NAME_WRITER = "writer";
  @SerializedName(SERIALIZED_NAME_WRITER)
  private Writer writer;

  public static final String SERIALIZED_NAME_READER = "reader";
  @SerializedName(SERIALIZED_NAME_READER)
  private QueryReader reader;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private Array array;

  public static final String SERIALIZED_NAME_TOTAL_FIXED_LENGTH_BUFFER_BYTES = "totalFixedLengthBufferBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_FIXED_LENGTH_BUFFER_BYTES)
  private Integer totalFixedLengthBufferBytes;

  public static final String SERIALIZED_NAME_TOTAL_VAR_LEN_BUFFER_BYTES = "totalVarLenBufferBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_VAR_LEN_BUFFER_BYTES)
  private Integer totalVarLenBufferBytes;

  public Query() {
  }

  public Query type(Querytype type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Querytype getType() {
    return type;
  }


  public void setType(Querytype type) {
    this.type = type;
  }


  public Query layout(Layout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Layout getLayout() {
    return layout;
  }


  public void setLayout(Layout layout) {
    this.layout = layout;
  }


  public Query status(Querystatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Querystatus getStatus() {
    return status;
  }


  public void setStatus(Querystatus status) {
    this.status = status;
  }


  public Query attributeBufferHeaders(List<AttributeBufferHeader> attributeBufferHeaders) {
    
    this.attributeBufferHeaders = attributeBufferHeaders;
    return this;
  }

  public Query addAttributeBufferHeadersItem(AttributeBufferHeader attributeBufferHeadersItem) {
    this.attributeBufferHeaders.add(attributeBufferHeadersItem);
    return this;
  }

   /**
   * List of attribute buffer headers
   * @return attributeBufferHeaders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of attribute buffer headers")

  public List<AttributeBufferHeader> getAttributeBufferHeaders() {
    return attributeBufferHeaders;
  }


  public void setAttributeBufferHeaders(List<AttributeBufferHeader> attributeBufferHeaders) {
    this.attributeBufferHeaders = attributeBufferHeaders;
  }


  public Query writer(Writer writer) {
    
    this.writer = writer;
    return this;
  }

   /**
   * Get writer
   * @return writer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Writer getWriter() {
    return writer;
  }


  public void setWriter(Writer writer) {
    this.writer = writer;
  }


  public Query reader(QueryReader reader) {
    
    this.reader = reader;
    return this;
  }

   /**
   * Get reader
   * @return reader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryReader getReader() {
    return reader;
  }


  public void setReader(QueryReader reader) {
    this.reader = reader;
  }


  public Query array(Array array) {
    
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Array getArray() {
    return array;
  }


  public void setArray(Array array) {
    this.array = array;
  }


  public Query totalFixedLengthBufferBytes(Integer totalFixedLengthBufferBytes) {
    
    this.totalFixedLengthBufferBytes = totalFixedLengthBufferBytes;
    return this;
  }

   /**
   * Total number of bytes in fixed size attribute buffers.
   * @return totalFixedLengthBufferBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of bytes in fixed size attribute buffers.")

  public Integer getTotalFixedLengthBufferBytes() {
    return totalFixedLengthBufferBytes;
  }


  public void setTotalFixedLengthBufferBytes(Integer totalFixedLengthBufferBytes) {
    this.totalFixedLengthBufferBytes = totalFixedLengthBufferBytes;
  }


  public Query totalVarLenBufferBytes(Integer totalVarLenBufferBytes) {
    
    this.totalVarLenBufferBytes = totalVarLenBufferBytes;
    return this;
  }

   /**
   * Total number of bytes in variable size attribute buffers.
   * @return totalVarLenBufferBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of bytes in variable size attribute buffers.")

  public Integer getTotalVarLenBufferBytes() {
    return totalVarLenBufferBytes;
  }


  public void setTotalVarLenBufferBytes(Integer totalVarLenBufferBytes) {
    this.totalVarLenBufferBytes = totalVarLenBufferBytes;
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
  public Query putAdditionalProperty(String key, Object value) {
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
    Query query = (Query) o;
    return Objects.equals(this.type, query.type) &&
        Objects.equals(this.layout, query.layout) &&
        Objects.equals(this.status, query.status) &&
        Objects.equals(this.attributeBufferHeaders, query.attributeBufferHeaders) &&
        Objects.equals(this.writer, query.writer) &&
        Objects.equals(this.reader, query.reader) &&
        Objects.equals(this.array, query.array) &&
        Objects.equals(this.totalFixedLengthBufferBytes, query.totalFixedLengthBufferBytes) &&
        Objects.equals(this.totalVarLenBufferBytes, query.totalVarLenBufferBytes)&&
        Objects.equals(this.additionalProperties, query.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, layout, status, attributeBufferHeaders, writer, reader, array, totalFixedLengthBufferBytes, totalVarLenBufferBytes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attributeBufferHeaders: ").append(toIndentedString(attributeBufferHeaders)).append("\n");
    sb.append("    writer: ").append(toIndentedString(writer)).append("\n");
    sb.append("    reader: ").append(toIndentedString(reader)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    totalFixedLengthBufferBytes: ").append(toIndentedString(totalFixedLengthBufferBytes)).append("\n");
    sb.append("    totalVarLenBufferBytes: ").append(toIndentedString(totalVarLenBufferBytes)).append("\n");
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
    openapiFields.add("layout");
    openapiFields.add("status");
    openapiFields.add("attributeBufferHeaders");
    openapiFields.add("writer");
    openapiFields.add("reader");
    openapiFields.add("array");
    openapiFields.add("totalFixedLengthBufferBytes");
    openapiFields.add("totalVarLenBufferBytes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("layout");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("attributeBufferHeaders");
    openapiRequiredFields.add("array");
    openapiRequiredFields.add("totalFixedLengthBufferBytes");
    openapiRequiredFields.add("totalVarLenBufferBytes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Query
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Query.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Query is not found in the empty JSON string", Query.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Query.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattributeBufferHeaders = jsonObj.getAsJsonArray("attributeBufferHeaders");
      if (jsonArrayattributeBufferHeaders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributeBufferHeaders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attributeBufferHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("attributeBufferHeaders").toString()));
        }

        // validate the optional field `attributeBufferHeaders` (array)
        for (int i = 0; i < jsonArrayattributeBufferHeaders.size(); i++) {
          AttributeBufferHeader.validateJsonObject(jsonArrayattributeBufferHeaders.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `writer`
      if (jsonObj.get("writer") != null && !jsonObj.get("writer").isJsonNull()) {
        Writer.validateJsonObject(jsonObj.getAsJsonObject("writer"));
      }
      // validate the optional field `reader`
      if (jsonObj.get("reader") != null && !jsonObj.get("reader").isJsonNull()) {
        QueryReader.validateJsonObject(jsonObj.getAsJsonObject("reader"));
      }
      // validate the optional field `array`
      if (jsonObj.get("array") != null && !jsonObj.get("array").isJsonNull()) {
        Array.validateJsonObject(jsonObj.getAsJsonObject("array"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Query.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Query' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Query> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Query.class));

       return (TypeAdapter<T>) new TypeAdapter<Query>() {
           @Override
           public void write(JsonWriter out, Query value) throws IOException {
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
           public Query read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Query instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Query given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Query
  * @throws IOException if the JSON string is invalid with respect to Query
  */
  public static Query fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Query.class);
  }

 /**
  * Convert an instance of Query to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

