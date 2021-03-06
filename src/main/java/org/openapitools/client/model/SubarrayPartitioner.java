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
import org.openapitools.client.model.AttributeBufferSize;
import org.openapitools.client.model.Subarray;
import org.openapitools.client.model.SubarrayPartitionerCurrent;
import org.openapitools.client.model.SubarrayPartitionerState;

/**
 * The subarray partitioner
 */
@ApiModel(description = "The subarray partitioner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T15:04:32.581406+03:00[Europe/Athens]")
public class SubarrayPartitioner {
  public static final String SERIALIZED_NAME_SUBARRAY = "subarray";
  @SerializedName(SERIALIZED_NAME_SUBARRAY)
  private Subarray subarray;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private List<AttributeBufferSize> budget = null;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private SubarrayPartitionerCurrent current;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private SubarrayPartitionerState state;

  public static final String SERIALIZED_NAME_MEMORY_BUDGET = "memoryBudget";
  @SerializedName(SERIALIZED_NAME_MEMORY_BUDGET)
  private Integer memoryBudget;

  public static final String SERIALIZED_NAME_MEMORY_BUDGET_VAR = "memoryBudgetVar";
  @SerializedName(SERIALIZED_NAME_MEMORY_BUDGET_VAR)
  private Integer memoryBudgetVar;

  public SubarrayPartitioner() { 
  }

  public SubarrayPartitioner subarray(Subarray subarray) {
    
    this.subarray = subarray;
    return this;
  }

   /**
   * Get subarray
   * @return subarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Subarray getSubarray() {
    return subarray;
  }


  public void setSubarray(Subarray subarray) {
    this.subarray = subarray;
  }


  public SubarrayPartitioner budget(List<AttributeBufferSize> budget) {
    
    this.budget = budget;
    return this;
  }

  public SubarrayPartitioner addBudgetItem(AttributeBufferSize budgetItem) {
    if (this.budget == null) {
      this.budget = new ArrayList<AttributeBufferSize>();
    }
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Result size budget (in bytes) for all attributes.
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result size budget (in bytes) for all attributes.")

  public List<AttributeBufferSize> getBudget() {
    return budget;
  }


  public void setBudget(List<AttributeBufferSize> budget) {
    this.budget = budget;
  }


  public SubarrayPartitioner current(SubarrayPartitionerCurrent current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubarrayPartitionerCurrent getCurrent() {
    return current;
  }


  public void setCurrent(SubarrayPartitionerCurrent current) {
    this.current = current;
  }


  public SubarrayPartitioner state(SubarrayPartitionerState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubarrayPartitionerState getState() {
    return state;
  }


  public void setState(SubarrayPartitionerState state) {
    this.state = state;
  }


  public SubarrayPartitioner memoryBudget(Integer memoryBudget) {
    
    this.memoryBudget = memoryBudget;
    return this;
  }

   /**
   * The memory budget for the fixed-sized attributes and the offsets of the var-sized attributes
   * @return memoryBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The memory budget for the fixed-sized attributes and the offsets of the var-sized attributes")

  public Integer getMemoryBudget() {
    return memoryBudget;
  }


  public void setMemoryBudget(Integer memoryBudget) {
    this.memoryBudget = memoryBudget;
  }


  public SubarrayPartitioner memoryBudgetVar(Integer memoryBudgetVar) {
    
    this.memoryBudgetVar = memoryBudgetVar;
    return this;
  }

   /**
   * The memory budget for the var-sized attributes
   * @return memoryBudgetVar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The memory budget for the var-sized attributes")

  public Integer getMemoryBudgetVar() {
    return memoryBudgetVar;
  }


  public void setMemoryBudgetVar(Integer memoryBudgetVar) {
    this.memoryBudgetVar = memoryBudgetVar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubarrayPartitioner subarrayPartitioner = (SubarrayPartitioner) o;
    return Objects.equals(this.subarray, subarrayPartitioner.subarray) &&
        Objects.equals(this.budget, subarrayPartitioner.budget) &&
        Objects.equals(this.current, subarrayPartitioner.current) &&
        Objects.equals(this.state, subarrayPartitioner.state) &&
        Objects.equals(this.memoryBudget, subarrayPartitioner.memoryBudget) &&
        Objects.equals(this.memoryBudgetVar, subarrayPartitioner.memoryBudgetVar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subarray, budget, current, state, memoryBudget, memoryBudgetVar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubarrayPartitioner {\n");
    sb.append("    subarray: ").append(toIndentedString(subarray)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    memoryBudget: ").append(toIndentedString(memoryBudget)).append("\n");
    sb.append("    memoryBudgetVar: ").append(toIndentedString(memoryBudgetVar)).append("\n");
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

