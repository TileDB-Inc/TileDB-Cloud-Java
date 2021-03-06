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
import org.openapitools.client.model.Error;
import org.openapitools.client.model.InvitationArrayShareEmail;
import org.openapitools.client.model.InvitationData;
import org.openapitools.client.model.InvitationOrganizationJoinEmail;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitationApi
 */
@Ignore
public class InvitationApiTest {

    private final InvitationApi api = new InvitationApi();

    
    /**
     * 
     *
     * Accepts invitation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptInvitationTest() throws ApiException {
        String invitation = null;
                api.acceptInvitation(invitation);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancels join organization invitation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelJoinOrganizationTest() throws ApiException {
        String invitation = null;
        String organization = null;
                api.cancelJoinOrganization(invitation, organization);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancels array sharing invitation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelShareArrayByInviteTest() throws ApiException {
        String namespace = null;
        String invitation = null;
        String array = null;
                api.cancelShareArrayByInvite(namespace, invitation, array);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetch a list of invitations
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchInvitationsTest() throws ApiException {
        String organization = null;
        String array = null;
        Integer start = null;
        Integer end = null;
        Integer page = null;
        Integer perPage = null;
        String type = null;
        String status = null;
        String orderby = null;
                InvitationData response = api.fetchInvitations(organization, array, start, end, page, perPage, type, status, orderby);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends email to multiple recipients with joining information regarding an organization
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void joinOrganizationTest() throws ApiException {
        String organization = null;
        InvitationOrganizationJoinEmail emailInvite = null;
                api.joinOrganization(organization, emailInvite);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sends email to multiple recipients with sharing information regarding an array
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shareArrayByInviteTest() throws ApiException {
        String namespace = null;
        String array = null;
        InvitationArrayShareEmail emailInvite = null;
                api.shareArrayByInvite(namespace, array, emailInvite);
        // TODO: test validations
    }
    
}
