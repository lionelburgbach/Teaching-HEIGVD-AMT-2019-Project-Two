package io.avalia.user.api.spec.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.avalia.user.ApiException;
import io.avalia.user.ApiResponse;
import io.avalia.user.api.DefaultApi;
import io.avalia.user.api.dto.User;
import io.avalia.user.api.spec.helpers.Environment;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Olivier Liechti on 27/07/17.
 */
public class CreationAndDeleteSteps {

    private Environment environment;
    private DefaultApi api;

    User user;
    String email;

    private ApiResponse lastApiResponse;
    private ApiException lastApiException;
    private boolean lastApiCallThrewException;
    private int lastStatusCode;

    public CreationAndDeleteSteps(Environment environment) {
        this.environment = environment;
        this.api = environment.getApi();
    }

    @Given("^there is a trailer server$")
    public void there_is_a_user_server() throws Throwable {
        assertNotNull(api);
    }

    @Given("^I have a user payload$")
    public void i_have_a_user_payload() throws Throwable {
        //user = new io.avalia.user.api.dto.User();
        user = new User();
        user.setFirstname("Guillaume");
        user.setLastname("Blanco");
        user.setDate("05-03-2000");
        user.setEmail("guillaume.blanco@heig.ch");
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

    @Given("^I have a userId$")
    public void i_have_a_user_id() throws Throwable {
        //user = new io.avalia.user.api.dto.User();
        email = "guillaume.blanco@heig.ch";
    }

    @When("^I Delete it to the /user/email endpoint$")
    public void i_Delete_it_to_the_user_endpoint() throws Throwable {
          api.deleteUserByID(email);
    }

    /*
    @Then("^I have an error if I get this id$")
    public void i_have_an_error_if_I_get_this_id() throws Throwable {
        assertEquals(100, api.getUserByID(email));

    }
     */
}
