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
import io.tiledb.cloud.rest_api.model.TaskGraphLogStatus;
import io.tiledb.cloud.rest_api.model.TaskGraphNodeMetadata;
import io.tiledb.cloud.rest_api.model.TaskGraphType;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Logging information about the execution of a task graph.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class TaskGraphLog {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskGraphLogStatus status;

  public static final String SERIALIZED_NAME_TOTAL_COST = "total_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_COST)
  private BigDecimal totalCost;

  public static final String SERIALIZED_NAME_ACCESS_COST = "access_cost";
  @SerializedName(SERIALIZED_NAME_ACCESS_COST)
  private BigDecimal accessCost;

  public static final String SERIALIZED_NAME_EGRESS_COST = "egress_cost";
  @SerializedName(SERIALIZED_NAME_EGRESS_COST)
  private BigDecimal egressCost;

  public static final String SERIALIZED_NAME_EXECUTION_TIME = "execution_time";
  @SerializedName(SERIALIZED_NAME_EXECUTION_TIME)
  private String executionTime;

  public static final String SERIALIZED_NAME_STATUS_COUNT = "status_count";
  @SerializedName(SERIALIZED_NAME_STATUS_COUNT)
  private Map<String, BigDecimal> statusCount = new HashMap<>();

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<TaskGraphNodeMetadata> nodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TASK_GRAPH_TYPE = "task_graph_type";
  @SerializedName(SERIALIZED_NAME_TASK_GRAPH_TYPE)
  private TaskGraphType taskGraphType;

  public static final String SERIALIZED_NAME_TASK_GRAPH_ID = "task_graph_id";
  @SerializedName(SERIALIZED_NAME_TASK_GRAPH_ID)
  private String taskGraphId;

  public static final String SERIALIZED_NAME_CLOUD_PROVIDER = "cloud_provider";
  @SerializedName(SERIALIZED_NAME_CLOUD_PROVIDER)
  private String cloudProvider;

  public static final String SERIALIZED_NAME_CLOUD_REGION = "cloud_region";
  @SerializedName(SERIALIZED_NAME_CLOUD_REGION)
  private String cloudRegion;

  public TaskGraphLog() {
  }

  public TaskGraphLog(
     String uuid, 
     String createdBy, 
     OffsetDateTime createdAt, 
     OffsetDateTime startTime, 
     OffsetDateTime endTime
  ) {
    this();
    this.uuid = uuid;
    this.createdBy = createdBy;
    this.createdAt = createdAt;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * The server-generated UUID of the task graph.
   * @return uuid
   */
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }



  public TaskGraphLog namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace that owns this task graph log. When creating a task graph log, this is used as the namespace to create the log in; thereafter it is read-only. 
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * The name of the user who created this task graph log.
   * @return createdBy
   */
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }



  public TaskGraphLog name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name for this task graph log, displayed in the UI. Does not need to be unique. 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * The date/time when this task graph log was originally created. This is distinct from the execution start_time. 
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * The start time of the task graph, recorded when the server starts executing the first node. 
   * @return startTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getStartTime() {
    return startTime;
  }



  /**
   * The end time of the task graph, recorded when the client reports completion. 
   * @return endTime
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEndTime() {
    return endTime;
  }



  public TaskGraphLog status(TaskGraphLogStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public TaskGraphLogStatus getStatus() {
    return status;
  }

  public void setStatus(TaskGraphLogStatus status) {
    this.status = status;
  }


  public TaskGraphLog totalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
    return this;
  }

  /**
   * If present, the total cost of executing all nodes in this task graph. 
   * @return totalCost
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(BigDecimal totalCost) {
    this.totalCost = totalCost;
  }


  public TaskGraphLog accessCost(BigDecimal accessCost) {
    this.accessCost = accessCost;
    return this;
  }

  /**
   * If present, the total cost of access from execution of the nodes in this task graph. 
   * @return accessCost
   */
  @javax.annotation.Nullable
  public BigDecimal getAccessCost() {
    return accessCost;
  }

  public void setAccessCost(BigDecimal accessCost) {
    this.accessCost = accessCost;
  }


  public TaskGraphLog egressCost(BigDecimal egressCost) {
    this.egressCost = egressCost;
    return this;
  }

  /**
   * If present, the total cost of access from execution of the nodes in this task graph. 
   * @return egressCost
   */
  @javax.annotation.Nullable
  public BigDecimal getEgressCost() {
    return egressCost;
  }

  public void setEgressCost(BigDecimal egressCost) {
    this.egressCost = egressCost;
  }


  public TaskGraphLog executionTime(String executionTime) {
    this.executionTime = executionTime;
    return this;
  }

  /**
   * The total execution time of all the nodes in this graph, in ISO 8601 format with hours, minutes, and seconds. 
   * @return executionTime
   */
  @javax.annotation.Nullable
  public String getExecutionTime() {
    return executionTime;
  }

  public void setExecutionTime(String executionTime) {
    this.executionTime = executionTime;
  }


  public TaskGraphLog statusCount(Map<String, BigDecimal> statusCount) {
    this.statusCount = statusCount;
    return this;
  }

  public TaskGraphLog putStatusCountItem(String key, BigDecimal statusCountItem) {
    if (this.statusCount == null) {
      this.statusCount = new HashMap<>();
    }
    this.statusCount.put(key, statusCountItem);
    return this;
  }

  /**
   * A mapping from &#x60;ArrayTaskStatus&#x60; string value to the number of nodes in this graph that are in that status. 
   * @return statusCount
   */
  @javax.annotation.Nullable
  public Map<String, BigDecimal> getStatusCount() {
    return statusCount;
  }

  public void setStatusCount(Map<String, BigDecimal> statusCount) {
    this.statusCount = statusCount;
  }


  public TaskGraphLog nodes(List<TaskGraphNodeMetadata> nodes) {
    this.nodes = nodes;
    return this;
  }

  public TaskGraphLog addNodesItem(TaskGraphNodeMetadata nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * The structure of the graph. This is provided by the client when first setting up the task graph. Thereafter, it is read-only. This must be topographically sorted; that is, each node must appear after all nodes that it depends upon. 
   * @return nodes
   */
  @javax.annotation.Nullable
  public List<TaskGraphNodeMetadata> getNodes() {
    return nodes;
  }

  public void setNodes(List<TaskGraphNodeMetadata> nodes) {
    this.nodes = nodes;
  }


  public TaskGraphLog taskGraphType(TaskGraphType taskGraphType) {
    this.taskGraphType = taskGraphType;
    return this;
  }

  /**
   * Get taskGraphType
   * @return taskGraphType
   */
  @javax.annotation.Nullable
  public TaskGraphType getTaskGraphType() {
    return taskGraphType;
  }

  public void setTaskGraphType(TaskGraphType taskGraphType) {
    this.taskGraphType = taskGraphType;
  }


  public TaskGraphLog taskGraphId(String taskGraphId) {
    this.taskGraphId = taskGraphId;
    return this;
  }

  /**
   * The UUID of the task graph.
   * @return taskGraphId
   */
  @javax.annotation.Nullable
  public String getTaskGraphId() {
    return taskGraphId;
  }

  public void setTaskGraphId(String taskGraphId) {
    this.taskGraphId = taskGraphId;
  }


  public TaskGraphLog cloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
    return this;
  }

  /**
   * The name of the cloud provider where this task graph executed.
   * @return cloudProvider
   */
  @javax.annotation.Nullable
  public String getCloudProvider() {
    return cloudProvider;
  }

  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public TaskGraphLog cloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
    return this;
  }

  /**
   * The region of the cloud provider where this task graph executed.
   * @return cloudRegion
   */
  @javax.annotation.Nullable
  public String getCloudRegion() {
    return cloudRegion;
  }

  public void setCloudRegion(String cloudRegion) {
    this.cloudRegion = cloudRegion;
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
   * @return the TaskGraphLog instance itself
   */
  public TaskGraphLog putAdditionalProperty(String key, Object value) {
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
    TaskGraphLog taskGraphLog = (TaskGraphLog) o;
    return Objects.equals(this.uuid, taskGraphLog.uuid) &&
        Objects.equals(this.namespace, taskGraphLog.namespace) &&
        Objects.equals(this.createdBy, taskGraphLog.createdBy) &&
        Objects.equals(this.name, taskGraphLog.name) &&
        Objects.equals(this.createdAt, taskGraphLog.createdAt) &&
        Objects.equals(this.startTime, taskGraphLog.startTime) &&
        Objects.equals(this.endTime, taskGraphLog.endTime) &&
        Objects.equals(this.status, taskGraphLog.status) &&
        Objects.equals(this.totalCost, taskGraphLog.totalCost) &&
        Objects.equals(this.accessCost, taskGraphLog.accessCost) &&
        Objects.equals(this.egressCost, taskGraphLog.egressCost) &&
        Objects.equals(this.executionTime, taskGraphLog.executionTime) &&
        Objects.equals(this.statusCount, taskGraphLog.statusCount) &&
        Objects.equals(this.nodes, taskGraphLog.nodes) &&
        Objects.equals(this.taskGraphType, taskGraphLog.taskGraphType) &&
        Objects.equals(this.taskGraphId, taskGraphLog.taskGraphId) &&
        Objects.equals(this.cloudProvider, taskGraphLog.cloudProvider) &&
        Objects.equals(this.cloudRegion, taskGraphLog.cloudRegion)&&
        Objects.equals(this.additionalProperties, taskGraphLog.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, namespace, createdBy, name, createdAt, startTime, endTime, status, totalCost, accessCost, egressCost, executionTime, statusCount, nodes, taskGraphType, taskGraphId, cloudProvider, cloudRegion, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskGraphLog {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
    sb.append("    accessCost: ").append(toIndentedString(accessCost)).append("\n");
    sb.append("    egressCost: ").append(toIndentedString(egressCost)).append("\n");
    sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
    sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    taskGraphType: ").append(toIndentedString(taskGraphType)).append("\n");
    sb.append("    taskGraphId: ").append(toIndentedString(taskGraphId)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("namespace");
    openapiFields.add("created_by");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("status");
    openapiFields.add("total_cost");
    openapiFields.add("access_cost");
    openapiFields.add("egress_cost");
    openapiFields.add("execution_time");
    openapiFields.add("status_count");
    openapiFields.add("nodes");
    openapiFields.add("task_graph_type");
    openapiFields.add("task_graph_id");
    openapiFields.add("cloud_provider");
    openapiFields.add("cloud_region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaskGraphLog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskGraphLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskGraphLog is not found in the empty JSON string", TaskGraphLog.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TaskGraphLogStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("execution_time") != null && !jsonObj.get("execution_time").isJsonNull()) && !jsonObj.get("execution_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execution_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execution_time").toString()));
      }
      if (jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonNull()) {
        JsonArray jsonArraynodes = jsonObj.getAsJsonArray("nodes");
        if (jsonArraynodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodes` to be an array in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
          }

          // validate the optional field `nodes` (array)
          for (int i = 0; i < jsonArraynodes.size(); i++) {
            TaskGraphNodeMetadata.validateJsonElement(jsonArraynodes.get(i));
          };
        }
      }
      // validate the optional field `task_graph_type`
      if (jsonObj.get("task_graph_type") != null && !jsonObj.get("task_graph_type").isJsonNull()) {
        TaskGraphType.validateJsonElement(jsonObj.get("task_graph_type"));
      }
      if ((jsonObj.get("task_graph_id") != null && !jsonObj.get("task_graph_id").isJsonNull()) && !jsonObj.get("task_graph_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_graph_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_graph_id").toString()));
      }
      if ((jsonObj.get("cloud_provider") != null && !jsonObj.get("cloud_provider").isJsonNull()) && !jsonObj.get("cloud_provider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_provider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_provider").toString()));
      }
      if ((jsonObj.get("cloud_region") != null && !jsonObj.get("cloud_region").isJsonNull()) && !jsonObj.get("cloud_region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cloud_region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cloud_region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskGraphLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskGraphLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskGraphLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskGraphLog.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskGraphLog>() {
           @Override
           public void write(JsonWriter out, TaskGraphLog value) throws IOException {
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
           public TaskGraphLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TaskGraphLog instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TaskGraphLog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaskGraphLog
   * @throws IOException if the JSON string is invalid with respect to TaskGraphLog
   */
  public static TaskGraphLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskGraphLog.class);
  }

  /**
   * Convert an instance of TaskGraphLog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
