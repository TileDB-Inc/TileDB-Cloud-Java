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
 * A single, typed coordinate for a dimension
 */
@ApiModel(description = "A single, typed coordinate for a dimension")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class DimensionCoordinate {
  public static final String SERIALIZED_NAME_INT8 = "int8";
  @SerializedName(SERIALIZED_NAME_INT8)
  private Integer int8;

  public static final String SERIALIZED_NAME_UINT8 = "uint8";
  @SerializedName(SERIALIZED_NAME_UINT8)
  private Integer uint8;

  public static final String SERIALIZED_NAME_INT16 = "int16";
  @SerializedName(SERIALIZED_NAME_INT16)
  private Integer int16;

  public static final String SERIALIZED_NAME_UINT16 = "uint16";
  @SerializedName(SERIALIZED_NAME_UINT16)
  private Integer uint16;

  public static final String SERIALIZED_NAME_INT32 = "int32";
  @SerializedName(SERIALIZED_NAME_INT32)
  private Integer int32;

  public static final String SERIALIZED_NAME_UINT32 = "uint32";
  @SerializedName(SERIALIZED_NAME_UINT32)
  private Integer uint32;

  public static final String SERIALIZED_NAME_INT64 = "int64";
  @SerializedName(SERIALIZED_NAME_INT64)
  private Long int64;

  public static final String SERIALIZED_NAME_UINT64 = "uint64";
  @SerializedName(SERIALIZED_NAME_UINT64)
  private Integer uint64;

  public static final String SERIALIZED_NAME_FLOAT32 = "float32";
  @SerializedName(SERIALIZED_NAME_FLOAT32)
  private Float float32;

  public static final String SERIALIZED_NAME_FLOAT64 = "float64";
  @SerializedName(SERIALIZED_NAME_FLOAT64)
  private Double float64;

  public DimensionCoordinate() { 
  }

  public DimensionCoordinate int8(Integer int8) {
    
    this.int8 = int8;
    return this;
  }

   /**
   * Get int8
   * @return int8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt8() {
    return int8;
  }


  public void setInt8(Integer int8) {
    this.int8 = int8;
  }


  public DimensionCoordinate uint8(Integer uint8) {
    
    this.uint8 = uint8;
    return this;
  }

   /**
   * Get uint8
   * @return uint8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint8() {
    return uint8;
  }


  public void setUint8(Integer uint8) {
    this.uint8 = uint8;
  }


  public DimensionCoordinate int16(Integer int16) {
    
    this.int16 = int16;
    return this;
  }

   /**
   * Get int16
   * @return int16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt16() {
    return int16;
  }


  public void setInt16(Integer int16) {
    this.int16 = int16;
  }


  public DimensionCoordinate uint16(Integer uint16) {
    
    this.uint16 = uint16;
    return this;
  }

   /**
   * Get uint16
   * @return uint16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint16() {
    return uint16;
  }


  public void setUint16(Integer uint16) {
    this.uint16 = uint16;
  }


  public DimensionCoordinate int32(Integer int32) {
    
    this.int32 = int32;
    return this;
  }

   /**
   * Get int32
   * @return int32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt32() {
    return int32;
  }


  public void setInt32(Integer int32) {
    this.int32 = int32;
  }


  public DimensionCoordinate uint32(Integer uint32) {
    
    this.uint32 = uint32;
    return this;
  }

   /**
   * Get uint32
   * @return uint32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint32() {
    return uint32;
  }


  public void setUint32(Integer uint32) {
    this.uint32 = uint32;
  }


  public DimensionCoordinate int64(Long int64) {
    
    this.int64 = int64;
    return this;
  }

   /**
   * Get int64
   * @return int64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInt64() {
    return int64;
  }


  public void setInt64(Long int64) {
    this.int64 = int64;
  }


  public DimensionCoordinate uint64(Integer uint64) {
    
    this.uint64 = uint64;
    return this;
  }

   /**
   * Get uint64
   * @return uint64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint64() {
    return uint64;
  }


  public void setUint64(Integer uint64) {
    this.uint64 = uint64;
  }


  public DimensionCoordinate float32(Float float32) {
    
    this.float32 = float32;
    return this;
  }

   /**
   * Get float32
   * @return float32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getFloat32() {
    return float32;
  }


  public void setFloat32(Float float32) {
    this.float32 = float32;
  }


  public DimensionCoordinate float64(Double float64) {
    
    this.float64 = float64;
    return this;
  }

   /**
   * Get float64
   * @return float64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getFloat64() {
    return float64;
  }


  public void setFloat64(Double float64) {
    this.float64 = float64;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionCoordinate dimensionCoordinate = (DimensionCoordinate) o;
    return Objects.equals(this.int8, dimensionCoordinate.int8) &&
        Objects.equals(this.uint8, dimensionCoordinate.uint8) &&
        Objects.equals(this.int16, dimensionCoordinate.int16) &&
        Objects.equals(this.uint16, dimensionCoordinate.uint16) &&
        Objects.equals(this.int32, dimensionCoordinate.int32) &&
        Objects.equals(this.uint32, dimensionCoordinate.uint32) &&
        Objects.equals(this.int64, dimensionCoordinate.int64) &&
        Objects.equals(this.uint64, dimensionCoordinate.uint64) &&
        Objects.equals(this.float32, dimensionCoordinate.float32) &&
        Objects.equals(this.float64, dimensionCoordinate.float64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(int8, uint8, int16, uint16, int32, uint32, int64, uint64, float32, float64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionCoordinate {\n");
    sb.append("    int8: ").append(toIndentedString(int8)).append("\n");
    sb.append("    uint8: ").append(toIndentedString(uint8)).append("\n");
    sb.append("    int16: ").append(toIndentedString(int16)).append("\n");
    sb.append("    uint16: ").append(toIndentedString(uint16)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    uint32: ").append(toIndentedString(uint32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    uint64: ").append(toIndentedString(uint64)).append("\n");
    sb.append("    float32: ").append(toIndentedString(float32)).append("\n");
    sb.append("    float64: ").append(toIndentedString(float64)).append("\n");
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

