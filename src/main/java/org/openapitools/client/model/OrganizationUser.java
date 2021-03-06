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
import org.openapitools.client.model.NamespaceActions;
import org.openapitools.client.model.OrganizationRoles;

/**
 * user in an organization
 */
@ApiModel(description = "user in an organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class OrganizationUser {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private String organizationId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private OrganizationRoles role;

  public static final String SERIALIZED_NAME_ALLOWED_ACTIONS = "allowed_actions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACTIONS)
  private List<NamespaceActions> allowedActions = null;

  public OrganizationUser() { 
  }

  public OrganizationUser userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * unique ID of user
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "unique ID of user")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public OrganizationUser organizationId(String organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * unique ID of organization
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "unique ID of organization")

  public String getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public OrganizationUser username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * username for user
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "username", value = "username for user")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public OrganizationUser organizationName(String organizationName) {
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * name of organization
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyOrganization", value = "name of organization")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  public OrganizationUser role(OrganizationRoles role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrganizationRoles getRole() {
    return role;
  }


  public void setRole(OrganizationRoles role) {
    this.role = role;
  }


  public OrganizationUser allowedActions(List<NamespaceActions> allowedActions) {
    
    this.allowedActions = allowedActions;
    return this;
  }

  public OrganizationUser addAllowedActionsItem(NamespaceActions allowedActionsItem) {
    if (this.allowedActions == null) {
      this.allowedActions = new ArrayList<NamespaceActions>();
    }
    this.allowedActions.add(allowedActionsItem);
    return this;
  }

   /**
   * list of actions user is allowed to do on this organization
   * @return allowedActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of actions user is allowed to do on this organization")

  public List<NamespaceActions> getAllowedActions() {
    return allowedActions;
  }


  public void setAllowedActions(List<NamespaceActions> allowedActions) {
    this.allowedActions = allowedActions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUser organizationUser = (OrganizationUser) o;
    return Objects.equals(this.userId, organizationUser.userId) &&
        Objects.equals(this.organizationId, organizationUser.organizationId) &&
        Objects.equals(this.username, organizationUser.username) &&
        Objects.equals(this.organizationName, organizationUser.organizationName) &&
        Objects.equals(this.role, organizationUser.role) &&
        Objects.equals(this.allowedActions, organizationUser.allowedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, organizationId, username, organizationName, role, allowedActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    allowedActions: ").append(toIndentedString(allowedActions)).append("\n");
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

