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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Layout;

/**
 * Subarray bounds to query
 */
@ApiModel(description = "Subarray bounds to query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class QueryRanges {
  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private Layout layout;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<List<BigDecimal>> ranges = null;

  public QueryRanges() { 
  }

  public QueryRanges layout(Layout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Layout getLayout() {
    return layout;
  }


  public void setLayout(Layout layout) {
    this.layout = layout;
  }


  public QueryRanges ranges(List<List<BigDecimal>> ranges) {
    
    this.ranges = ranges;
    return this;
  }

  public QueryRanges addRangesItem(List<BigDecimal> rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<List<BigDecimal>>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * List of ranges,
   * @return ranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ranges,")

  public List<List<BigDecimal>> getRanges() {
    return ranges;
  }


  public void setRanges(List<List<BigDecimal>> ranges) {
    this.ranges = ranges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRanges queryRanges = (QueryRanges) o;
    return Objects.equals(this.layout, queryRanges.layout) &&
        Objects.equals(this.ranges, queryRanges.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRanges {\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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

