package io.tiledb.cloud;

import io.tiledb.cloud.rest_api.ApiClient;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Map;
import java.util.Objects;

public class TileDBClient{

    private static String apiKey;
    private static String username;
    private static String password;
    private static String basePath;

    private static boolean verifyingSsl = true;

    private static boolean loginInfoIsInJSONFile;

    private static final String homeDir = System.getProperty("user.home");

    private ApiClient apiClient;

    /**
     * Static initialization.
     */
    static
    {
        apiKey = "";
        username = "";
        password = "";
        basePath = "https://api.tiledb.com/v1";
        loginInfoIsInJSONFile = true;
        System.out.println("STATIC INIT");
        boolean ok =  false;
        try {
            ok = loadCloudJSONFileFromHome();
        } catch (Exception e) {
            loginInfoIsInJSONFile = false;
        }
        if (!ok) {
            loginInfoIsInJSONFile = false;
        }
    }

    /**
     * If exists, it reads the cloud.json file which is stored in the home
     * folder to look for stored credentials.
     * @return true if found
     * @throws IOException
     */
    private static boolean loadCloudJSONFileFromHome() throws IOException {
        String fileName = homeDir + "/.tiledb/cloud.json";

        File initialFile = new File(fileName);
        InputStream is = Files.newInputStream(initialFile.toPath());

        JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);

        if (object.has("api_key")){
            apiKey = object.getString("api_key");
        }
        if (object.has("username")){
            username = object.getString("username");
        }
        if (object.has("password")){
            password = object.getString("password");
        }
        if (object.has("host")){
            basePath = object.getString("host");
        }
        if (object.has("verify_ssl")){
            boolean verifySSL = object.getBoolean("verify_ssl");
            verifyingSsl = verifySSL;
        }

        // check if credentials are adequate for logging in
        if (Objects.equals(basePath, "") ||
                (Objects.equals(apiKey, "") && (Objects.equals(password, "") && !Objects.equals(username, ""))
                        || (Objects.equals(apiKey, "") && ((Objects.equals(password, "") || Objects.equals(username, "")))))){
            return false;
        }

        return true;
    }

    /**
     * This method throws an exception if there is no login information in the json file or passed
     * as a parameter. If the login information has data it calls another helper method to save it.
     * @param login
     */
    private void findCredentials(Login login) {
        if (!loginInfoIsInJSONFile) {
            //requires login from user for the first time
            if (login == null || !login.isValid()){
                throw new RuntimeException("No login info was provided nor found. " +
                        "Use the Login class to login for the first time");
            } else {
                populateFieldsFromLogin(login);
            }
        } else if (login != null && login.overwritePrevious()){ //in this case the data in the json is overwritten.
            populateFieldsFromLogin(login);
        }
    }

    /**
     * Saves the data from the Login object.
     * @param login The Login object
     */
    private void populateFieldsFromLogin(Login login) {
        apiKey = login.getApiKey();
        username = login.getUsername();
        password = login.getPassword();
        basePath = login.getHost();
        verifyingSsl = login.isVerifySSL();
        if (login.rememberMe()) { //save credentials
            writeAuthJSONFileToHome();
        }
    }

    /**
     * Writes the json file to the home folder
     */
    private void writeAuthJSONFileToHome() {
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("api_key", apiKey);
        jsonObject.put("username", username);
        jsonObject.put("password", password);
        jsonObject.put("host", basePath);
        jsonObject.put("verify_ssl", verifyingSsl);
        try {
            File file = new File(homeDir + "/.tiledb/cloud.json");
            file.getParentFile().mkdirs(); //create /.tiledb dir if not present
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jsonObject.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Basic constructor with custom OkHttpClient
     *
     * @param client an okhttp3.OkHttpClient object
     * @param login Login object with credentials
     */
    public TileDBClient(OkHttpClient client, Login login){
        apiClient = new ApiClient(client);
        setClientCredentials(login);
    }

    /**
     * Basic constructor with custom OkHttpClient
     *
     * @param client an okhttp3.OkHttpClient object
     */
    public TileDBClient(OkHttpClient client){
        apiClient = new ApiClient(client);
        setClientCredentials(new Login());
    }

    /**
     * Basic constructor
     *
     * @param login Login object with credentials
     */
    public TileDBClient(Login login){
        apiClient = new ApiClient();
        setClientCredentials(login);
    }

    /**
     * Basic constructor
     *
     */
    public TileDBClient(){
        apiClient = new ApiClient();
        setClientCredentials(new Login());
    }

    /**
     * Constructor for TileDBClient to support access token retry on 401/403 configured with base path, client ID, secret, and additional parameters
     *
     * @param basePath base path
     * @param clientId client ID
     * @param clientSecret client secret
     * @param parameters a java.util.Map of parameters
     */
    public TileDBClient(String basePath, String clientId, String clientSecret, Map<String, String> parameters){
        apiClient = new ApiClient(basePath, clientId, clientSecret, parameters);
        setClientCredentials(new Login());
    }

    /**
     * Constructor for TileDBClient to support access token retry on 401/403 configured with base path, client ID, secret, and additional parameters
     *
     * @param basePath base path
     * @param clientId client ID
     * @param clientSecret client secret
     * @param parameters a java.util.Map of parameters
     * @param login Login object with credentials
     */
    public TileDBClient(String basePath, String clientId, String clientSecret, Map<String, String> parameters, Login login){
        apiClient = new ApiClient(basePath, clientId, clientSecret, parameters);
        setClientCredentials(login);
    }

    /**
     * Finds and sets the credentials to the client
     * @param login
     */
    private void setClientCredentials(Login login) {
        findCredentials(login);
        apiClient.setApiKey(apiKey);
        apiClient.setUsername(username);
        apiClient.setPassword(password);
        apiClient.setBasePath(basePath);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }
}