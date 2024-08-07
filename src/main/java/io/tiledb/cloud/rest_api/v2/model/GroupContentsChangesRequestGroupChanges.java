/*
 * Tiledb Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v2.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * GroupContentsChangesRequestGroupChanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class GroupContentsChangesRequestGroupChanges {
  public static final String SERIALIZED_NAME_MEMBERS_TO_REMOVE = "members_to_remove";
  @SerializedName(SERIALIZED_NAME_MEMBERS_TO_REMOVE)
  private List<String> membersToRemove = null;

  public static final String SERIALIZED_NAME_MEMBERS_TO_ADD = "members_to_add";
  @SerializedName(SERIALIZED_NAME_MEMBERS_TO_ADD)
  private List<GroupMember> membersToAdd = null;

  public GroupContentsChangesRequestGroupChanges() { 
  }

  public GroupContentsChangesRequestGroupChanges membersToRemove(List<String> membersToRemove) {
    
    this.membersToRemove = membersToRemove;
    return this;
  }

  public GroupContentsChangesRequestGroupChanges addMembersToRemoveItem(String membersToRemoveItem) {
    if (this.membersToRemove == null) {
      this.membersToRemove = new ArrayList<>();
    }
    this.membersToRemove.add(membersToRemoveItem);
    return this;
  }

   /**
   * optional series of members to remove
   * @return membersToRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional series of members to remove")

  public List<String> getMembersToRemove() {
    return membersToRemove;
  }


  public void setMembersToRemove(List<String> membersToRemove) {
    this.membersToRemove = membersToRemove;
  }


  public GroupContentsChangesRequestGroupChanges membersToAdd(List<GroupMember> membersToAdd) {
    
    this.membersToAdd = membersToAdd;
    return this;
  }

  public GroupContentsChangesRequestGroupChanges addMembersToAddItem(GroupMember membersToAddItem) {
    if (this.membersToAdd == null) {
      this.membersToAdd = new ArrayList<>();
    }
    this.membersToAdd.add(membersToAddItem);
    return this;
  }

   /**
   * optional series of members to add
   * @return membersToAdd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional series of members to add")

  public List<GroupMember> getMembersToAdd() {
    return membersToAdd;
  }


  public void setMembersToAdd(List<GroupMember> membersToAdd) {
    this.membersToAdd = membersToAdd;
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
  public GroupContentsChangesRequestGroupChanges putAdditionalProperty(String key, Object value) {
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
    GroupContentsChangesRequestGroupChanges groupContentsChangesRequestGroupChanges = (GroupContentsChangesRequestGroupChanges) o;
    return Objects.equals(this.membersToRemove, groupContentsChangesRequestGroupChanges.membersToRemove) &&
        Objects.equals(this.membersToAdd, groupContentsChangesRequestGroupChanges.membersToAdd)&&
        Objects.equals(this.additionalProperties, groupContentsChangesRequestGroupChanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membersToRemove, membersToAdd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupContentsChangesRequestGroupChanges {\n");
    sb.append("    membersToRemove: ").append(toIndentedString(membersToRemove)).append("\n");
    sb.append("    membersToAdd: ").append(toIndentedString(membersToAdd)).append("\n");
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
    openapiFields.add("members_to_remove");
    openapiFields.add("members_to_add");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupContentsChangesRequestGroupChanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupContentsChangesRequestGroupChanges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupContentsChangesRequestGroupChanges is not found in the empty JSON string", GroupContentsChangesRequestGroupChanges.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("members_to_remove") != null && !jsonObj.get("members_to_remove").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members_to_remove` to be an array in the JSON string but got `%s`", jsonObj.get("members_to_remove").toString()));
      }
      JsonArray jsonArraymembersToAdd = jsonObj.getAsJsonArray("members_to_add");
      if (jsonArraymembersToAdd != null) {
        // ensure the json data is an array
        if (!jsonObj.get("members_to_add").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `members_to_add` to be an array in the JSON string but got `%s`", jsonObj.get("members_to_add").toString()));
        }

        // validate the optional field `members_to_add` (array)
        for (int i = 0; i < jsonArraymembersToAdd.size(); i++) {
          GroupMember.validateJsonObject(jsonArraymembersToAdd.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupContentsChangesRequestGroupChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupContentsChangesRequestGroupChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupContentsChangesRequestGroupChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupContentsChangesRequestGroupChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupContentsChangesRequestGroupChanges>() {
           @Override
           public void write(JsonWriter out, GroupContentsChangesRequestGroupChanges value) throws IOException {
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
           public GroupContentsChangesRequestGroupChanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupContentsChangesRequestGroupChanges instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupContentsChangesRequestGroupChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupContentsChangesRequestGroupChanges
  * @throws IOException if the JSON string is invalid with respect to GroupContentsChangesRequestGroupChanges
  */
  public static GroupContentsChangesRequestGroupChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupContentsChangesRequestGroupChanges.class);
  }

 /**
  * Convert an instance of GroupContentsChangesRequestGroupChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

