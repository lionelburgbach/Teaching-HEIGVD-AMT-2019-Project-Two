package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.user.ApiException;
import io.avalia.user.ApiResponse;
import io.avalia.user.api.DefaultApi;
import io.avalia.user.api.dto.User;
import io.avalia.user.api.dto.UserInput;
import io.avalia.user.api.spec.helpers.Environment;

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

    @Given("^there is a user server$")
    public void there_is_a_user_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {
        //user = new io.avalia.user.api.dto.UserInput();

        user = new UserInput();
        user.setFirstname("Guillaume");
        user.setLastname("Blanco");
        user.setRole("admin");
        user.setEmail("guillaume.blanco@h.ch");
        user.setPassword("guillaume");
    }

    @When("^I POST it to the /user endpoint$")
    public void i_POST_it_to_the_user_endpoint() throws Throwable {
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
