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


package io.tiledb.cloud.rest_api.v1.model;

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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v1.JSON;

/**
 * A request to change the members of a group. Contains assets to add or remove.
 */
@ApiModel(description = "A request to change the members of a group. Contains assets to add or remove.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class GroupChanges {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private List<GroupMember> add = null;

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private List<GroupMember> remove = null;

  public GroupChanges() {
  }

  public GroupChanges add(List<GroupMember> add) {
    
    this.add = add;
    return this;
  }

  public GroupChanges addAddItem(GroupMember addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * the assets, arrays or groups, to add to the group.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the assets, arrays or groups, to add to the group.")

  public List<GroupMember> getAdd() {
    return add;
  }


  public void setAdd(List<GroupMember> add) {
    this.add = add;
  }


  public GroupChanges remove(List<GroupMember> remove) {
    
    this.remove = remove;
    return this;
  }

  public GroupChanges addRemoveItem(GroupMember removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<>();
    }
    this.remove.add(removeItem);
    return this;
  }

   /**
   * the assets, arrays or groups, to remove from the group.
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the assets, arrays or groups, to remove from the group.")

  public List<GroupMember> getRemove() {
    return remove;
  }


  public void setRemove(List<GroupMember> remove) {
    this.remove = remove;
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
  public GroupChanges putAdditionalProperty(String key, Object value) {
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
    GroupChanges groupChanges = (GroupChanges) o;
    return Objects.equals(this.add, groupChanges.add) &&
        Objects.equals(this.remove, groupChanges.remove)&&
        Objects.equals(this.additionalProperties, groupChanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupChanges {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("remove");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupChanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupChanges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupChanges is not found in the empty JSON string", GroupChanges.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayadd = jsonObj.getAsJsonArray("add");
      if (jsonArrayadd != null) {
        // ensure the json data is an array
        if (!jsonObj.get("add").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `add` to be an array in the JSON string but got `%s`", jsonObj.get("add").toString()));
        }

        // validate the optional field `add` (array)
        for (int i = 0; i < jsonArrayadd.size(); i++) {
          GroupMember.validateJsonObject(jsonArrayadd.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayremove = jsonObj.getAsJsonArray("remove");
      if (jsonArrayremove != null) {
        // ensure the json data is an array
        if (!jsonObj.get("remove").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `remove` to be an array in the JSON string but got `%s`", jsonObj.get("remove").toString()));
        }

        // validate the optional field `remove` (array)
        for (int i = 0; i < jsonArrayremove.size(); i++) {
          GroupMember.validateJsonObject(jsonArrayremove.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupChanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupChanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupChanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupChanges.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupChanges>() {
           @Override
           public void write(JsonWriter out, GroupChanges value) throws IOException {
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
           public GroupChanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupChanges instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupChanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupChanges
  * @throws IOException if the JSON string is invalid with respect to GroupChanges
  */
  public static GroupChanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupChanges.class);
  }

 /**
  * Convert an instance of GroupChanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

