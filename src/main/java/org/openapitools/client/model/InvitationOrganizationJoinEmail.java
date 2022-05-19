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
 * Encapsulates information regarding inviting people using email to join organization, same permissions for all invitees
 */
@ApiModel(description = "Encapsulates information regarding inviting people using email to join organization, same permissions for all invitees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class InvitationOrganizationJoinEmail {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<NamespaceActions> actions = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ROLE = "organization_role";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ROLE)
  private OrganizationRoles organizationRole;

  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private List<String> inviteeEmail = new ArrayList<String>();

  public InvitationOrganizationJoinEmail() { 
  }

  public InvitationOrganizationJoinEmail actions(List<NamespaceActions> actions) {
    
    this.actions = actions;
    return this;
  }

  public InvitationOrganizationJoinEmail addActionsItem(NamespaceActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<NamespaceActions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * List of permitted actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[read, write]", value = "List of permitted actions")

  public List<NamespaceActions> getActions() {
    return actions;
  }


  public void setActions(List<NamespaceActions> actions) {
    this.actions = actions;
  }


  public InvitationOrganizationJoinEmail organizationRole(OrganizationRoles organizationRole) {
    
    this.organizationRole = organizationRole;
    return this;
  }

   /**
   * Get organizationRole
   * @return organizationRole
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OrganizationRoles getOrganizationRole() {
    return organizationRole;
  }


  public void setOrganizationRole(OrganizationRoles organizationRole) {
    this.organizationRole = organizationRole;
  }


  public InvitationOrganizationJoinEmail inviteeEmail(List<String> inviteeEmail) {
    
    this.inviteeEmail = inviteeEmail;
    return this;
  }

  public InvitationOrganizationJoinEmail addInviteeEmailItem(String inviteeEmailItem) {
    this.inviteeEmail.add(inviteeEmailItem);
    return this;
  }

   /**
   * Get inviteeEmail
   * @return inviteeEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getInviteeEmail() {
    return inviteeEmail;
  }


  public void setInviteeEmail(List<String> inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationOrganizationJoinEmail invitationOrganizationJoinEmail = (InvitationOrganizationJoinEmail) o;
    return Objects.equals(this.actions, invitationOrganizationJoinEmail.actions) &&
        Objects.equals(this.organizationRole, invitationOrganizationJoinEmail.organizationRole) &&
        Objects.equals(this.inviteeEmail, invitationOrganizationJoinEmail.inviteeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, organizationRole, inviteeEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationOrganizationJoinEmail {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
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

