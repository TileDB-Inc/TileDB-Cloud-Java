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
import org.openapitools.client.model.Invitation;
import org.openapitools.client.model.PaginationMetadata;

/**
 * Object including invitations and metadata
 */
@ApiModel(description = "Object including invitations and metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class InvitationData {
  public static final String SERIALIZED_NAME_INVITATIONS = "invitations";
  @SerializedName(SERIALIZED_NAME_INVITATIONS)
  private List<Invitation> invitations = null;

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  private PaginationMetadata paginationMetadata;

  public InvitationData() { 
  }

  public InvitationData invitations(List<Invitation> invitations) {
    
    this.invitations = invitations;
    return this;
  }

  public InvitationData addInvitationsItem(Invitation invitationsItem) {
    if (this.invitations == null) {
      this.invitations = new ArrayList<Invitation>();
    }
    this.invitations.add(invitationsItem);
    return this;
  }

   /**
   * List of invitations
   * @return invitations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of invitations")

  public List<Invitation> getInvitations() {
    return invitations;
  }


  public void setInvitations(List<Invitation> invitations) {
    this.invitations = invitations;
  }


  public InvitationData paginationMetadata(PaginationMetadata paginationMetadata) {
    
    this.paginationMetadata = paginationMetadata;
    return this;
  }

   /**
   * Get paginationMetadata
   * @return paginationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }


  public void setPaginationMetadata(PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationData invitationData = (InvitationData) o;
    return Objects.equals(this.invitations, invitationData.invitations) &&
        Objects.equals(this.paginationMetadata, invitationData.paginationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitations, paginationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationData {\n");
    sb.append("    invitations: ").append(toIndentedString(invitations)).append("\n");
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
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

