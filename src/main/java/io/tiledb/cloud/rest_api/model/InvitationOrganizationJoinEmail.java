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
 * Encapsulates information regarding inviting people using email to join organization, same permissions for all invitees
 */
@ApiModel(description = "Encapsulates information regarding inviting people using email to join organization, same permissions for all invitees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class InvitationOrganizationJoinEmail {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<NamespaceActions> actions = null;

  public static final String SERIALIZED_NAME_ORGANIZATION_ROLE = "organization_role";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ROLE)
  private OrganizationRoles organizationRole;

  public static final String SERIALIZED_NAME_INVITEE_EMAIL = "invitee_email";
  @SerializedName(SERIALIZED_NAME_INVITEE_EMAIL)
  private List<String> inviteeEmail = new ArrayList<>();

  public InvitationOrganizationJoinEmail() {
  }

  public InvitationOrganizationJoinEmail actions(List<NamespaceActions> actions) {
    
    this.actions = actions;
    return this;
  }

  public InvitationOrganizationJoinEmail addActionsItem(NamespaceActions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
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
  public InvitationOrganizationJoinEmail putAdditionalProperty(String key, Object value) {
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
    InvitationOrganizationJoinEmail invitationOrganizationJoinEmail = (InvitationOrganizationJoinEmail) o;
    return Objects.equals(this.actions, invitationOrganizationJoinEmail.actions) &&
        Objects.equals(this.organizationRole, invitationOrganizationJoinEmail.organizationRole) &&
        Objects.equals(this.inviteeEmail, invitationOrganizationJoinEmail.inviteeEmail)&&
        Objects.equals(this.additionalProperties, invitationOrganizationJoinEmail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, organizationRole, inviteeEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationOrganizationJoinEmail {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("organization_role");
    openapiFields.add("invitee_email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("organization_role");
    openapiRequiredFields.add("invitee_email");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvitationOrganizationJoinEmail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InvitationOrganizationJoinEmail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvitationOrganizationJoinEmail is not found in the empty JSON string", InvitationOrganizationJoinEmail.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvitationOrganizationJoinEmail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) && !jsonObj.get("actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("invitee_email") != null && !jsonObj.get("invitee_email").isJsonNull()) && !jsonObj.get("invitee_email").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `invitee_email` to be an array in the JSON string but got `%s`", jsonObj.get("invitee_email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvitationOrganizationJoinEmail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvitationOrganizationJoinEmail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvitationOrganizationJoinEmail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvitationOrganizationJoinEmail.class));

       return (TypeAdapter<T>) new TypeAdapter<InvitationOrganizationJoinEmail>() {
           @Override
           public void write(JsonWriter out, InvitationOrganizationJoinEmail value) throws IOException {
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
           public InvitationOrganizationJoinEmail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InvitationOrganizationJoinEmail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InvitationOrganizationJoinEmail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvitationOrganizationJoinEmail
  * @throws IOException if the JSON string is invalid with respect to InvitationOrganizationJoinEmail
  */
  public static InvitationOrganizationJoinEmail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvitationOrganizationJoinEmail.class);
  }

 /**
  * Convert an instance of InvitationOrganizationJoinEmail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

