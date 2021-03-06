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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AWSAccessCredentials;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationUser;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
@Ignore
public class OrganizationApiTest {

    private final OrganizationApi api = new OrganizationApi();

    
    /**
     * 
     *
     * Add aws keys
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAWSAccessCredentialsTest() throws ApiException {
        String namespace = null;
        AWSAccessCredentials awsAccessCredentials = null;
                api.addAWSAccessCredentials(namespace, awsAccessCredentials);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * add a user to an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserToOrganizationTest() throws ApiException {
        String organization = null;
        OrganizationUser user = null;
                api.addUserToOrganization(organization, user);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Check if aws keys are set
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkAWSAccessCredentialsTest() throws ApiException {
        String namespace = null;
                List<AWSAccessCredentials> response = api.checkAWSAccessCredentials(namespace);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Check if aws keys are set by name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkAWSAccessCredentialsByNameTest() throws ApiException {
        String namespace = null;
        String name = null;
                AWSAccessCredentials response = api.checkAWSAccessCredentialsByName(namespace, name);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a organization, the user creating will be listed as owner
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationTest() throws ApiException {
        Organization organization = null;
                api.createOrganization(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a AWS Access credentials in a namespace. This will likely cause arrays to become unreachable
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAWSAccessCredentialsTest() throws ApiException {
        String namespace = null;
        String name = null;
                api.deleteAWSAccessCredentials(namespace, name);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationTest() throws ApiException {
        String organization = null;
                api.deleteOrganization(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a user from an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserFromOrganizationTest() throws ApiException {
        String organization = null;
        String username = null;
                api.deleteUserFromOrganization(organization, username);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * get all organizations that the user is member of
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllOrganizationsTest() throws ApiException {
                List<Organization> response = api.getAllOrganizations();
        // TODO: test validations
    }
    
    /**
     * 
     *
     * get a organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationTest() throws ApiException {
        String organization = null;
                Organization response = api.getOrganization(organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * get a user from an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationUserTest() throws ApiException {
        String organization = null;
        String username = null;
                OrganizationUser response = api.getOrganizationUser(organization, username);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update aws keys or associated buckets. This will update the key associations for each array in the namespace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAWSAccessCredentialsTest() throws ApiException {
        String namespace = null;
        String name = null;
        AWSAccessCredentials awsAccessCredentials = null;
                api.updateAWSAccessCredentials(namespace, name, awsAccessCredentials);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationTest() throws ApiException {
        String organization = null;
        Organization organizationDetails = null;
                api.updateOrganization(organization, organizationDetails);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a user in an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserInOrganizationTest() throws ApiException {
        String organization = null;
        String username = null;
        OrganizationUser user = null;
                api.updateUserInOrganization(organization, username, user);
        // TODO: test validations
    }
    
}
