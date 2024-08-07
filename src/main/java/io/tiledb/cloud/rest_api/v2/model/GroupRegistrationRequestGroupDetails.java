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

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * Initial attributes for the creation of a group.
 */
@ApiModel(description = "Initial attributes for the creation of a group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class GroupRegistrationRequestGroupDetails {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TEXT = "license_text";
  @SerializedName(SERIALIZED_NAME_LICENSE_TEXT)
  private String licenseText;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME = "access_credentials_name";
  @SerializedName(SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME)
  private String accessCredentialsName;

  public GroupRegistrationRequestGroupDetails() { 
  }

  public GroupRegistrationRequestGroupDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human readable description of the contents of the group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable description of the contents of the group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GroupRegistrationRequestGroupDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the group. If must be unique within the group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group. If must be unique within the group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GroupRegistrationRequestGroupDetails parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * The unique name or id of the parent of the group. If empty, then the new group will be a top level group.
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique name or id of the parent of the group. If empty, then the new group will be a top level group.")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    this.parent = parent;
  }


  public GroupRegistrationRequestGroupDetails uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * uri of group.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "uri of group.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public GroupRegistrationRequestGroupDetails logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * logo (base64 encoded) for the group. Optional
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logo (base64 encoded) for the group. Optional")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public GroupRegistrationRequestGroupDetails tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GroupRegistrationRequestGroupDetails addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * optional tags for groups.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional tags for groups.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GroupRegistrationRequestGroupDetails licenseId(String licenseId) {
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * License identifier from SPDX License List or Custom.
   * @return licenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License identifier from SPDX License List or Custom.")

  public String getLicenseId() {
    return licenseId;
  }


  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }


  public GroupRegistrationRequestGroupDetails licenseText(String licenseText) {
    
    this.licenseText = licenseText;
    return this;
  }

   /**
   * License text
   * @return licenseText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License text")

  public String getLicenseText() {
    return licenseText;
  }


  public void setLicenseText(String licenseText) {
    this.licenseText = licenseText;
  }


  public GroupRegistrationRequestGroupDetails region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * region of the group
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "region of the group")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public GroupRegistrationRequestGroupDetails accessCredentialsName(String accessCredentialsName) {
    
    this.accessCredentialsName = accessCredentialsName;
    return this;
  }

   /**
   * the name of the access credentials to use. if unset, the default credentials will be used.
   * @return accessCredentialsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the access credentials to use. if unset, the default credentials will be used.")

  public String getAccessCredentialsName() {
    return accessCredentialsName;
  }


  public void setAccessCredentialsName(String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
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
  public GroupRegistrationRequestGroupDetails putAdditionalProperty(String key, Object value) {
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
    GroupRegistrationRequestGroupDetails groupRegistrationRequestGroupDetails = (GroupRegistrationRequestGroupDetails) o;
    return Objects.equals(this.description, groupRegistrationRequestGroupDetails.description) &&
        Objects.equals(this.name, groupRegistrationRequestGroupDetails.name) &&
        Objects.equals(this.parent, groupRegistrationRequestGroupDetails.parent) &&
        Objects.equals(this.uri, groupRegistrationRequestGroupDetails.uri) &&
        Objects.equals(this.logo, groupRegistrationRequestGroupDetails.logo) &&
        Objects.equals(this.tags, groupRegistrationRequestGroupDetails.tags) &&
        Objects.equals(this.licenseId, groupRegistrationRequestGroupDetails.licenseId) &&
        Objects.equals(this.licenseText, groupRegistrationRequestGroupDetails.licenseText) &&
        Objects.equals(this.region, groupRegistrationRequestGroupDetails.region) &&
        Objects.equals(this.accessCredentialsName, groupRegistrationRequestGroupDetails.accessCredentialsName)&&
        Objects.equals(this.additionalProperties, groupRegistrationRequestGroupDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parent, uri, logo, tags, licenseId, licenseText, region, accessCredentialsName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRegistrationRequestGroupDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseText: ").append(toIndentedString(licenseText)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    accessCredentialsName: ").append(toIndentedString(accessCredentialsName)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("parent");
    openapiFields.add("uri");
    openapiFields.add("logo");
    openapiFields.add("tags");
    openapiFields.add("license_id");
    openapiFields.add("license_text");
    openapiFields.add("region");
    openapiFields.add("access_credentials_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupRegistrationRequestGroupDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupRegistrationRequestGroupDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupRegistrationRequestGroupDetails is not found in the empty JSON string", GroupRegistrationRequestGroupDetails.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if (jsonObj.get("license_text") != null && !jsonObj.get("license_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_text").toString()));
      }
      if (jsonObj.get("region") != null && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if (jsonObj.get("access_credentials_name") != null && !jsonObj.get("access_credentials_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_credentials_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_credentials_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupRegistrationRequestGroupDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupRegistrationRequestGroupDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupRegistrationRequestGroupDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupRegistrationRequestGroupDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupRegistrationRequestGroupDetails>() {
           @Override
           public void write(JsonWriter out, GroupRegistrationRequestGroupDetails value) throws IOException {
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
           public GroupRegistrationRequestGroupDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupRegistrationRequestGroupDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupRegistrationRequestGroupDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupRegistrationRequestGroupDetails
  * @throws IOException if the JSON string is invalid with respect to GroupRegistrationRequestGroupDetails
  */
  public static GroupRegistrationRequestGroupDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupRegistrationRequestGroupDetails.class);
  }

 /**
  * Convert an instance of GroupRegistrationRequestGroupDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

