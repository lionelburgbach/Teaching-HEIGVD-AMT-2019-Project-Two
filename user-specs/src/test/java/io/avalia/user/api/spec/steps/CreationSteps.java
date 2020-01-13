package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.dto.UserAuth;
import io.avalia.users.api.dto.UserInput;
import io.avalia.user.api.spec.helpers.Environment;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class CreationSteps {

    private Environment environment;
    private DefaultApi api;

    UserInput user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public CreationSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a users server$")
    public void there_is_a_users_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have an authenticate users$")
    public void iHaveAnAuthenticateUsers() {

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

    @Given("^I have a user payload$")
    public void i_have_a_users_payload() throws Throwable {

        user = new UserInput();
        user.setRole("admin");
        user.setEmail("guillaume.blanco@h.ch");
        user.setPassword("guillaume");
    }

    @When("^I POST it to the /users endpoint$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {

        ApiClient apiClient = new ApiClient();
        ArrayList<String> token = (ArrayList<String>)lastApiResponse.getHeaders().get("Authorization");
        apiClient.addDefaultHeader("Authorization", token.get(0));
        api.setApiClient(apiClient);

        try {
            lastApiResponse = api.createUserWithHttpInfo(user);
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

    @Then("^I receive a (\\d+) status code$")
    public void i_receive_a_status_code(int arg1) throws Throwable {
        assertEquals(201, lastStatusCode);
    }
}
