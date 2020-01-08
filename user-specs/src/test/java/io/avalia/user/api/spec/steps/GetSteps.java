package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.api.DefaultApi;
import io.avalia.users.api.dto.UserAuth;
import io.avalia.user.api.spec.helpers.Environment;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class GetSteps {

    private Environment environment;
    private DefaultApi api;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public GetSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a server$")
    public void there_is_a_server() throws Throwable {
        assertNotNull(api);
    }

    @When("^I POST a correct users /authenticate endpoint$")
    public void i_POST_it_to_the_users_endpoint() throws Throwable {

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

    @Then("^I receive an (\\d+) status code$")
    public void i_receive_a_GET_status_code(int arg1) throws Throwable {
        assertEquals(200, lastStatusCode);
    }

}
