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

/**
 * Input/Output information required to create a new file
 */
@ApiModel(description = "Input/Output information required to create a new file")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class FileCreate {
  public static final String SERIALIZED_NAME_INPUT_URI = "input_uri";
  @SerializedName(SERIALIZED_NAME_INPUT_URI)
  private String inputUri;

  public static final String SERIALIZED_NAME_OUTPUT_URI = "output_uri";
  @SerializedName(SERIALIZED_NAME_OUTPUT_URI)
  private String outputUri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public FileCreate() { 
  }

  public FileCreate inputUri(String inputUri) {
    
    this.inputUri = inputUri;
    return this;
  }

   /**
   * storage URI of the input file
   * @return inputUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "storage URI of the input file")

  public String getInputUri() {
    return inputUri;
  }


  public void setInputUri(String inputUri) {
    this.inputUri = inputUri;
  }


  public FileCreate outputUri(String outputUri) {
    
    this.outputUri = outputUri;
    return this;
  }

   /**
   * output location of the TileDB File
   * @return outputUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "output location of the TileDB File")

  public String getOutputUri() {
    return outputUri;
  }


  public void setOutputUri(String outputUri) {
    this.outputUri = outputUri;
  }


  public FileCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name to set for registered file
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name to set for registered file")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCreate fileCreate = (FileCreate) o;
    return Objects.equals(this.inputUri, fileCreate.inputUri) &&
        Objects.equals(this.outputUri, fileCreate.outputUri) &&
        Objects.equals(this.name, fileCreate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputUri, outputUri, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCreate {\n");
    sb.append("    inputUri: ").append(toIndentedString(inputUri)).append("\n");
    sb.append("    outputUri: ").append(toIndentedString(outputUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

