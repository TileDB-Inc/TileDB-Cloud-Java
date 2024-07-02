package io.tiledb.cloud;

import io.tiledb.cloud.rest_api.v1.ApiException;

public class TileDBLogin {
    /** The client password */
    private String password;

    /** The client username */
    private String username;

    /** The host*/
    private String host;

    /** The User's api token. Can be found in the TileDB console at https://www.console.tiledb.com */
    private String apiKey;

    /** True to verify SSL */
    private boolean verifySSL;

    /** True if the user wants their login credentials to be remembered. If yes, they will be saved at ~/.tiledb/cloud.json */
    private boolean rememberMe;

    /** True if the user wants their current login input to overwrite the last one */
    private boolean overwritePrevious;

    /**
     * Constructor
     *
     * @param username The username
     * @param password The password
     * @param apiKey The User's api token. Can be found in the TileDB console at https://www.console.tiledb.com
     * @param verifySSL True to verify SSL
     * @param rememberMe True if the user wants their login credentials to be remembered
     * @param overwritePrevious True if the user wants their current login input to overwrite the last one
     */
    public TileDBLogin(String username, String password, String apiKey, boolean verifySSL,
                       boolean rememberMe, boolean overwritePrevious) {
        this.password = password;
        this.username = username;
        this.apiKey = apiKey;
        this.verifySSL = verifySSL;
        this.rememberMe = rememberMe;
        this.overwritePrevious = overwritePrevious;
        this.host = "";
    }

    /**
     * Constructor
     *
     * @param username The username
     * @param password The password
     * @param apiKey The User's api token. Can be found in the TileDB console at https://www.console.tiledb.com
     * @param verifySSL True to verify SSL
     * @param rememberMe True if the user wants their login credentials to be remembered
     * @param overwritePrevious True if the user wants their current login input to overwrite the last one
     * @param host The host name
     */
    public TileDBLogin(String username, String password, String apiKey, boolean verifySSL,
                       boolean rememberMe, boolean overwritePrevious, String host) throws ApiException {

        this.password = password;
        this.username = username;
        this.apiKey = apiKey;
        this.verifySSL = verifySSL;
        this.rememberMe = rememberMe;
        this.host = host + "/v1";
        this.overwritePrevious = overwritePrevious;
    }

    public String getHost() {
        return host;
    }

    public TileDBLogin() {
        this.overwritePrevious = false;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getApiKey() {
        return apiKey;
    }

    public boolean overwritePrevious() {
        return overwritePrevious;
    }

    public boolean isVerifySSL() {
        return verifySSL;
    }

    public boolean rememberMe() {
        return rememberMe;
    }

    public boolean isValid(){
        return apiKey != null || (password != null && username != null);
    }
}
