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
import org.openapitools.client.model.ArrayInfo;
import org.openapitools.client.model.GroupInfo;

/**
 * Object describing a single member of a group, which can be an array or a group
 */
@ApiModel(description = "Object describing a single member of a group, which can be an array or a group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class GroupEntry {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupInfo group;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private ArrayInfo array;

  public GroupEntry() { 
  }

  public GroupEntry group(GroupInfo group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupInfo getGroup() {
    return group;
  }


  public void setGroup(GroupInfo group) {
    this.group = group;
  }


  public GroupEntry array(ArrayInfo array) {
    
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArrayInfo getArray() {
    return array;
  }


  public void setArray(ArrayInfo array) {
    this.array = array;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupEntry groupEntry = (GroupEntry) o;
    return Objects.equals(this.group, groupEntry.group) &&
        Objects.equals(this.array, groupEntry.array);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, array);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupEntry {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
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

