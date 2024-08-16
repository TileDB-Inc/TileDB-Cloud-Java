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
import java.time.OffsetDateTime;

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
 * Actvity of an Array
 */
@ApiModel(description = "Actvity of an Array")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class ArrayActivityLog {
  public static final String SERIALIZED_NAME_EVENT_AT = "event_at";
  @SerializedName(SERIALIZED_NAME_EVENT_AT)
  private OffsetDateTime eventAt;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActivityEventType action;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_BYTES_SENT = "bytes_sent";
  @SerializedName(SERIALIZED_NAME_BYTES_SENT)
  private Integer bytesSent;

  public static final String SERIALIZED_NAME_BYTES_RECEIVED = "bytes_received";
  @SerializedName(SERIALIZED_NAME_BYTES_RECEIVED)
  private Integer bytesReceived;

  public static final String SERIALIZED_NAME_ARRAY_TASK_ID = "array_task_id";
  @SerializedName(SERIALIZED_NAME_ARRAY_TASK_ID)
  private String arrayTaskId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_QUERY_RANGES = "query_ranges";
  @SerializedName(SERIALIZED_NAME_QUERY_RANGES)
  private String queryRanges;

  public static final String SERIALIZED_NAME_QUERY_STATS = "query_stats";
  @SerializedName(SERIALIZED_NAME_QUERY_STATS)
  private String queryStats;

  public ArrayActivityLog() {
  }

  public ArrayActivityLog eventAt(OffsetDateTime eventAt) {
    
    this.eventAt = eventAt;
    return this;
  }

   /**
   * time event took place (RFC3339)
   * @return eventAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "time event took place (RFC3339)")

  public OffsetDateTime getEventAt() {
    return eventAt;
  }


  public void setEventAt(OffsetDateTime eventAt) {
    this.eventAt = eventAt;
  }


  public ArrayActivityLog action(ActivityEventType action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityEventType getAction() {
    return action;
  }


  public void setAction(ActivityEventType action) {
    this.action = action;
  }


  public ArrayActivityLog username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * User who performed action
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user1", value = "User who performed action")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public ArrayActivityLog bytesSent(Integer bytesSent) {
    
    this.bytesSent = bytesSent;
    return this;
  }

   /**
   * Bytes sent to client
   * @return bytesSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "Bytes sent to client")

  public Integer getBytesSent() {
    return bytesSent;
  }


  public void setBytesSent(Integer bytesSent) {
    this.bytesSent = bytesSent;
  }


  public ArrayActivityLog bytesReceived(Integer bytesReceived) {
    
    this.bytesReceived = bytesReceived;
    return this;
  }

   /**
   * Bytes recieved from client
   * @return bytesReceived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1073741824", value = "Bytes recieved from client")

  public Integer getBytesReceived() {
    return bytesReceived;
  }


  public void setBytesReceived(Integer bytesReceived) {
    this.bytesReceived = bytesReceived;
  }


  public ArrayActivityLog arrayTaskId(String arrayTaskId) {
    
    this.arrayTaskId = arrayTaskId;
    return this;
  }

   /**
   * UUID of associated array task
   * @return arrayTaskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "UUID of associated array task")

  public String getArrayTaskId() {
    return arrayTaskId;
  }


  public void setArrayTaskId(String arrayTaskId) {
    this.arrayTaskId = arrayTaskId;
  }


  public ArrayActivityLog id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the activity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "ID of the activity")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ArrayActivityLog queryRanges(String queryRanges) {
    
    this.queryRanges = queryRanges;
    return this;
  }

   /**
   * ranges for query
   * @return queryRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"rows\":[{\"start\": 1, \"end\": 1},{\"start\": 3, \"end\": 4}],\"cols\":[{\"start\": 1, \"end\": 4}]}", value = "ranges for query")

  public String getQueryRanges() {
    return queryRanges;
  }


  public void setQueryRanges(String queryRanges) {
    this.queryRanges = queryRanges;
  }


  public ArrayActivityLog queryStats(String queryStats) {
    
    this.queryStats = queryStats;
    return this;
  }

   /**
   * stats for query
   * @return queryStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"timers\": {\"Context.StorageManager.read_load_array_schema_from_uri.sum\": 0.0255293, \"...\": \"...\"}, \"counters\": {\"Context.StorageManager.read_unfiltered_byte_num\": 191, \"...\": \"...\"}}", value = "stats for query")

  public String getQueryStats() {
    return queryStats;
  }


  public void setQueryStats(String queryStats) {
    this.queryStats = queryStats;
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
  public ArrayActivityLog putAdditionalProperty(String key, Object value) {
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
    ArrayActivityLog arrayActivityLog = (ArrayActivityLog) o;
    return Objects.equals(this.eventAt, arrayActivityLog.eventAt) &&
        Objects.equals(this.action, arrayActivityLog.action) &&
        Objects.equals(this.username, arrayActivityLog.username) &&
        Objects.equals(this.bytesSent, arrayActivityLog.bytesSent) &&
        Objects.equals(this.bytesReceived, arrayActivityLog.bytesReceived) &&
        Objects.equals(this.arrayTaskId, arrayActivityLog.arrayTaskId) &&
        Objects.equals(this.id, arrayActivityLog.id) &&
        Objects.equals(this.queryRanges, arrayActivityLog.queryRanges) &&
        Objects.equals(this.queryStats, arrayActivityLog.queryStats)&&
        Objects.equals(this.additionalProperties, arrayActivityLog.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventAt, action, username, bytesSent, bytesReceived, arrayTaskId, id, queryRanges, queryStats, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayActivityLog {\n");
    sb.append("    eventAt: ").append(toIndentedString(eventAt)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    bytesSent: ").append(toIndentedString(bytesSent)).append("\n");
    sb.append("    bytesReceived: ").append(toIndentedString(bytesReceived)).append("\n");
    sb.append("    arrayTaskId: ").append(toIndentedString(arrayTaskId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queryRanges: ").append(toIndentedString(queryRanges)).append("\n");
    sb.append("    queryStats: ").append(toIndentedString(queryStats)).append("\n");
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
    openapiFields.add("event_at");
    openapiFields.add("action");
    openapiFields.add("username");
    openapiFields.add("bytes_sent");
    openapiFields.add("bytes_received");
    openapiFields.add("array_task_id");
    openapiFields.add("id");
    openapiFields.add("query_ranges");
    openapiFields.add("query_stats");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayActivityLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayActivityLog.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayActivityLog is not found in the empty JSON string", ArrayActivityLog.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("array_task_id") != null && !jsonObj.get("array_task_id").isJsonNull()) && !jsonObj.get("array_task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("array_task_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("query_ranges") != null && !jsonObj.get("query_ranges").isJsonNull()) && !jsonObj.get("query_ranges").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_ranges` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_ranges").toString()));
      }
      if ((jsonObj.get("query_stats") != null && !jsonObj.get("query_stats").isJsonNull()) && !jsonObj.get("query_stats").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_stats` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query_stats").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayActivityLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayActivityLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayActivityLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayActivityLog.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayActivityLog>() {
           @Override
           public void write(JsonWriter out, ArrayActivityLog value) throws IOException {
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
           public ArrayActivityLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayActivityLog instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArrayActivityLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayActivityLog
  * @throws IOException if the JSON string is invalid with respect to ArrayActivityLog
  */
  public static ArrayActivityLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayActivityLog.class);
  }

 /**
  * Convert an instance of ArrayActivityLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

