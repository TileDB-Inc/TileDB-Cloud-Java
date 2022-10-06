package io.tiledb.cloud.rest_api;

import java.util.Objects;

public class Login {
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

    public Login(String username, String password, String host, String apiKey, boolean verifySSL, boolean rememberMe, boolean overwritePrevious) {
        Objects.requireNonNull(host, "host must not be null");
        this.password = password;
        this.username = username;
        this.host = host;
        this.apiKey = apiKey;
        this.verifySSL = verifySSL;
        this.rememberMe = rememberMe;
        this.overwritePrevious = overwritePrevious;
    }

    public Login() {
        this.overwritePrevious = false;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
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