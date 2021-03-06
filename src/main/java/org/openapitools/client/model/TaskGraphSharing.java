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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TaskGraphActions;

/**
 * details for sharing a given registered task graph
 */
@ApiModel(description = "details for sharing a given registered task graph")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class TaskGraphSharing {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<TaskGraphActions> actions = null;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAMESPACE_TYPE = "namespace_type";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_TYPE)
  private String namespaceType;

  public TaskGraphSharing() { 
  }

  public TaskGraphSharing actions(List<TaskGraphActions> actions) {
    
    this.actions = actions;
    return this;
  }

  public TaskGraphSharing addActionsItem(TaskGraphActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<TaskGraphActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List of permitted actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[fetch_task_graph, share_task_graph]", value = "List of permitted actions")

  public List<TaskGraphActions> getActions() {
    return actions;
  }


  public void setActions(List<TaskGraphActions> actions) {
    this.actions = actions;
  }


  public TaskGraphSharing namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * namespace being granted array access can be a user or organization
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyOrganization", value = "namespace being granted array access can be a user or organization")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public TaskGraphSharing namespaceType(String namespaceType) {
    
    this.namespaceType = namespaceType;
    return this;
  }

   /**
   * details on if the namespace is a organization or user
   * @return namespaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "organization", value = "details on if the namespace is a organization or user")

  public String getNamespaceType() {
    return namespaceType;
  }


  public void setNamespaceType(String namespaceType) {
    this.namespaceType = namespaceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskGraphSharing taskGraphSharing = (TaskGraphSharing) o;
    return Objects.equals(this.actions, taskGraphSharing.actions) &&
        Objects.equals(this.namespace, taskGraphSharing.namespace) &&
        Objects.equals(this.namespaceType, taskGraphSharing.namespaceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, namespace, namespaceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskGraphSharing {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    namespaceType: ").append(toIndentedString(namespaceType)).append("\n");
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

}

