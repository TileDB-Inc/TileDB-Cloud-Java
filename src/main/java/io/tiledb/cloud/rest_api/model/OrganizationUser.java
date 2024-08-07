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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * user in an organization
 */
@ApiModel(description = "user in an organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
/**
 * @deprecated This class is now moved to io.tiledb.cloud.rest_api.v1.model
 */
@Deprecated
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
      this.allowedActions = new ArrayList<>();
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
  public OrganizationUser putAdditionalProperty(String key, Object value) {
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
    OrganizationUser organizationUser = (OrganizationUser) o;
    return Objects.equals(this.userId, organizationUser.userId) &&
        Objects.equals(this.organizationId, organizationUser.organizationId) &&
        Objects.equals(this.username, organizationUser.username) &&
        Objects.equals(this.organizationName, organizationUser.organizationName) &&
        Objects.equals(this.role, organizationUser.role) &&
        Objects.equals(this.allowedActions, organizationUser.allowedActions)&&
        Objects.equals(this.additionalProperties, organizationUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, organizationId, username, organizationName, role, allowedActions, additionalProperties);
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
    openapiFields.add("user_id");
    openapiFields.add("organization_id");
    openapiFields.add("username");
    openapiFields.add("organization_name");
    openapiFields.add("role");
    openapiFields.add("allowed_actions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganizationUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrganizationUser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganizationUser is not found in the empty JSON string", OrganizationUser.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if ((jsonObj.get("organization_id") != null && !jsonObj.get("organization_id").isJsonNull()) && !jsonObj.get("organization_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_id").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("allowed_actions") != null && !jsonObj.get("allowed_actions").isJsonNull()) && !jsonObj.get("allowed_actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_actions` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_actions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganizationUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganizationUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganizationUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganizationUser.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganizationUser>() {
           @Override
           public void write(JsonWriter out, OrganizationUser value) throws IOException {
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
           public OrganizationUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrganizationUser instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrganizationUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganizationUser
  * @throws IOException if the JSON string is invalid with respect to OrganizationUser
  */
  public static OrganizationUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganizationUser.class);
  }

 /**
  * Convert an instance of OrganizationUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

