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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.UDFLanguage;
import org.openapitools.client.model.UDFType;

/**
 * User-defined function that can persist in db, used and shared multiple times
 */
@ApiModel(description = "User-defined function that can persist in db, used and shared multiple times")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
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
      this.tags = new ArrayList<String>();
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
        Objects.equals(this.tags, udFInfo.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, language, type, readme, licenseId, licenseText, tags);
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

}

