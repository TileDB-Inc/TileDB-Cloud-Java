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
import org.openapitools.client.model.DimensionCoordinate;

/**
 * A dimension range to query
 */
@ApiModel(description = "A dimension range to query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class UDFSubarrayRange {
  public static final String SERIALIZED_NAME_DIMENSION_ID = "dimension_id";
  @SerializedName(SERIALIZED_NAME_DIMENSION_ID)
  private Integer dimensionId;

  public static final String SERIALIZED_NAME_RANGE_START = "range_start";
  @SerializedName(SERIALIZED_NAME_RANGE_START)
  private DimensionCoordinate rangeStart;

  public static final String SERIALIZED_NAME_RANGE_END = "range_end";
  @SerializedName(SERIALIZED_NAME_RANGE_END)
  private DimensionCoordinate rangeEnd;

  public UDFSubarrayRange() { 
  }

  public UDFSubarrayRange dimensionId(Integer dimensionId) {
    
    this.dimensionId = dimensionId;
    return this;
  }

   /**
   * The dimension index
   * @return dimensionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dimension index")

  public Integer getDimensionId() {
    return dimensionId;
  }


  public void setDimensionId(Integer dimensionId) {
    this.dimensionId = dimensionId;
  }


  public UDFSubarrayRange rangeStart(DimensionCoordinate rangeStart) {
    
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * Get rangeStart
   * @return rangeStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DimensionCoordinate getRangeStart() {
    return rangeStart;
  }


  public void setRangeStart(DimensionCoordinate rangeStart) {
    this.rangeStart = rangeStart;
  }


  public UDFSubarrayRange rangeEnd(DimensionCoordinate rangeEnd) {
    
    this.rangeEnd = rangeEnd;
    return this;
  }

   /**
   * Get rangeEnd
   * @return rangeEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DimensionCoordinate getRangeEnd() {
    return rangeEnd;
  }


  public void setRangeEnd(DimensionCoordinate rangeEnd) {
    this.rangeEnd = rangeEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDFSubarrayRange udFSubarrayRange = (UDFSubarrayRange) o;
    return Objects.equals(this.dimensionId, udFSubarrayRange.dimensionId) &&
        Objects.equals(this.rangeStart, udFSubarrayRange.rangeStart) &&
        Objects.equals(this.rangeEnd, udFSubarrayRange.rangeEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionId, rangeStart, rangeEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFSubarrayRange {\n");
    sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    rangeEnd: ").append(toIndentedString(rangeEnd)).append("\n");
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

