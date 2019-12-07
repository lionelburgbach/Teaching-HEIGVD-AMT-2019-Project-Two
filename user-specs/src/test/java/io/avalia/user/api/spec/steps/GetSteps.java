package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.user.ApiException;
import io.avalia.user.ApiResponse;
import io.avalia.user.api.DefaultApi;
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

    @When("^I GET it to the /user endpoint$")
    public void i_GET_it_to_the_user_endpoint() throws Throwable {
        try {
            lastApiResponse = api.getUsersWithHttpInfo();
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
