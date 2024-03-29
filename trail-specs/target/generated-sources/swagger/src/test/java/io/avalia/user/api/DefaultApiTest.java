/*
 * Trailer API
 * An API to demonstrate Swagger and Spring Boot
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.avalia.user.api;

import io.avalia.user.ApiException;
import io.avalia.user.api.dto.RegistrationInput;
import io.avalia.user.api.dto.RegistrationOutput;
import io.avalia.user.api.dto.Trail;
import io.avalia.user.api.dto.TrailOutput;
import io.avalia.user.api.dto.User;
import io.avalia.user.api.dto.UserUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Create a registration for this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRegistrationTest() throws ApiException {
        String email = null;
        RegistrationInput registration = null;
        Object response = api.createRegistration(email, registration);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a trail
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTrailTest() throws ApiException {
        Trail trail = null;
        Object response = api.createTrail(trail);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
        Object response = api.createUser(user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a registration for this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRegistrationByIDTest() throws ApiException {
        String email = null;
        Long id = null;
        api.deleteRegistrationByID(email, id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete the trail with this id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTrailByIDTest() throws ApiException {
        Long id = null;
        api.deleteTrailByID(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete the user with this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserByIDTest() throws ApiException {
        String email = null;
        api.deleteUserByID(email);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get All registration with this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistrationsByIdUserTest() throws ApiException {
        String email = null;
        Integer pageNumber = null;
        Integer numberOfRegistrationsPerPage = null;
        List<RegistrationOutput> response = api.getRegistrationsByIdUser(email, pageNumber, numberOfRegistrationsPerPage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the trail by this id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrailByIDTest() throws ApiException {
        Long id = null;
        TrailOutput response = api.getTrailByID(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get all trails
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrailsTest() throws ApiException {
        Integer pageNumber = null;
        Integer numberOfTrailsPerPage = null;
        List<TrailOutput> response = api.getTrails(pageNumber, numberOfTrailsPerPage);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the user with this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByIDTest() throws ApiException {
        String email = null;
        User response = api.getUserByID(email);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the trail with this id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTrailByIDTest() throws ApiException {
        Long id = null;
        Trail trail = null;
        api.updateTrailByID(id, trail);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update the user with this email
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserByIDTest() throws ApiException {
        String email = null;
        UserUpdate userUpdate = null;
        api.updateUserByID(email, userUpdate);

        // TODO: test validations
    }
    
}
