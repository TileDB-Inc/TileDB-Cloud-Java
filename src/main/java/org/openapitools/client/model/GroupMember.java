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
import org.openapitools.client.model.GroupMemberType;

/**
 * A groups member, array or another groups, to add or remove from an existing group.
 */
@ApiModel(description = "A groups member, array or another groups, to add or remove from an existing group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class GroupMember {
  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MEMBER_TYPE = "member_type";
  @SerializedName(SERIALIZED_NAME_MEMBER_TYPE)
  private GroupMemberType memberType;

  public GroupMember() { 
  }

  public GroupMember namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * The namespace of the asset.
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The namespace of the asset.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public GroupMember name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name or id of the asset.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name or id of the asset.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GroupMember memberType(GroupMemberType memberType) {
    
    this.memberType = memberType;
    return this;
  }

   /**
   * Get memberType
   * @return memberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupMemberType getMemberType() {
    return memberType;
  }


  public void setMemberType(GroupMemberType memberType) {
    this.memberType = memberType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMember groupMember = (GroupMember) o;
    return Objects.equals(this.namespace, groupMember.namespace) &&
        Objects.equals(this.name, groupMember.name) &&
        Objects.equals(this.memberType, groupMember.memberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, name, memberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMember {\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
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

