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
import java.math.BigDecimal;
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

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * Array directory (for reads)
 */
@ApiModel(description = "Array directory (for reads)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class ArrayDirectory {
  public static final String SERIALIZED_NAME_UNFILTERED_FRAGMENT_URIS = "unfilteredFragmentUris";
  @SerializedName(SERIALIZED_NAME_UNFILTERED_FRAGMENT_URIS)
  private List<String> unfilteredFragmentUris = null;

  public static final String SERIALIZED_NAME_CONSOLIDATED_COMMIT_URIS = "consolidatedCommitUris";
  @SerializedName(SERIALIZED_NAME_CONSOLIDATED_COMMIT_URIS)
  private List<String> consolidatedCommitUris = null;

  public static final String SERIALIZED_NAME_ARRAY_SCHEMA_URIS = "arraySchemaUris";
  @SerializedName(SERIALIZED_NAME_ARRAY_SCHEMA_URIS)
  private List<String> arraySchemaUris = null;

  public static final String SERIALIZED_NAME_LATEST_ARRAY_SCHEMA_URI = "latestArraySchemaUri";
  @SerializedName(SERIALIZED_NAME_LATEST_ARRAY_SCHEMA_URI)
  private String latestArraySchemaUri;

  public static final String SERIALIZED_NAME_ARRAY_META_URIS_TO_VACUUM = "arrayMetaUrisToVacuum";
  @SerializedName(SERIALIZED_NAME_ARRAY_META_URIS_TO_VACUUM)
  private List<String> arrayMetaUrisToVacuum = null;

  public static final String SERIALIZED_NAME_ARRAY_META_VAC_URIS_TO_VACUUM = "arrayMetaVacUrisToVacuum";
  @SerializedName(SERIALIZED_NAME_ARRAY_META_VAC_URIS_TO_VACUUM)
  private List<String> arrayMetaVacUrisToVacuum = null;

  public static final String SERIALIZED_NAME_COMMIT_URIS_TO_CONSOLIDATE = "commitUrisToConsolidate";
  @SerializedName(SERIALIZED_NAME_COMMIT_URIS_TO_CONSOLIDATE)
  private List<String> commitUrisToConsolidate = null;

  public static final String SERIALIZED_NAME_COMMIT_URIS_TO_VACUUM = "commitUrisToVacuum";
  @SerializedName(SERIALIZED_NAME_COMMIT_URIS_TO_VACUUM)
  private List<String> commitUrisToVacuum = null;

  public static final String SERIALIZED_NAME_CONSOLIDATED_COMMIT_URIS_TO_VACUUM = "consolidatedCommitUrisToVacuum";
  @SerializedName(SERIALIZED_NAME_CONSOLIDATED_COMMIT_URIS_TO_VACUUM)
  private List<String> consolidatedCommitUrisToVacuum = null;

  public static final String SERIALIZED_NAME_FRAGMENT_META_URIS = "fragmentMetaUris";
  @SerializedName(SERIALIZED_NAME_FRAGMENT_META_URIS)
  private List<String> fragmentMetaUris = null;

  public static final String SERIALIZED_NAME_TIMESTAMP_START = "timestampStart";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_START)
  private BigDecimal timestampStart;

  public static final String SERIALIZED_NAME_TIMESTAMP_END = "timestampEnd";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_END)
  private BigDecimal timestampEnd;

  public static final String SERIALIZED_NAME_ARRAY_META_URIS = "arrayMetaUris";
  @SerializedName(SERIALIZED_NAME_ARRAY_META_URIS)
  private List<TimestampedURI> arrayMetaUris = null;

  public static final String SERIALIZED_NAME_DELETE_AND_UPDATE_TILE_LOCATION = "deleteAndUpdateTileLocation";
  @SerializedName(SERIALIZED_NAME_DELETE_AND_UPDATE_TILE_LOCATION)
  private List<DeleteAndUpdateTileLocation> deleteAndUpdateTileLocation = null;

  public ArrayDirectory() { 
  }

  public ArrayDirectory unfilteredFragmentUris(List<String> unfilteredFragmentUris) {
    
    this.unfilteredFragmentUris = unfilteredFragmentUris;
    return this;
  }

  public ArrayDirectory addUnfilteredFragmentUrisItem(String unfilteredFragmentUrisItem) {
    if (this.unfilteredFragmentUris == null) {
      this.unfilteredFragmentUris = new ArrayList<>();
    }
    this.unfilteredFragmentUris.add(unfilteredFragmentUrisItem);
    return this;
  }

   /**
   * fragment URIs
   * @return unfilteredFragmentUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "fragment URIs")

  public List<String> getUnfilteredFragmentUris() {
    return unfilteredFragmentUris;
  }


  public void setUnfilteredFragmentUris(List<String> unfilteredFragmentUris) {
    this.unfilteredFragmentUris = unfilteredFragmentUris;
  }


  public ArrayDirectory consolidatedCommitUris(List<String> consolidatedCommitUris) {
    
    this.consolidatedCommitUris = consolidatedCommitUris;
    return this;
  }

  public ArrayDirectory addConsolidatedCommitUrisItem(String consolidatedCommitUrisItem) {
    if (this.consolidatedCommitUris == null) {
      this.consolidatedCommitUris = new ArrayList<>();
    }
    this.consolidatedCommitUris.add(consolidatedCommitUrisItem);
    return this;
  }

   /**
   * consolidated commit URI set
   * @return consolidatedCommitUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "consolidated commit URI set")

  public List<String> getConsolidatedCommitUris() {
    return consolidatedCommitUris;
  }


  public void setConsolidatedCommitUris(List<String> consolidatedCommitUris) {
    this.consolidatedCommitUris = consolidatedCommitUris;
  }


  public ArrayDirectory arraySchemaUris(List<String> arraySchemaUris) {
    
    this.arraySchemaUris = arraySchemaUris;
    return this;
  }

  public ArrayDirectory addArraySchemaUrisItem(String arraySchemaUrisItem) {
    if (this.arraySchemaUris == null) {
      this.arraySchemaUris = new ArrayList<>();
    }
    this.arraySchemaUris.add(arraySchemaUrisItem);
    return this;
  }

   /**
   * URIs of all the array schema files
   * @return arraySchemaUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URIs of all the array schema files")

  public List<String> getArraySchemaUris() {
    return arraySchemaUris;
  }


  public void setArraySchemaUris(List<String> arraySchemaUris) {
    this.arraySchemaUris = arraySchemaUris;
  }


  public ArrayDirectory latestArraySchemaUri(String latestArraySchemaUri) {
    
    this.latestArraySchemaUri = latestArraySchemaUri;
    return this;
  }

   /**
   * latest array schema URI.
   * @return latestArraySchemaUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "latest array schema URI.")

  public String getLatestArraySchemaUri() {
    return latestArraySchemaUri;
  }


  public void setLatestArraySchemaUri(String latestArraySchemaUri) {
    this.latestArraySchemaUri = latestArraySchemaUri;
  }


  public ArrayDirectory arrayMetaUrisToVacuum(List<String> arrayMetaUrisToVacuum) {
    
    this.arrayMetaUrisToVacuum = arrayMetaUrisToVacuum;
    return this;
  }

  public ArrayDirectory addArrayMetaUrisToVacuumItem(String arrayMetaUrisToVacuumItem) {
    if (this.arrayMetaUrisToVacuum == null) {
      this.arrayMetaUrisToVacuum = new ArrayList<>();
    }
    this.arrayMetaUrisToVacuum.add(arrayMetaUrisToVacuumItem);
    return this;
  }

   /**
   * the array metadata files to vacuum
   * @return arrayMetaUrisToVacuum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the array metadata files to vacuum")

  public List<String> getArrayMetaUrisToVacuum() {
    return arrayMetaUrisToVacuum;
  }


  public void setArrayMetaUrisToVacuum(List<String> arrayMetaUrisToVacuum) {
    this.arrayMetaUrisToVacuum = arrayMetaUrisToVacuum;
  }


  public ArrayDirectory arrayMetaVacUrisToVacuum(List<String> arrayMetaVacUrisToVacuum) {
    
    this.arrayMetaVacUrisToVacuum = arrayMetaVacUrisToVacuum;
    return this;
  }

  public ArrayDirectory addArrayMetaVacUrisToVacuumItem(String arrayMetaVacUrisToVacuumItem) {
    if (this.arrayMetaVacUrisToVacuum == null) {
      this.arrayMetaVacUrisToVacuum = new ArrayList<>();
    }
    this.arrayMetaVacUrisToVacuum.add(arrayMetaVacUrisToVacuumItem);
    return this;
  }

   /**
   * the array metadata vac files to vacuum
   * @return arrayMetaVacUrisToVacuum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the array metadata vac files to vacuum")

  public List<String> getArrayMetaVacUrisToVacuum() {
    return arrayMetaVacUrisToVacuum;
  }


  public void setArrayMetaVacUrisToVacuum(List<String> arrayMetaVacUrisToVacuum) {
    this.arrayMetaVacUrisToVacuum = arrayMetaVacUrisToVacuum;
  }


  public ArrayDirectory commitUrisToConsolidate(List<String> commitUrisToConsolidate) {
    
    this.commitUrisToConsolidate = commitUrisToConsolidate;
    return this;
  }

  public ArrayDirectory addCommitUrisToConsolidateItem(String commitUrisToConsolidateItem) {
    if (this.commitUrisToConsolidate == null) {
      this.commitUrisToConsolidate = new ArrayList<>();
    }
    this.commitUrisToConsolidate.add(commitUrisToConsolidateItem);
    return this;
  }

   /**
   * the commit files to consolidate
   * @return commitUrisToConsolidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the commit files to consolidate")

  public List<String> getCommitUrisToConsolidate() {
    return commitUrisToConsolidate;
  }


  public void setCommitUrisToConsolidate(List<String> commitUrisToConsolidate) {
    this.commitUrisToConsolidate = commitUrisToConsolidate;
  }


  public ArrayDirectory commitUrisToVacuum(List<String> commitUrisToVacuum) {
    
    this.commitUrisToVacuum = commitUrisToVacuum;
    return this;
  }

  public ArrayDirectory addCommitUrisToVacuumItem(String commitUrisToVacuumItem) {
    if (this.commitUrisToVacuum == null) {
      this.commitUrisToVacuum = new ArrayList<>();
    }
    this.commitUrisToVacuum.add(commitUrisToVacuumItem);
    return this;
  }

   /**
   * the commit files to vacuum
   * @return commitUrisToVacuum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the commit files to vacuum")

  public List<String> getCommitUrisToVacuum() {
    return commitUrisToVacuum;
  }


  public void setCommitUrisToVacuum(List<String> commitUrisToVacuum) {
    this.commitUrisToVacuum = commitUrisToVacuum;
  }


  public ArrayDirectory consolidatedCommitUrisToVacuum(List<String> consolidatedCommitUrisToVacuum) {
    
    this.consolidatedCommitUrisToVacuum = consolidatedCommitUrisToVacuum;
    return this;
  }

  public ArrayDirectory addConsolidatedCommitUrisToVacuumItem(String consolidatedCommitUrisToVacuumItem) {
    if (this.consolidatedCommitUrisToVacuum == null) {
      this.consolidatedCommitUrisToVacuum = new ArrayList<>();
    }
    this.consolidatedCommitUrisToVacuum.add(consolidatedCommitUrisToVacuumItem);
    return this;
  }

   /**
   * the consolidated commit files to vacuum
   * @return consolidatedCommitUrisToVacuum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the consolidated commit files to vacuum")

  public List<String> getConsolidatedCommitUrisToVacuum() {
    return consolidatedCommitUrisToVacuum;
  }


  public void setConsolidatedCommitUrisToVacuum(List<String> consolidatedCommitUrisToVacuum) {
    this.consolidatedCommitUrisToVacuum = consolidatedCommitUrisToVacuum;
  }


  public ArrayDirectory fragmentMetaUris(List<String> fragmentMetaUris) {
    
    this.fragmentMetaUris = fragmentMetaUris;
    return this;
  }

  public ArrayDirectory addFragmentMetaUrisItem(String fragmentMetaUrisItem) {
    if (this.fragmentMetaUris == null) {
      this.fragmentMetaUris = new ArrayList<>();
    }
    this.fragmentMetaUris.add(fragmentMetaUrisItem);
    return this;
  }

   /**
   * the URIs of the consolidated fragment metadata files
   * @return fragmentMetaUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the URIs of the consolidated fragment metadata files")

  public List<String> getFragmentMetaUris() {
    return fragmentMetaUris;
  }


  public void setFragmentMetaUris(List<String> fragmentMetaUris) {
    this.fragmentMetaUris = fragmentMetaUris;
  }


  public ArrayDirectory timestampStart(BigDecimal timestampStart) {
    
    this.timestampStart = timestampStart;
    return this;
  }

   /**
   * Only the files created after timestamp_start are listed
   * @return timestampStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only the files created after timestamp_start are listed")

  public BigDecimal getTimestampStart() {
    return timestampStart;
  }


  public void setTimestampStart(BigDecimal timestampStart) {
    this.timestampStart = timestampStart;
  }


  public ArrayDirectory timestampEnd(BigDecimal timestampEnd) {
    
    this.timestampEnd = timestampEnd;
    return this;
  }

   /**
   * Only the files created before timestamp_end are listed
   * @return timestampEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only the files created before timestamp_end are listed")

  public BigDecimal getTimestampEnd() {
    return timestampEnd;
  }


  public void setTimestampEnd(BigDecimal timestampEnd) {
    this.timestampEnd = timestampEnd;
  }


  public ArrayDirectory arrayMetaUris(List<TimestampedURI> arrayMetaUris) {
    
    this.arrayMetaUris = arrayMetaUris;
    return this;
  }

  public ArrayDirectory addArrayMetaUrisItem(TimestampedURI arrayMetaUrisItem) {
    if (this.arrayMetaUris == null) {
      this.arrayMetaUris = new ArrayList<>();
    }
    this.arrayMetaUris.add(arrayMetaUrisItem);
    return this;
  }

   /**
   * the timestamped filtered array metadata URIs, after removing the ones that need to be vacuumed and those that do not fall within
   * @return arrayMetaUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the timestamped filtered array metadata URIs, after removing the ones that need to be vacuumed and those that do not fall within")

  public List<TimestampedURI> getArrayMetaUris() {
    return arrayMetaUris;
  }


  public void setArrayMetaUris(List<TimestampedURI> arrayMetaUris) {
    this.arrayMetaUris = arrayMetaUris;
  }


  public ArrayDirectory deleteAndUpdateTileLocation(List<DeleteAndUpdateTileLocation> deleteAndUpdateTileLocation) {
    
    this.deleteAndUpdateTileLocation = deleteAndUpdateTileLocation;
    return this;
  }

  public ArrayDirectory addDeleteAndUpdateTileLocationItem(DeleteAndUpdateTileLocation deleteAndUpdateTileLocationItem) {
    if (this.deleteAndUpdateTileLocation == null) {
      this.deleteAndUpdateTileLocation = new ArrayList<>();
    }
    this.deleteAndUpdateTileLocation.add(deleteAndUpdateTileLocationItem);
    return this;
  }

   /**
   * the location of delete tiles
   * @return deleteAndUpdateTileLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the location of delete tiles")

  public List<DeleteAndUpdateTileLocation> getDeleteAndUpdateTileLocation() {
    return deleteAndUpdateTileLocation;
  }


  public void setDeleteAndUpdateTileLocation(List<DeleteAndUpdateTileLocation> deleteAndUpdateTileLocation) {
    this.deleteAndUpdateTileLocation = deleteAndUpdateTileLocation;
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
  public ArrayDirectory putAdditionalProperty(String key, Object value) {
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
    ArrayDirectory arrayDirectory = (ArrayDirectory) o;
    return Objects.equals(this.unfilteredFragmentUris, arrayDirectory.unfilteredFragmentUris) &&
        Objects.equals(this.consolidatedCommitUris, arrayDirectory.consolidatedCommitUris) &&
        Objects.equals(this.arraySchemaUris, arrayDirectory.arraySchemaUris) &&
        Objects.equals(this.latestArraySchemaUri, arrayDirectory.latestArraySchemaUri) &&
        Objects.equals(this.arrayMetaUrisToVacuum, arrayDirectory.arrayMetaUrisToVacuum) &&
        Objects.equals(this.arrayMetaVacUrisToVacuum, arrayDirectory.arrayMetaVacUrisToVacuum) &&
        Objects.equals(this.commitUrisToConsolidate, arrayDirectory.commitUrisToConsolidate) &&
        Objects.equals(this.commitUrisToVacuum, arrayDirectory.commitUrisToVacuum) &&
        Objects.equals(this.consolidatedCommitUrisToVacuum, arrayDirectory.consolidatedCommitUrisToVacuum) &&
        Objects.equals(this.fragmentMetaUris, arrayDirectory.fragmentMetaUris) &&
        Objects.equals(this.timestampStart, arrayDirectory.timestampStart) &&
        Objects.equals(this.timestampEnd, arrayDirectory.timestampEnd) &&
        Objects.equals(this.arrayMetaUris, arrayDirectory.arrayMetaUris) &&
        Objects.equals(this.deleteAndUpdateTileLocation, arrayDirectory.deleteAndUpdateTileLocation)&&
        Objects.equals(this.additionalProperties, arrayDirectory.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unfilteredFragmentUris, consolidatedCommitUris, arraySchemaUris, latestArraySchemaUri, arrayMetaUrisToVacuum, arrayMetaVacUrisToVacuum, commitUrisToConsolidate, commitUrisToVacuum, consolidatedCommitUrisToVacuum, fragmentMetaUris, timestampStart, timestampEnd, arrayMetaUris, deleteAndUpdateTileLocation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayDirectory {\n");
    sb.append("    unfilteredFragmentUris: ").append(toIndentedString(unfilteredFragmentUris)).append("\n");
    sb.append("    consolidatedCommitUris: ").append(toIndentedString(consolidatedCommitUris)).append("\n");
    sb.append("    arraySchemaUris: ").append(toIndentedString(arraySchemaUris)).append("\n");
    sb.append("    latestArraySchemaUri: ").append(toIndentedString(latestArraySchemaUri)).append("\n");
    sb.append("    arrayMetaUrisToVacuum: ").append(toIndentedString(arrayMetaUrisToVacuum)).append("\n");
    sb.append("    arrayMetaVacUrisToVacuum: ").append(toIndentedString(arrayMetaVacUrisToVacuum)).append("\n");
    sb.append("    commitUrisToConsolidate: ").append(toIndentedString(commitUrisToConsolidate)).append("\n");
    sb.append("    commitUrisToVacuum: ").append(toIndentedString(commitUrisToVacuum)).append("\n");
    sb.append("    consolidatedCommitUrisToVacuum: ").append(toIndentedString(consolidatedCommitUrisToVacuum)).append("\n");
    sb.append("    fragmentMetaUris: ").append(toIndentedString(fragmentMetaUris)).append("\n");
    sb.append("    timestampStart: ").append(toIndentedString(timestampStart)).append("\n");
    sb.append("    timestampEnd: ").append(toIndentedString(timestampEnd)).append("\n");
    sb.append("    arrayMetaUris: ").append(toIndentedString(arrayMetaUris)).append("\n");
    sb.append("    deleteAndUpdateTileLocation: ").append(toIndentedString(deleteAndUpdateTileLocation)).append("\n");
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
    openapiFields.add("unfilteredFragmentUris");
    openapiFields.add("consolidatedCommitUris");
    openapiFields.add("arraySchemaUris");
    openapiFields.add("latestArraySchemaUri");
    openapiFields.add("arrayMetaUrisToVacuum");
    openapiFields.add("arrayMetaVacUrisToVacuum");
    openapiFields.add("commitUrisToConsolidate");
    openapiFields.add("commitUrisToVacuum");
    openapiFields.add("consolidatedCommitUrisToVacuum");
    openapiFields.add("fragmentMetaUris");
    openapiFields.add("timestampStart");
    openapiFields.add("timestampEnd");
    openapiFields.add("arrayMetaUris");
    openapiFields.add("deleteAndUpdateTileLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArrayDirectory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArrayDirectory.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayDirectory is not found in the empty JSON string", ArrayDirectory.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("unfilteredFragmentUris") != null && !jsonObj.get("unfilteredFragmentUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unfilteredFragmentUris` to be an array in the JSON string but got `%s`", jsonObj.get("unfilteredFragmentUris").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("consolidatedCommitUris") != null && !jsonObj.get("consolidatedCommitUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `consolidatedCommitUris` to be an array in the JSON string but got `%s`", jsonObj.get("consolidatedCommitUris").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("arraySchemaUris") != null && !jsonObj.get("arraySchemaUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `arraySchemaUris` to be an array in the JSON string but got `%s`", jsonObj.get("arraySchemaUris").toString()));
      }
      if (jsonObj.get("latestArraySchemaUri") != null && !jsonObj.get("latestArraySchemaUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latestArraySchemaUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latestArraySchemaUri").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("arrayMetaUrisToVacuum") != null && !jsonObj.get("arrayMetaUrisToVacuum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `arrayMetaUrisToVacuum` to be an array in the JSON string but got `%s`", jsonObj.get("arrayMetaUrisToVacuum").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("arrayMetaVacUrisToVacuum") != null && !jsonObj.get("arrayMetaVacUrisToVacuum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `arrayMetaVacUrisToVacuum` to be an array in the JSON string but got `%s`", jsonObj.get("arrayMetaVacUrisToVacuum").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("commitUrisToConsolidate") != null && !jsonObj.get("commitUrisToConsolidate").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitUrisToConsolidate` to be an array in the JSON string but got `%s`", jsonObj.get("commitUrisToConsolidate").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("commitUrisToVacuum") != null && !jsonObj.get("commitUrisToVacuum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `commitUrisToVacuum` to be an array in the JSON string but got `%s`", jsonObj.get("commitUrisToVacuum").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("consolidatedCommitUrisToVacuum") != null && !jsonObj.get("consolidatedCommitUrisToVacuum").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `consolidatedCommitUrisToVacuum` to be an array in the JSON string but got `%s`", jsonObj.get("consolidatedCommitUrisToVacuum").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("fragmentMetaUris") != null && !jsonObj.get("fragmentMetaUris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fragmentMetaUris` to be an array in the JSON string but got `%s`", jsonObj.get("fragmentMetaUris").toString()));
      }
      JsonArray jsonArrayarrayMetaUris = jsonObj.getAsJsonArray("arrayMetaUris");
      if (jsonArrayarrayMetaUris != null) {
        // ensure the json data is an array
        if (!jsonObj.get("arrayMetaUris").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `arrayMetaUris` to be an array in the JSON string but got `%s`", jsonObj.get("arrayMetaUris").toString()));
        }

        // validate the optional field `arrayMetaUris` (array)
        for (int i = 0; i < jsonArrayarrayMetaUris.size(); i++) {
          TimestampedURI.validateJsonObject(jsonArrayarrayMetaUris.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraydeleteAndUpdateTileLocation = jsonObj.getAsJsonArray("deleteAndUpdateTileLocation");
      if (jsonArraydeleteAndUpdateTileLocation != null) {
        // ensure the json data is an array
        if (!jsonObj.get("deleteAndUpdateTileLocation").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `deleteAndUpdateTileLocation` to be an array in the JSON string but got `%s`", jsonObj.get("deleteAndUpdateTileLocation").toString()));
        }

        // validate the optional field `deleteAndUpdateTileLocation` (array)
        for (int i = 0; i < jsonArraydeleteAndUpdateTileLocation.size(); i++) {
          DeleteAndUpdateTileLocation.validateJsonObject(jsonArraydeleteAndUpdateTileLocation.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayDirectory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayDirectory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayDirectory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayDirectory.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayDirectory>() {
           @Override
           public void write(JsonWriter out, ArrayDirectory value) throws IOException {
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
           public ArrayDirectory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArrayDirectory instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArrayDirectory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayDirectory
  * @throws IOException if the JSON string is invalid with respect to ArrayDirectory
  */
  public static ArrayDirectory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayDirectory.class);
  }

 /**
  * Convert an instance of ArrayDirectory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
