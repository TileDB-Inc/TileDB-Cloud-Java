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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.tiledb.cloud.rest_api.model.QueryRanges;
import io.tiledb.cloud.rest_api.model.ResultFormat;
import io.tiledb.cloud.rest_api.model.TGUDFArgument;
import io.tiledb.cloud.rest_api.model.UDFArrayDetails;
import io.tiledb.cloud.rest_api.model.UDFLanguage;
import io.tiledb.cloud.rest_api.model.UDFSubarray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tiledb.cloud.rest_api.JSON;

/**
 * User-defined function
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class MultiArrayUDF {
  public static final String SERIALIZED_NAME_UDF_INFO_NAME = "udf_info_name";
  @SerializedName(SERIALIZED_NAME_UDF_INFO_NAME)
  private String udfInfoName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private UDFLanguage language;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
  private String imageName;

  public static final String SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME = "access_credentials_name";
  @SerializedName(SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME)
  private String accessCredentialsName;

  public static final String SERIALIZED_NAME_RESOURCE_CLASS = "resource_class";
  @SerializedName(SERIALIZED_NAME_RESOURCE_CLASS)
  private String resourceClass;

  public static final String SERIALIZED_NAME_EXEC = "exec";
  @SerializedName(SERIALIZED_NAME_EXEC)
  private String exec;

  public static final String SERIALIZED_NAME_EXEC_RAW = "exec_raw";
  @SerializedName(SERIALIZED_NAME_EXEC_RAW)
  private String execRaw;

  public static final String SERIALIZED_NAME_RESULT_FORMAT = "result_format";
  @SerializedName(SERIALIZED_NAME_RESULT_FORMAT)
  private ResultFormat resultFormat;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName;

  public static final String SERIALIZED_NAME_ARGUMENT = "argument";
  @SerializedName(SERIALIZED_NAME_ARGUMENT)
  private String argument;

  public static final String SERIALIZED_NAME_ARGUMENTS_JSON = "arguments_json";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS_JSON)
  private List<TGUDFArgument> argumentsJson;

  public static final String SERIALIZED_NAME_STORED_PARAM_UUIDS = "stored_param_uuids";
  @SerializedName(SERIALIZED_NAME_STORED_PARAM_UUIDS)
  private List<String> storedParamUuids = new ArrayList<>();

  public static final String SERIALIZED_NAME_STORE_RESULTS = "store_results";
  @SerializedName(SERIALIZED_NAME_STORE_RESULTS)
  private Boolean storeResults;

  public static final String SERIALIZED_NAME_DONT_DOWNLOAD_RESULTS = "dont_download_results";
  @SerializedName(SERIALIZED_NAME_DONT_DOWNLOAD_RESULTS)
  private Boolean dontDownloadResults;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private QueryRanges ranges;

  public static final String SERIALIZED_NAME_SUBARRAY = "subarray";
  @SerializedName(SERIALIZED_NAME_SUBARRAY)
  private UDFSubarray subarray;

  public static final String SERIALIZED_NAME_BUFFERS = "buffers";
  @SerializedName(SERIALIZED_NAME_BUFFERS)
  private List<String> buffers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARRAYS = "arrays";
  @SerializedName(SERIALIZED_NAME_ARRAYS)
  private List<UDFArrayDetails> arrays = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public static final String SERIALIZED_NAME_TASK_GRAPH_UUID = "task_graph_uuid";
  @SerializedName(SERIALIZED_NAME_TASK_GRAPH_UUID)
  private String taskGraphUuid;

  public static final String SERIALIZED_NAME_CLIENT_NODE_UUID = "client_node_uuid";
  @SerializedName(SERIALIZED_NAME_CLIENT_NODE_UUID)
  private String clientNodeUuid;

  public MultiArrayUDF() {
  }

  public MultiArrayUDF udfInfoName(String udfInfoName) {
    this.udfInfoName = udfInfoName;
    return this;
  }

  /**
   * name of UDFInfo to run, format is {namespace}/{udf_name}. Can not be used with exec
   * @return udfInfoName
   */
  @javax.annotation.Nullable
  public String getUdfInfoName() {
    return udfInfoName;
  }

  public void setUdfInfoName(String udfInfoName) {
    this.udfInfoName = udfInfoName;
  }


  public MultiArrayUDF language(UDFLanguage language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nullable
  public UDFLanguage getLanguage() {
    return language;
  }

  public void setLanguage(UDFLanguage language) {
    this.language = language;
  }


  public MultiArrayUDF version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Type-specific version
   * @return version
   */
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public MultiArrayUDF imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

  /**
   * Docker image name to use for UDF
   * @return imageName
   */
  @javax.annotation.Nullable
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public MultiArrayUDF accessCredentialsName(String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
    return this;
  }

  /**
   * The name of the access credentials to use. if unset, no credentials will be configured in the environment.
   * @return accessCredentialsName
   */
  @javax.annotation.Nullable
  public String getAccessCredentialsName() {
    return accessCredentialsName;
  }

  public void setAccessCredentialsName(String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
  }


  public MultiArrayUDF resourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
    return this;
  }

  /**
   * The resource class to use for the UDF execution. Resource classes define resource limits for memory and CPUs. If this is empty, then the UDF will execute in the standard resource class of the TileDB Cloud provider. 
   * @return resourceClass
   */
  @javax.annotation.Nullable
  public String getResourceClass() {
    return resourceClass;
  }

  public void setResourceClass(String resourceClass) {
    this.resourceClass = resourceClass;
  }


  public MultiArrayUDF exec(String exec) {
    this.exec = exec;
    return this;
  }

  /**
   * Type-specific executable text
   * @return exec
   */
  @javax.annotation.Nullable
  public String getExec() {
    return exec;
  }

  public void setExec(String exec) {
    this.exec = exec;
  }


  public MultiArrayUDF execRaw(String execRaw) {
    this.execRaw = execRaw;
    return this;
  }

  /**
   * optional raw text to store of serialized function, used for showing in UI
   * @return execRaw
   */
  @javax.annotation.Nullable
  public String getExecRaw() {
    return execRaw;
  }

  public void setExecRaw(String execRaw) {
    this.execRaw = execRaw;
  }


  public MultiArrayUDF resultFormat(ResultFormat resultFormat) {
    this.resultFormat = resultFormat;
    return this;
  }

  /**
   * Get resultFormat
   * @return resultFormat
   */
  @javax.annotation.Nullable
  public ResultFormat getResultFormat() {
    return resultFormat;
  }

  public void setResultFormat(ResultFormat resultFormat) {
    this.resultFormat = resultFormat;
  }


  public MultiArrayUDF taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * name of task, optional
   * @return taskName
   */
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public MultiArrayUDF argument(String argument) {
    this.argument = argument;
    return this;
  }

  /**
   * Deprecated: Prefer to use &#x60;argument_json&#x60; instead. Argument(s) to pass to UDF function, tuple or list of args/kwargs which can be in native or JSON format 
   * @return argument
   */
  @javax.annotation.Nullable
  public String getArgument() {
    return argument;
  }

  public void setArgument(String argument) {
    this.argument = argument;
  }


  public MultiArrayUDF argumentsJson(List<TGUDFArgument> argumentsJson) {
    this.argumentsJson = argumentsJson;
    return this;
  }

  public MultiArrayUDF addArgumentsJsonItem(TGUDFArgument argumentsJsonItem) {
    if (this.argumentsJson == null) {
      this.argumentsJson = new ArrayList<>();
    }
    this.argumentsJson.add(argumentsJsonItem);
    return this;
  }

  /**
   * A series of key-value pairs to be passed as arguments into the UDF. See &#x60;TGUDFNodeData.arguments&#x60; for more information. If this format is used to pass arguments, arrays will be passed into the UDF as specified by the Node placeholders passed in here, rather than the classic method of putting all array arguments in the first parameter. Either this or &#x60;argument&#x60; should be set. 
   * @return argumentsJson
   */
  @javax.annotation.Nullable
  public List<TGUDFArgument> getArgumentsJson() {
    return argumentsJson;
  }

  public void setArgumentsJson(List<TGUDFArgument> argumentsJson) {
    this.argumentsJson = argumentsJson;
  }


  public MultiArrayUDF storedParamUuids(List<String> storedParamUuids) {
    this.storedParamUuids = storedParamUuids;
    return this;
  }

  public MultiArrayUDF addStoredParamUuidsItem(String storedParamUuidsItem) {
    if (this.storedParamUuids == null) {
      this.storedParamUuids = new ArrayList<>();
    }
    this.storedParamUuids.add(storedParamUuidsItem);
    return this;
  }

  /**
   * The UUIDs of stored input parameters (passed in a language-specific format within \&quot;argument\&quot;) to be retrieved from the server-side cache. Serialized in standard hex format with no {}.
   * @return storedParamUuids
   */
  @javax.annotation.Nullable
  public List<String> getStoredParamUuids() {
    return storedParamUuids;
  }

  public void setStoredParamUuids(List<String> storedParamUuids) {
    this.storedParamUuids = storedParamUuids;
  }


  public MultiArrayUDF storeResults(Boolean storeResults) {
    this.storeResults = storeResults;
    return this;
  }

  /**
   * store results for later retrieval
   * @return storeResults
   */
  @javax.annotation.Nullable
  public Boolean getStoreResults() {
    return storeResults;
  }

  public void setStoreResults(Boolean storeResults) {
    this.storeResults = storeResults;
  }


  public MultiArrayUDF dontDownloadResults(Boolean dontDownloadResults) {
    this.dontDownloadResults = dontDownloadResults;
    return this;
  }

  /**
   * Set to true to avoid downloading the results of this UDF. Useful for intermediate nodes in a task graph where you will not be using the results of your function. Defaults to false (\&quot;yes download results\&quot;).
   * @return dontDownloadResults
   */
  @javax.annotation.Nullable
  public Boolean getDontDownloadResults() {
    return dontDownloadResults;
  }

  public void setDontDownloadResults(Boolean dontDownloadResults) {
    this.dontDownloadResults = dontDownloadResults;
  }


  public MultiArrayUDF ranges(QueryRanges ranges) {
    this.ranges = ranges;
    return this;
  }

  /**
   * Get ranges
   * @return ranges
   */
  @javax.annotation.Nullable
  public QueryRanges getRanges() {
    return ranges;
  }

  public void setRanges(QueryRanges ranges) {
    this.ranges = ranges;
  }


  public MultiArrayUDF subarray(UDFSubarray subarray) {
    this.subarray = subarray;
    return this;
  }

  /**
   * Get subarray
   * @return subarray
   */
  @javax.annotation.Nullable
  public UDFSubarray getSubarray() {
    return subarray;
  }

  public void setSubarray(UDFSubarray subarray) {
    this.subarray = subarray;
  }


  public MultiArrayUDF buffers(List<String> buffers) {
    this.buffers = buffers;
    return this;
  }

  public MultiArrayUDF addBuffersItem(String buffersItem) {
    if (this.buffers == null) {
      this.buffers = new ArrayList<>();
    }
    this.buffers.add(buffersItem);
    return this;
  }

  /**
   * List of buffers to fetch (attributes + dimensions). Deprecated; please set arrays with &#x60;UDFArrayDetails&#x60;.
   * @return buffers
   */
  @javax.annotation.Nullable
  public List<String> getBuffers() {
    return buffers;
  }

  public void setBuffers(List<String> buffers) {
    this.buffers = buffers;
  }


  public MultiArrayUDF arrays(List<UDFArrayDetails> arrays) {
    this.arrays = arrays;
    return this;
  }

  public MultiArrayUDF addArraysItem(UDFArrayDetails arraysItem) {
    if (this.arrays == null) {
      this.arrays = new ArrayList<>();
    }
    this.arrays.add(arraysItem);
    return this;
  }

  /**
   * Array ranges/buffer into to run UDF on
   * @return arrays
   */
  @javax.annotation.Nullable
  public List<UDFArrayDetails> getArrays() {
    return arrays;
  }

  public void setArrays(List<UDFArrayDetails> arrays) {
    this.arrays = arrays;
  }


  public MultiArrayUDF timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * UDF-type timeout in seconds (default: 900)
   * @return timeout
   */
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  public MultiArrayUDF taskGraphUuid(String taskGraphUuid) {
    this.taskGraphUuid = taskGraphUuid;
    return this;
  }

  /**
   * If set, the ID of the log for the task graph that this was part of. 
   * @return taskGraphUuid
   */
  @javax.annotation.Nullable
  public String getTaskGraphUuid() {
    return taskGraphUuid;
  }

  public void setTaskGraphUuid(String taskGraphUuid) {
    this.taskGraphUuid = taskGraphUuid;
  }


  public MultiArrayUDF clientNodeUuid(String clientNodeUuid) {
    this.clientNodeUuid = clientNodeUuid;
    return this;
  }

  /**
   * If set, the client-defined ID of the node within this task&#39;s graph. 
   * @return clientNodeUuid
   */
  @javax.annotation.Nullable
  public String getClientNodeUuid() {
    return clientNodeUuid;
  }

  public void setClientNodeUuid(String clientNodeUuid) {
    this.clientNodeUuid = clientNodeUuid;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MultiArrayUDF instance itself
   */
  public MultiArrayUDF putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    MultiArrayUDF multiArrayUDF = (MultiArrayUDF) o;
    return Objects.equals(this.udfInfoName, multiArrayUDF.udfInfoName) &&
        Objects.equals(this.language, multiArrayUDF.language) &&
        Objects.equals(this.version, multiArrayUDF.version) &&
        Objects.equals(this.imageName, multiArrayUDF.imageName) &&
        Objects.equals(this.accessCredentialsName, multiArrayUDF.accessCredentialsName) &&
        Objects.equals(this.resourceClass, multiArrayUDF.resourceClass) &&
        Objects.equals(this.exec, multiArrayUDF.exec) &&
        Objects.equals(this.execRaw, multiArrayUDF.execRaw) &&
        Objects.equals(this.resultFormat, multiArrayUDF.resultFormat) &&
        Objects.equals(this.taskName, multiArrayUDF.taskName) &&
        Objects.equals(this.argument, multiArrayUDF.argument) &&
        Objects.equals(this.argumentsJson, multiArrayUDF.argumentsJson) &&
        Objects.equals(this.storedParamUuids, multiArrayUDF.storedParamUuids) &&
        Objects.equals(this.storeResults, multiArrayUDF.storeResults) &&
        Objects.equals(this.dontDownloadResults, multiArrayUDF.dontDownloadResults) &&
        Objects.equals(this.ranges, multiArrayUDF.ranges) &&
        Objects.equals(this.subarray, multiArrayUDF.subarray) &&
        Objects.equals(this.buffers, multiArrayUDF.buffers) &&
        Objects.equals(this.arrays, multiArrayUDF.arrays) &&
        Objects.equals(this.timeout, multiArrayUDF.timeout) &&
        Objects.equals(this.taskGraphUuid, multiArrayUDF.taskGraphUuid) &&
        Objects.equals(this.clientNodeUuid, multiArrayUDF.clientNodeUuid)&&
        Objects.equals(this.additionalProperties, multiArrayUDF.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(udfInfoName, language, version, imageName, accessCredentialsName, resourceClass, exec, execRaw, resultFormat, taskName, argument, argumentsJson, storedParamUuids, storeResults, dontDownloadResults, ranges, subarray, buffers, arrays, timeout, taskGraphUuid, clientNodeUuid, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiArrayUDF {\n");
    sb.append("    udfInfoName: ").append(toIndentedString(udfInfoName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    accessCredentialsName: ").append(toIndentedString(accessCredentialsName)).append("\n");
    sb.append("    resourceClass: ").append(toIndentedString(resourceClass)).append("\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    execRaw: ").append(toIndentedString(execRaw)).append("\n");
    sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    argument: ").append(toIndentedString(argument)).append("\n");
    sb.append("    argumentsJson: ").append(toIndentedString(argumentsJson)).append("\n");
    sb.append("    storedParamUuids: ").append(toIndentedString(storedParamUuids)).append("\n");
    sb.append("    storeResults: ").append(toIndentedString(storeResults)).append("\n");
    sb.append("    dontDownloadResults: ").append(toIndentedString(dontDownloadResults)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    subarray: ").append(toIndentedString(subarray)).append("\n");
    sb.append("    buffers: ").append(toIndentedString(buffers)).append("\n");
    sb.append("    arrays: ").append(toIndentedString(arrays)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    taskGraphUuid: ").append(toIndentedString(taskGraphUuid)).append("\n");
    sb.append("    clientNodeUuid: ").append(toIndentedString(clientNodeUuid)).append("\n");
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
    openapiFields.add("udf_info_name");
    openapiFields.add("language");
    openapiFields.add("version");
    openapiFields.add("image_name");
    openapiFields.add("access_credentials_name");
    openapiFields.add("resource_class");
    openapiFields.add("exec");
    openapiFields.add("exec_raw");
    openapiFields.add("result_format");
    openapiFields.add("task_name");
    openapiFields.add("argument");
    openapiFields.add("arguments_json");
    openapiFields.add("stored_param_uuids");
    openapiFields.add("store_results");
    openapiFields.add("dont_download_results");
    openapiFields.add("ranges");
    openapiFields.add("subarray");
    openapiFields.add("buffers");
    openapiFields.add("arrays");
    openapiFields.add("timeout");
    openapiFields.add("task_graph_uuid");
    openapiFields.add("client_node_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MultiArrayUDF
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiArrayUDF.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiArrayUDF is not found in the empty JSON string", MultiArrayUDF.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("udf_info_name") != null && !jsonObj.get("udf_info_name").isJsonNull()) && !jsonObj.get("udf_info_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `udf_info_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("udf_info_name").toString()));
      }
      // validate the optional field `language`
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) {
        UDFLanguage.validateJsonElement(jsonObj.get("language"));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("image_name") != null && !jsonObj.get("image_name").isJsonNull()) && !jsonObj.get("image_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_name").toString()));
      }
      if ((jsonObj.get("access_credentials_name") != null && !jsonObj.get("access_credentials_name").isJsonNull()) && !jsonObj.get("access_credentials_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_credentials_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_credentials_name").toString()));
      }
      if ((jsonObj.get("resource_class") != null && !jsonObj.get("resource_class").isJsonNull()) && !jsonObj.get("resource_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_class").toString()));
      }
      if ((jsonObj.get("exec") != null && !jsonObj.get("exec").isJsonNull()) && !jsonObj.get("exec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exec").toString()));
      }
      if ((jsonObj.get("exec_raw") != null && !jsonObj.get("exec_raw").isJsonNull()) && !jsonObj.get("exec_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exec_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exec_raw").toString()));
      }
      // validate the optional field `result_format`
      if (jsonObj.get("result_format") != null && !jsonObj.get("result_format").isJsonNull()) {
        ResultFormat.validateJsonElement(jsonObj.get("result_format"));
      }
      if ((jsonObj.get("task_name") != null && !jsonObj.get("task_name").isJsonNull()) && !jsonObj.get("task_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_name").toString()));
      }
      if ((jsonObj.get("argument") != null && !jsonObj.get("argument").isJsonNull()) && !jsonObj.get("argument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `argument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("argument").toString()));
      }
      if (jsonObj.get("arguments_json") != null && !jsonObj.get("arguments_json").isJsonNull()) {
        JsonArray jsonArrayargumentsJson = jsonObj.getAsJsonArray("arguments_json");
        if (jsonArrayargumentsJson != null) {
          // ensure the json data is an array
          if (!jsonObj.get("arguments_json").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `arguments_json` to be an array in the JSON string but got `%s`", jsonObj.get("arguments_json").toString()));
          }

          // validate the optional field `arguments_json` (array)
          for (int i = 0; i < jsonArrayargumentsJson.size(); i++) {
            TGUDFArgument.validateJsonElement(jsonArrayargumentsJson.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("stored_param_uuids") != null && !jsonObj.get("stored_param_uuids").isJsonNull() && !jsonObj.get("stored_param_uuids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `stored_param_uuids` to be an array in the JSON string but got `%s`", jsonObj.get("stored_param_uuids").toString()));
      }
      // validate the optional field `ranges`
      if (jsonObj.get("ranges") != null && !jsonObj.get("ranges").isJsonNull()) {
        QueryRanges.validateJsonElement(jsonObj.get("ranges"));
      }
      // validate the optional field `subarray`
      if (jsonObj.get("subarray") != null && !jsonObj.get("subarray").isJsonNull()) {
        UDFSubarray.validateJsonElement(jsonObj.get("subarray"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buffers") != null && !jsonObj.get("buffers").isJsonNull() && !jsonObj.get("buffers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buffers` to be an array in the JSON string but got `%s`", jsonObj.get("buffers").toString()));
      }
      if (jsonObj.get("arrays") != null && !jsonObj.get("arrays").isJsonNull()) {
        JsonArray jsonArrayarrays = jsonObj.getAsJsonArray("arrays");
        if (jsonArrayarrays != null) {
          // ensure the json data is an array
          if (!jsonObj.get("arrays").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `arrays` to be an array in the JSON string but got `%s`", jsonObj.get("arrays").toString()));
          }

          // validate the optional field `arrays` (array)
          for (int i = 0; i < jsonArrayarrays.size(); i++) {
            UDFArrayDetails.validateJsonElement(jsonArrayarrays.get(i));
          };
        }
      }
      if ((jsonObj.get("task_graph_uuid") != null && !jsonObj.get("task_graph_uuid").isJsonNull()) && !jsonObj.get("task_graph_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_graph_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_graph_uuid").toString()));
      }
      if ((jsonObj.get("client_node_uuid") != null && !jsonObj.get("client_node_uuid").isJsonNull()) && !jsonObj.get("client_node_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_node_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_node_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiArrayUDF.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiArrayUDF' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiArrayUDF> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiArrayUDF.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiArrayUDF>() {
           @Override
           public void write(JsonWriter out, MultiArrayUDF value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiArrayUDF read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MultiArrayUDF instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
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
   * Create an instance of MultiArrayUDF given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MultiArrayUDF
   * @throws IOException if the JSON string is invalid with respect to MultiArrayUDF
   */
  public static MultiArrayUDF fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiArrayUDF.class);
  }

  /**
   * Convert an instance of MultiArrayUDF to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

