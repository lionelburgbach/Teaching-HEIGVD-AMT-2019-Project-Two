package io.avalia.user.api.spec.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.user.api.spec.helpers.Environment;
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.dto.UserAuth;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeleteSteps {

    private Environment environment;
    private DefaultApi api;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public DeleteSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a user servers$")
    public void there_is_a_users_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have an authenticate users with admin rights$")
    public void iHaveAnAuthenticateUsersWithAdminRights() {

        UserAuth userAuth = new UserAuth();
        userAuth.setEmail("lionel.burgbacher@heig-vd.ch");
        userAuth.setPassword("lionel");

        try {
            lastApiResponse = api.createAuthenticationTokenWithHttpInfo(userAuth);
            lastApiCallThrewException = false;
            lastApiException = null;
            lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            lastApiCallThrewException = true;
            lastApiResponse = null;
            lastApiException = e;
            lastStatusCode = lastApiException.getCode();
        }

    }

    @When("^I DELETE it to the /users endpoint$")
    public void iDELETEItToTheUsersEndpoint() {

        ApiClient apiClient = new ApiClient();
        ArrayList<String> token = (ArrayList<String>)lastApiResponse.getHeaders().get("Authorization");
        apiClient.addDefaultHeader("Authorization", token.get(0));
        api.setApiClient(apiClient);

        try {
            lastApiResponse = api.deleteUserByIDWithHttpInfo("guillaume.blanco@ch");
            lastApiCallThrewException = false;
            lastApiException = null;
            lastStatusCode = lastApiResponse.getStatusCode();
        } catch (ApiException e) {
            lastApiCallThrewException = true;
            lastApiResponse = null;
            lastApiException = e;
            lastStatusCode = lastApiException.getCode();
        }
    }

    @Then("^I receive again a (\\d+) status code$")
    public void iReceiveAgainAStatusCode(int arg0) {
        assertEquals(200, lastStatusCode);
    }
}