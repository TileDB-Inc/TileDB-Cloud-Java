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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Initial attributes for the creation of a group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T11:51:21.275554462Z[Etc/UTC]", comments = "Generator version: 7.12.0-SNAPSHOT")
public class GroupCreate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  @javax.annotation.Nullable
  private String parent;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  @javax.annotation.Nullable
  private String uri;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  @javax.annotation.Nullable
  private String logo;

  public static final String SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME = "access_credentials_name";
  @SerializedName(SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME)
  @javax.annotation.Nullable
  private String accessCredentialsName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  @javax.annotation.Nullable
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TEXT = "license_text";
  @SerializedName(SERIALIZED_NAME_LICENSE_TEXT)
  @javax.annotation.Nullable
  private String licenseText;

  public GroupCreate() {
  }

  public GroupCreate description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A human readable description of the contents of the group.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GroupCreate name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the group. If must be unique within the group.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GroupCreate parent(@javax.annotation.Nullable String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The unique name or id of the parent of the group. If empty, then the new group will be a top level group.
   * @return parent
   */
  @javax.annotation.Nullable
  public String getParent() {
    return parent;
  }

  public void setParent(@javax.annotation.Nullable String parent) {
    this.parent = parent;
  }


  public GroupCreate uri(@javax.annotation.Nullable String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * uri of group.
   * @return uri
   */
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }

  public void setUri(@javax.annotation.Nullable String uri) {
    this.uri = uri;
  }


  public GroupCreate logo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * logo (base64 encoded) for the group. Optional
   * @return logo
   */
  @javax.annotation.Nullable
  public String getLogo() {
    return logo;
  }

  public void setLogo(@javax.annotation.Nullable String logo) {
    this.logo = logo;
  }


  public GroupCreate accessCredentialsName(@javax.annotation.Nullable String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
    return this;
  }

  /**
   * the name of the access credentials to use. if unset, the default credentials will be used.
   * @return accessCredentialsName
   */
  @javax.annotation.Nullable
  public String getAccessCredentialsName() {
    return accessCredentialsName;
  }

  public void setAccessCredentialsName(@javax.annotation.Nullable String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
  }


  public GroupCreate tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GroupCreate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * optional tags for groups.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public GroupCreate licenseId(@javax.annotation.Nullable String licenseId) {
    this.licenseId = licenseId;
    return this;
  }

  /**
   * License identifier from SPDX License List or Custom.
   * @return licenseId
   */
  @javax.annotation.Nullable
  public String getLicenseId() {
    return licenseId;
  }

  public void setLicenseId(@javax.annotation.Nullable String licenseId) {
    this.licenseId = licenseId;
  }


  public GroupCreate licenseText(@javax.annotation.Nullable String licenseText) {
    this.licenseText = licenseText;
    return this;
  }

  /**
   * License text
   * @return licenseText
   */
  @javax.annotation.Nullable
  public String getLicenseText() {
    return licenseText;
  }

  public void setLicenseText(@javax.annotation.Nullable String licenseText) {
    this.licenseText = licenseText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupCreate groupCreate = (GroupCreate) o;
    return Objects.equals(this.description, groupCreate.description) &&
        Objects.equals(this.name, groupCreate.name) &&
        Objects.equals(this.parent, groupCreate.parent) &&
        Objects.equals(this.uri, groupCreate.uri) &&
        Objects.equals(this.logo, groupCreate.logo) &&
        Objects.equals(this.accessCredentialsName, groupCreate.accessCredentialsName) &&
        Objects.equals(this.tags, groupCreate.tags) &&
        Objects.equals(this.licenseId, groupCreate.licenseId) &&
        Objects.equals(this.licenseText, groupCreate.licenseText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parent, uri, logo, accessCredentialsName, tags, licenseId, licenseText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    accessCredentialsName: ").append(toIndentedString(accessCredentialsName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseText: ").append(toIndentedString(licenseText)).append("\n");
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
    openapiFields.add("access_credentials_name");
    openapiFields.add("tags");
    openapiFields.add("license_id");
    openapiFields.add("license_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupCreate is not found in the empty JSON string", GroupCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GroupCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("access_credentials_name") != null && !jsonObj.get("access_credentials_name").isJsonNull()) && !jsonObj.get("access_credentials_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_credentials_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_credentials_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonNull()) && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if ((jsonObj.get("license_text") != null && !jsonObj.get("license_text").isJsonNull()) && !jsonObj.get("license_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupCreate>() {
           @Override
           public void write(JsonWriter out, GroupCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GroupCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GroupCreate
   * @throws IOException if the JSON string is invalid with respect to GroupCreate
   */
  public static GroupCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupCreate.class);
  }

  /**
   * Convert an instance of GroupCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

