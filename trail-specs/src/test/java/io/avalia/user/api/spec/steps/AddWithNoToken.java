package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.user.ApiException;
import io.avalia.user.ApiResponse;
import io.avalia.user.api.DefaultApi;
import io.avalia.user.api.dto.User;
import io.avalia.user.api.spec.helpers.Environment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AddWithNoToken {

    private Environment environment;
    private DefaultApi api;

    User user;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public AddWithNoToken(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is an trailer server$")
    public void there_is_an_user_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have a new user payload$")
    public void iHaveANewUserPayload() {
        user = new User();
        user.setFirstname("Guillaume");
        user.setLastname("Blanco");
        user.setDate("05-03-2000");
        user.setEmail("guillaume.bla.ch");
    }

    @When("^I POST it to the /users endpoint again$")
    public void iPOSTItToTheUsersEndpointAgain() {
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

    @Then("^I receive a new (\\d+) status code$")
    public void i_receive_a_new_status_code(int arg1) throws Throwable {
        assertEquals(400, lastStatusCode);
    }
}
