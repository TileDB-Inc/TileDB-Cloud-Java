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
 * details for sharing a given UDF
 */
@ApiModel(description = "details for sharing a given UDF")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class UDFSharing {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<UDFActions> actions = null;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAMESPACE_TYPE = "namespace_type";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_TYPE)
  private String namespaceType;

  public UDFSharing() {
  }

  public UDFSharing actions(List<UDFActions> actions) {
    
    this.actions = actions;
    return this;
  }

  public UDFSharing addActionsItem(UDFActions actionsItem) {
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
  @ApiModelProperty(example = "[fetch, share]", value = "List of permitted actions")

  public List<UDFActions> getActions() {
    return actions;
  }


  public void setActions(List<UDFActions> actions) {
    this.actions = actions;
  }


  public UDFSharing namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * namespace being granted array access can be a user or organization
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MyOrganization", value = "namespace being granted array access can be a user or organization")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public UDFSharing namespaceType(String namespaceType) {
    
    this.namespaceType = namespaceType;
    return this;
  }

   /**
   * details on if the namespace is a organization or user
   * @return namespaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "organization", value = "details on if the namespace is a organization or user")

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
   */
  public UDFSharing putAdditionalProperty(String key, Object value) {
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
    UDFSharing udFSharing = (UDFSharing) o;
    return Objects.equals(this.actions, udFSharing.actions) &&
        Objects.equals(this.namespace, udFSharing.namespace) &&
        Objects.equals(this.namespaceType, udFSharing.namespaceType)&&
        Objects.equals(this.additionalProperties, udFSharing.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, namespace, namespaceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFSharing {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
    openapiFields.add("actions");
    openapiFields.add("namespace");
    openapiFields.add("namespace_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UDFSharing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UDFSharing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UDFSharing is not found in the empty JSON string", UDFSharing.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) && !jsonObj.get("actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
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
       if (!UDFSharing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UDFSharing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UDFSharing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UDFSharing.class));

       return (TypeAdapter<T>) new TypeAdapter<UDFSharing>() {
           @Override
           public void write(JsonWriter out, UDFSharing value) throws IOException {
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
           public UDFSharing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UDFSharing instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UDFSharing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UDFSharing
  * @throws IOException if the JSON string is invalid with respect to UDFSharing
  */
  public static UDFSharing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UDFSharing.class);
  }

 /**
  * Convert an instance of UDFSharing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

