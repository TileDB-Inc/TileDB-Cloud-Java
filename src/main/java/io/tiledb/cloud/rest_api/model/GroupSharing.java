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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.tiledb.cloud.rest_api.model.ArrayActions;
import io.tiledb.cloud.rest_api.model.GroupActions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tiledb.cloud.rest_api.JSON;

/**
 * sharing state of a group with a namespace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class GroupSharing {
  public static final String SERIALIZED_NAME_GROUP_ACTIONS = "group_actions";
  @SerializedName(SERIALIZED_NAME_GROUP_ACTIONS)
  private List<GroupActions> groupActions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARRAY_ACTIONS = "array_actions";
  @SerializedName(SERIALIZED_NAME_ARRAY_ACTIONS)
  private List<ArrayActions> arrayActions = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAMESPACE_TYPE = "namespace_type";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_TYPE)
  private String namespaceType;

  public GroupSharing() {
  }

  public GroupSharing groupActions(List<GroupActions> groupActions) {
    this.groupActions = groupActions;
    return this;
  }

  public GroupSharing addGroupActionsItem(GroupActions groupActionsItem) {
    if (this.groupActions == null) {
      this.groupActions = new ArrayList<>();
    }
    this.groupActions.add(groupActionsItem);
    return this;
  }

  /**
   * List of permitted actions for the group and all subgroups
   * @return groupActions
   */
  @javax.annotation.Nullable
  public List<GroupActions> getGroupActions() {
    return groupActions;
  }

  public void setGroupActions(List<GroupActions> groupActions) {
    this.groupActions = groupActions;
  }


  public GroupSharing arrayActions(List<ArrayActions> arrayActions) {
    this.arrayActions = arrayActions;
    return this;
  }

  public GroupSharing addArrayActionsItem(ArrayActions arrayActionsItem) {
    if (this.arrayActions == null) {
      this.arrayActions = new ArrayList<>();
    }
    this.arrayActions.add(arrayActionsItem);
    return this;
  }

  /**
   * List of permitted actions for all the subarrays of the group
   * @return arrayActions
   */
  @javax.annotation.Nullable
  public List<ArrayActions> getArrayActions() {
    return arrayActions;
  }

  public void setArrayActions(List<ArrayActions> arrayActions) {
    this.arrayActions = arrayActions;
  }


  public GroupSharing namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * namespace being granted group access can be a user or organization
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public GroupSharing namespaceType(String namespaceType) {
    this.namespaceType = namespaceType;
    return this;
  }

  /**
   * details on if the namespace is a organization or user
   * @return namespaceType
   */
  @javax.annotation.Nullable
  public String getNamespaceType() {
    return namespaceType;
  }

  public void setNamespaceType(String namespaceType) {
    this.namespaceType = namespaceType;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GroupSharing instance itself
   */
  public GroupSharing putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    GroupSharing groupSharing = (GroupSharing) o;
    return Objects.equals(this.groupActions, groupSharing.groupActions) &&
        Objects.equals(this.arrayActions, groupSharing.arrayActions) &&
        Objects.equals(this.namespace, groupSharing.namespace) &&
        Objects.equals(this.namespaceType, groupSharing.namespaceType)&&
        Objects.equals(this.additionalProperties, groupSharing.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupActions, arrayActions, namespace, namespaceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSharing {\n");
    sb.append("    groupActions: ").append(toIndentedString(groupActions)).append("\n");
    sb.append("    arrayActions: ").append(toIndentedString(arrayActions)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    namespaceType: ").append(toIndentedString(namespaceType)).append("\n");
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
    openapiFields.add("group_actions");
    openapiFields.add("array_actions");
    openapiFields.add("namespace");
    openapiFields.add("namespace_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupSharing
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupSharing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupSharing is not found in the empty JSON string", GroupSharing.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("group_actions") != null && !jsonObj.get("group_actions").isJsonNull() && !jsonObj.get("group_actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_actions` to be an array in the JSON string but got `%s`", jsonObj.get("group_actions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_actions") != null && !jsonObj.get("array_actions").isJsonNull() && !jsonObj.get("array_actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_actions` to be an array in the JSON string but got `%s`", jsonObj.get("array_actions").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("namespace_type") != null && !jsonObj.get("namespace_type").isJsonNull()) && !jsonObj.get("namespace_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupSharing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupSharing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupSharing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupSharing.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupSharing>() {
           @Override
           public void write(JsonWriter out, GroupSharing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupSharing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GroupSharing instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
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
   * Create an instance of GroupSharing given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupSharing
   * @throws IOException if the JSON string is invalid with respect to GroupSharing
   */
  public static GroupSharing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupSharing.class);
  }

  /**
   * Convert an instance of GroupSharing to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

