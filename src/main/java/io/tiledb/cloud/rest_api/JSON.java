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


package io.tiledb.cloud.rest_api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AWSAccessCredentials.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Array.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayActivityLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayBrowserData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayBrowserSidebar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayConsolidationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayEndTimestampData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayFavorite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayFavoritesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayInfoUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayMetadataEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArraySample.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArraySchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArraySharing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayTask.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayTaskBrowserSidebar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayTaskData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayTaskLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ArrayVacuumRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AssetInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AssetListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AssetLocations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Attribute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AttributeBufferHeader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.AttributeBufferSize.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Backoff.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Dimension.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.DimensionCoordinate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.DimensionTileExtent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Domain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.DomainArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.DomainCheckResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Enumeration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FileCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FileCreated.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FileExport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FileExported.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FileUploaded.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Filter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FilterData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FilterPipeline.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FragmentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FragmentInfoRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.FragmentMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GenericUDF.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GetTiledbStats200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupBrowserData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupBrowserFilterData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupChanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupContentActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupContentActivityAsset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupContentActivityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupContents.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupContentsFilterData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupMember.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupRegister.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupSharing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupSharingRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.GroupUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Invitation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.InvitationArrayShareEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.InvitationData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.InvitationFailedRecipients.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.InvitationGroupShareEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.InvitationOrganizationJoinEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.LastAccessedArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.LoadArraySchemaRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.LoadArraySchemaResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.LoadEnumerationsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.LoadEnumerationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MLModelFavorite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MLModelFavoritesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MaxBufferSizes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MetadataStringified.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MetadataStringifiedEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.MultiArrayUDF.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NonEmptyDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NotebookCopied.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NotebookCopy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NotebookFavorite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NotebookFavoritesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.NotebookStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Organization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.OrganizationUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.OrganizationUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.PaginationMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Pricing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Query.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.QueryJson.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.QueryRanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.QueryReader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ReadState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.RegisteredTaskGraph.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.ResetUserPasswordRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.RetryStrategy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SQLParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SSODomainConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SSODomainConfigResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SSODomainSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SharePaymentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SingleFragmentInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.StorageLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Subarray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SubarrayPartitioner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SubarrayPartitionerCurrent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SubarrayPartitionerState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.SubarrayRanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Subscription.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGArrayNodeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGInputNodeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGQueryRanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGSQLNodeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGUDFArgument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGUDFEnvironment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGUDFEnvironmentResources.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGUDFNodeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TGUDFStorage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraph.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphClientNodeStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphLogsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphNodeMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphSharing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TaskGraphs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TileDBConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TileDBConfigEntriesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Token.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.TokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFArrayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFCopied.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFCopy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFFavorite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFFavoritesData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFImage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFImageVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFInfoUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFSharing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFSubarray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.UDFSubarrayRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new io.tiledb.cloud.rest_api.model.Writer.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
