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
import java.util.ArrayList;
import java.util.List;

import io.tiledb.cloud.rest_api.JSON;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Object including group info and pagination metadata
 */
@ApiModel(description = "Object including group info and pagination metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class GroupBrowserData {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupInfo> groups = null;

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  private PaginationMetadata paginationMetadata;

  public GroupBrowserData() { 
  }

  public GroupBrowserData groups(List<GroupInfo> groups) {
    
    this.groups = groups;
    return this;
  }

  public GroupBrowserData addGroupsItem(GroupInfo groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Groups Info
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Groups Info")

  public List<GroupInfo> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupInfo> groups) {
    this.groups = groups;
  }


  public GroupBrowserData paginationMetadata(PaginationMetadata paginationMetadata) {
    
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
    GroupBrowserData groupBrowserData = (GroupBrowserData) o;
    return Objects.equals(this.groups, groupBrowserData.groups) &&
        Objects.equals(this.paginationMetadata, groupBrowserData.paginationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, paginationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBrowserData {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("groups");
    openapiFields.add("pagination_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupBrowserData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupBrowserData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupBrowserData is not found in the empty JSON string", GroupBrowserData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!GroupBrowserData.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupBrowserData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
      if (jsonArraygroups != null) {
        // ensure the json data is an array
        if (!jsonObj.get("groups").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
        }

        // validate the optional field `groups` (array)
        for (int i = 0; i < jsonArraygroups.size(); i++) {
          GroupInfo.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `pagination_metadata`
      if (jsonObj.getAsJsonObject("pagination_metadata") != null) {
        PaginationMetadata.validateJsonObject(jsonObj.getAsJsonObject("pagination_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupBrowserData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupBrowserData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupBrowserData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupBrowserData.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupBrowserData>() {
           @Override
           public void write(JsonWriter out, GroupBrowserData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupBrowserData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupBrowserData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupBrowserData
  * @throws IOException if the JSON string is invalid with respect to GroupBrowserData
  */
  public static GroupBrowserData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupBrowserData.class);
  }

 /**
  * Convert an instance of GroupBrowserData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
