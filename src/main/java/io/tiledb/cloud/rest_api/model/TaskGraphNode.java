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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Information about a single node within a registered task graph. A single node represents one piece of data or a computational step; either as an input value, a data source, or a computation that acts upon earlier nodes. The structure parallels the existing &#x60;TaskGraphNodeMetadata&#x60;. 
 */
@ApiModel(description = "Information about a single node within a registered task graph. A single node represents one piece of data or a computational step; either as an input value, a data source, or a computation that acts upon earlier nodes. The structure parallels the existing `TaskGraphNodeMetadata`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class TaskGraphNode {
  public static final String SERIALIZED_NAME_CLIENT_NODE_ID = "client_node_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_NODE_ID)
  private String clientNodeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "depends_on";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private List<String> dependsOn = null;

  public static final String SERIALIZED_NAME_ARRAY_NODE = "array_node";
  @SerializedName(SERIALIZED_NAME_ARRAY_NODE)
  private UDFArrayDetails arrayNode;

  public static final String SERIALIZED_NAME_INPUT_NODE = "input_node";
  @SerializedName(SERIALIZED_NAME_INPUT_NODE)
  private TGInputNodeData inputNode;

  public static final String SERIALIZED_NAME_SQL_NODE = "sql_node";
  @SerializedName(SERIALIZED_NAME_SQL_NODE)
  private TGSQLNodeData sqlNode;

  public static final String SERIALIZED_NAME_UDF_NODE = "udf_node";
  @SerializedName(SERIALIZED_NAME_UDF_NODE)
  private TGUDFNodeData udfNode;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retry_strategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private RetryStrategy retryStrategy;

  public static final String SERIALIZED_NAME_EXPAND_NODE_OUTPUT = "expand_node_output";
  @SerializedName(SERIALIZED_NAME_EXPAND_NODE_OUTPUT)
  private String expandNodeOutput;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private Long deadline;

  public TaskGraphNode() {
  }

  public TaskGraphNode clientNodeId(String clientNodeId) {
    
    this.clientNodeId = clientNodeId;
    return this;
  }

   /**
   * The client-generated UUID of the given graph node.
   * @return clientNodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client-generated UUID of the given graph node.")

  public String getClientNodeId() {
    return clientNodeId;
  }


  public void setClientNodeId(String clientNodeId) {
    this.clientNodeId = clientNodeId;
  }


  public TaskGraphNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A client-specified name for the node. If provided, this must be unique. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A client-specified name for the node. If provided, this must be unique. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaskGraphNode dependsOn(List<String> dependsOn) {
    
    this.dependsOn = dependsOn;
    return this;
  }

  public TaskGraphNode addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * The client_node_uuid of each node that this node depends upon. Used to define the structure of the graph. 
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client_node_uuid of each node that this node depends upon. Used to define the structure of the graph. ")

  public List<String> getDependsOn() {
    return dependsOn;
  }


  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }


  public TaskGraphNode arrayNode(UDFArrayDetails arrayNode) {
    
    this.arrayNode = arrayNode;
    return this;
  }

   /**
   * Get arrayNode
   * @return arrayNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UDFArrayDetails getArrayNode() {
    return arrayNode;
  }


  public void setArrayNode(UDFArrayDetails arrayNode) {
    this.arrayNode = arrayNode;
  }


  public TaskGraphNode inputNode(TGInputNodeData inputNode) {
    
    this.inputNode = inputNode;
    return this;
  }

   /**
   * Get inputNode
   * @return inputNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TGInputNodeData getInputNode() {
    return inputNode;
  }


  public void setInputNode(TGInputNodeData inputNode) {
    this.inputNode = inputNode;
  }


  public TaskGraphNode sqlNode(TGSQLNodeData sqlNode) {
    
    this.sqlNode = sqlNode;
    return this;
  }

   /**
   * Get sqlNode
   * @return sqlNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TGSQLNodeData getSqlNode() {
    return sqlNode;
  }


  public void setSqlNode(TGSQLNodeData sqlNode) {
    this.sqlNode = sqlNode;
  }


  public TaskGraphNode udfNode(TGUDFNodeData udfNode) {
    
    this.udfNode = udfNode;
    return this;
  }

   /**
   * Get udfNode
   * @return udfNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TGUDFNodeData getUdfNode() {
    return udfNode;
  }


  public void setUdfNode(TGUDFNodeData udfNode) {
    this.udfNode = udfNode;
  }


  public TaskGraphNode retryStrategy(RetryStrategy retryStrategy) {
    
    this.retryStrategy = retryStrategy;
    return this;
  }

   /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }


  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public TaskGraphNode expandNodeOutput(String expandNodeOutput) {
    
    this.expandNodeOutput = expandNodeOutput;
    return this;
  }

   /**
   * Used to create dynamic tasks based on the output of another node. The other node&#39;s output must be a JSON list of values. The expansion process creates one task per item in the output list. The item is also passed as an argument to each task. The value is the client_node_uuid of the node that we want to expand. 
   * @return expandNodeOutput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to create dynamic tasks based on the output of another node. The other node's output must be a JSON list of values. The expansion process creates one task per item in the output list. The item is also passed as an argument to each task. The value is the client_node_uuid of the node that we want to expand. ")

  public String getExpandNodeOutput() {
    return expandNodeOutput;
  }


  public void setExpandNodeOutput(String expandNodeOutput) {
    this.expandNodeOutput = expandNodeOutput;
  }


  public TaskGraphNode deadline(Long deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * Duration in seconds relative to the node start time which the node is allowed to run before it gets terminated. 
   * @return deadline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration in seconds relative to the node start time which the node is allowed to run before it gets terminated. ")

  public Long getDeadline() {
    return deadline;
  }


  public void setDeadline(Long deadline) {
    this.deadline = deadline;
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
  public TaskGraphNode putAdditionalProperty(String key, Object value) {
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
    TaskGraphNode taskGraphNode = (TaskGraphNode) o;
    return Objects.equals(this.clientNodeId, taskGraphNode.clientNodeId) &&
        Objects.equals(this.name, taskGraphNode.name) &&
        Objects.equals(this.dependsOn, taskGraphNode.dependsOn) &&
        Objects.equals(this.arrayNode, taskGraphNode.arrayNode) &&
        Objects.equals(this.inputNode, taskGraphNode.inputNode) &&
        Objects.equals(this.sqlNode, taskGraphNode.sqlNode) &&
        Objects.equals(this.udfNode, taskGraphNode.udfNode) &&
        Objects.equals(this.retryStrategy, taskGraphNode.retryStrategy) &&
        Objects.equals(this.expandNodeOutput, taskGraphNode.expandNodeOutput) &&
        Objects.equals(this.deadline, taskGraphNode.deadline)&&
        Objects.equals(this.additionalProperties, taskGraphNode.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientNodeId, name, dependsOn, arrayNode, inputNode, sqlNode, udfNode, retryStrategy, expandNodeOutput, deadline, additionalProperties);
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
    sb.append("class TaskGraphNode {\n");
    sb.append("    clientNodeId: ").append(toIndentedString(clientNodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    arrayNode: ").append(toIndentedString(arrayNode)).append("\n");
    sb.append("    inputNode: ").append(toIndentedString(inputNode)).append("\n");
    sb.append("    sqlNode: ").append(toIndentedString(sqlNode)).append("\n");
    sb.append("    udfNode: ").append(toIndentedString(udfNode)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    expandNodeOutput: ").append(toIndentedString(expandNodeOutput)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
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
    openapiFields.add("client_node_id");
    openapiFields.add("name");
    openapiFields.add("depends_on");
    openapiFields.add("array_node");
    openapiFields.add("input_node");
    openapiFields.add("sql_node");
    openapiFields.add("udf_node");
    openapiFields.add("retry_strategy");
    openapiFields.add("expand_node_output");
    openapiFields.add("deadline");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskGraphNode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TaskGraphNode.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskGraphNode is not found in the empty JSON string", TaskGraphNode.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("client_node_id") != null && !jsonObj.get("client_node_id").isJsonNull()) && !jsonObj.get("client_node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_node_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("depends_on") != null && !jsonObj.get("depends_on").isJsonNull()) && !jsonObj.get("depends_on").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `depends_on` to be an array in the JSON string but got `%s`", jsonObj.get("depends_on").toString()));
      }
      // validate the optional field `array_node`
      if (jsonObj.get("array_node") != null && !jsonObj.get("array_node").isJsonNull()) {
        UDFArrayDetails.validateJsonObject(jsonObj.getAsJsonObject("array_node"));
      }
      // validate the optional field `input_node`
      if (jsonObj.get("input_node") != null && !jsonObj.get("input_node").isJsonNull()) {
        TGInputNodeData.validateJsonObject(jsonObj.getAsJsonObject("input_node"));
      }
      // validate the optional field `sql_node`
      if (jsonObj.get("sql_node") != null && !jsonObj.get("sql_node").isJsonNull()) {
        TGSQLNodeData.validateJsonObject(jsonObj.getAsJsonObject("sql_node"));
      }
      // validate the optional field `udf_node`
      if (jsonObj.get("udf_node") != null && !jsonObj.get("udf_node").isJsonNull()) {
        TGUDFNodeData.validateJsonObject(jsonObj.getAsJsonObject("udf_node"));
      }
      // validate the optional field `retry_strategy`
      if (jsonObj.get("retry_strategy") != null && !jsonObj.get("retry_strategy").isJsonNull()) {
        RetryStrategy.validateJsonObject(jsonObj.getAsJsonObject("retry_strategy"));
      }
      if ((jsonObj.get("expand_node_output") != null && !jsonObj.get("expand_node_output").isJsonNull()) && !jsonObj.get("expand_node_output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand_node_output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand_node_output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskGraphNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskGraphNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskGraphNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskGraphNode.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskGraphNode>() {
           @Override
           public void write(JsonWriter out, TaskGraphNode value) throws IOException {
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
           public TaskGraphNode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskGraphNode instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskGraphNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskGraphNode
  * @throws IOException if the JSON string is invalid with respect to TaskGraphNode
  */
  public static TaskGraphNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskGraphNode.class);
  }

 /**
  * Convert an instance of TaskGraphNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

