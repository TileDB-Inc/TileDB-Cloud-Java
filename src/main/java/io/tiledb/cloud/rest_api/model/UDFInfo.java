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
 * User-defined function that can persist in db, used and shared multiple times
 */
@ApiModel(description = "User-defined function that can persist in db, used and shared multiple times")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T12:18:15.115227Z[Etc/UTC]")
public class UDFInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private UDFLanguage language;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private UDFType type;

  public static final String SERIALIZED_NAME_README = "readme";
  @SerializedName(SERIALIZED_NAME_README)
  private String readme;

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TEXT = "license_text";
  @SerializedName(SERIALIZED_NAME_LICENSE_TEXT)
  private String licenseText;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public UDFInfo() {
  }

  public UDFInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of UDF
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique ID of UDF")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UDFInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of UDF
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of UDF")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UDFInfo language(UDFLanguage language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UDFLanguage getLanguage() {
    return language;
  }


  public void setLanguage(UDFLanguage language) {
    this.language = language;
  }


  public UDFInfo type(UDFType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UDFType getType() {
    return type;
  }


  public void setType(UDFType type) {
    this.type = type;
  }


  public UDFInfo readme(String readme) {
    
    this.readme = readme;
    return this;
  }

   /**
   * Markdown readme of UDFs
   * @return readme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Markdown readme of UDFs")

  public String getReadme() {
    return readme;
  }


  public void setReadme(String readme) {
    this.readme = readme;
  }


  public UDFInfo licenseId(String licenseId) {
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * License identifier from SPDX License List or Custom
   * @return licenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License identifier from SPDX License List or Custom")

  public String getLicenseId() {
    return licenseId;
  }


  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }


  public UDFInfo licenseText(String licenseText) {
    
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


  public UDFInfo tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UDFInfo addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * optional tags for UDF
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional tags for UDF")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
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
  public UDFInfo putAdditionalProperty(String key, Object value) {
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
    UDFInfo udFInfo = (UDFInfo) o;
    return Objects.equals(this.id, udFInfo.id) &&
        Objects.equals(this.name, udFInfo.name) &&
        Objects.equals(this.language, udFInfo.language) &&
        Objects.equals(this.type, udFInfo.type) &&
        Objects.equals(this.readme, udFInfo.readme) &&
        Objects.equals(this.licenseId, udFInfo.licenseId) &&
        Objects.equals(this.licenseText, udFInfo.licenseText) &&
        Objects.equals(this.tags, udFInfo.tags)&&
        Objects.equals(this.additionalProperties, udFInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, type, readme, licenseId, licenseText, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    readme: ").append(toIndentedString(readme)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseText: ").append(toIndentedString(licenseText)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("language");
    openapiFields.add("type");
    openapiFields.add("readme");
    openapiFields.add("license_id");
    openapiFields.add("license_text");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UDFInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UDFInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UDFInfo is not found in the empty JSON string", UDFInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("readme") != null && !jsonObj.get("readme").isJsonNull()) && !jsonObj.get("readme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `readme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("readme").toString()));
      }
      if ((jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonNull()) && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if ((jsonObj.get("license_text") != null && !jsonObj.get("license_text").isJsonNull()) && !jsonObj.get("license_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_text").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UDFInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UDFInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UDFInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UDFInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<UDFInfo>() {
           @Override
           public void write(JsonWriter out, UDFInfo value) throws IOException {
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
           public UDFInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UDFInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UDFInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UDFInfo
  * @throws IOException if the JSON string is invalid with respect to UDFInfo
  */
  public static UDFInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UDFInfo.class);
  }

 /**
  * Convert an instance of UDFInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

