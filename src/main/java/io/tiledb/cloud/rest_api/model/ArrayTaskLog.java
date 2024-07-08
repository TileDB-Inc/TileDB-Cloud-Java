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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * Array task stderr/stdout logs
 */
@ApiModel(description = "Array task stderr/stdout logs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
/**
 * @deprecated This class is now moved to io.tiledb.cloud.rest_api.v1.model
 */
@Deprecated
public class ArrayTaskLog {
  public static final String SERIALIZED_NAME_ARRAY_TASK_ID = "array_task_id";
  @SerializedName(SERIALIZED_NAME_ARRAY_TASK_ID)
  private String arrayTaskId;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private String logs;

  public ArrayTaskLog() {
  }

  public ArrayTaskLog arrayTaskId(String arrayTaskId) {
    
    this.arrayTaskId = arrayTaskId;
    return this;
  }

   /**
   * ID of associated task
   * @return arrayTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of associated task")

  public String getArrayTaskId() {
    return arrayTaskId;
  }


  public void setArrayTaskId(String arrayTaskId) {
    this.arrayTaskId = arrayTaskId;
  }


  public ArrayTaskLog logs(String logs) {
    
    this.logs = logs;
    return this;
  }

   /**
   * logs from array task
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logs from array task")

  public String getLogs() {
    return logs;
  }


  public void setLogs(String logs) {
    this.logs = logs;
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
  public ArrayTaskLog putAdditionalProperty(String key, Object value) {
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
    ArrayTaskLog arrayTaskLog = (ArrayTaskLog) o;
    return Objects.equals(this.arrayTaskId, arrayTaskLog.arrayTaskId) &&
        Objects.equals(this.logs, arrayTaskLog.logs)&&
        Objects.equals(this.additionalProperties, arrayTaskLog.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayTaskId, logs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTaskLog {\n");
    sb.append("    arrayTaskId: ").append(toIndentedString(arrayTaskId)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("array_task_id");
    openapiFields.add("logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayTaskLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayTaskLog.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayTaskLog is not found in the empty JSON string", ArrayTaskLog.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("array_task_id") != null && !jsonObj.get("array_task_id").isJsonNull()) && !jsonObj.get("array_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("array_task_id").toString()));
      }
      if ((jsonObj.get("logs") != null && !jsonObj.get("logs").isJsonNull()) && !jsonObj.get("logs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayTaskLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayTaskLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayTaskLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayTaskLog.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayTaskLog>() {
           @Override
           public void write(JsonWriter out, ArrayTaskLog value) throws IOException {
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
           public ArrayTaskLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayTaskLog instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArrayTaskLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayTaskLog
  * @throws IOException if the JSON string is invalid with respect to ArrayTaskLog
  */
  public static ArrayTaskLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayTaskLog.class);
  }

 /**
  * Convert an instance of ArrayTaskLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

