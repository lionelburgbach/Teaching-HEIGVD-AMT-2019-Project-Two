/*
 * Users API
 * An API to demonstrate Swagger and Spring Boot
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.avalia.users.api;

import io.avalia.users.ApiCallback;
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.ApiResponse;
import io.avalia.users.Configuration;
import io.avalia.users.Pair;
import io.avalia.users.ProgressRequestBody;
import io.avalia.users.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.avalia.users.api.dto.UserAuth;
import io.avalia.users.api.dto.UserInput;
import io.avalia.users.api.dto.UserToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createAuthenticationToken
     * @param userAuth  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> authentication success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Email and Password cannot be null </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad Credentials </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAuthenticationTokenCall(UserAuth userAuth, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userAuth;

        // create path and map variables
        String localVarPath = "/authenticate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createAuthenticationTokenValidateBeforeCall(UserAuth userAuth, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userAuth' is set
        if (userAuth == null) {
            throw new ApiException("Missing the required parameter 'userAuth' when calling createAuthenticationToken(Async)");
        }
        

        okhttp3.Call localVarCall = createAuthenticationTokenCall(userAuth, _callback);
        return localVarCall;

    }

    /**
     * 
     * Try to authenticate
     * @param userAuth  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> authentication success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Email and Password cannot be null </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad Credentials </td><td>  -  </td></tr>
     </table>
     */
    public Object createAuthenticationToken(UserAuth userAuth) throws ApiException {
        ApiResponse<Object> localVarResp = createAuthenticationTokenWithHttpInfo(userAuth);
        return localVarResp.getData();
    }

    /**
     * 
     * Try to authenticate
     * @param userAuth  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> authentication success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Email and Password cannot be null </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad Credentials </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> createAuthenticationTokenWithHttpInfo(UserAuth userAuth) throws ApiException {
        okhttp3.Call localVarCall = createAuthenticationTokenValidateBeforeCall(userAuth, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Try to authenticate
     * @param userAuth  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> authentication success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Email and Password cannot be null </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Bad Credentials </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAuthenticationTokenAsync(UserAuth userAuth, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAuthenticationTokenValidateBeforeCall(userAuth, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createUser
     * @param userInput  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions to creat a user </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserCall(UserInput userInput, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userInput;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createUserValidateBeforeCall(UserInput userInput, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userInput' is set
        if (userInput == null) {
            throw new ApiException("Missing the required parameter 'userInput' when calling createUser(Async)");
        }
        

        okhttp3.Call localVarCall = createUserCall(userInput, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a user
     * @param userInput  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions to creat a user </td><td>  -  </td></tr>
     </table>
     */
    public Object createUser(UserInput userInput) throws ApiException {
        ApiResponse<Object> localVarResp = createUserWithHttpInfo(userInput);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a user
     * @param userInput  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions to creat a user </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> createUserWithHttpInfo(UserInput userInput) throws ApiException {
        okhttp3.Call localVarCall = createUserValidateBeforeCall(userInput, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a user
     * @param userInput  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions to creat a user </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createUserAsync(UserInput userInput, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createUserValidateBeforeCall(userInput, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUserByID
     * @param email email of the user (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserByIDCall(String email, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{email}"
            .replaceAll("\\{" + "email" + "\\}", localVarApiClient.escapeString(email.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserByIDValidateBeforeCall(String email, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling deleteUserByID(Async)");
        }
        

        okhttp3.Call localVarCall = deleteUserByIDCall(email, _callback);
        return localVarCall;

    }

    /**
     * 
     * Delete the user with this password
     * @param email email of the user (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteUserByID(String email) throws ApiException {
        deleteUserByIDWithHttpInfo(email);
    }

    /**
     * 
     * Delete the user with this password
     * @param email email of the user (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteUserByIDWithHttpInfo(String email) throws ApiException {
        okhttp3.Call localVarCall = deleteUserByIDValidateBeforeCall(email, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete the user with this password
     * @param email email of the user (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteUserByIDAsync(String email, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserByIDValidateBeforeCall(email, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserByID
     * @param email email of the user (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByIDCall(String email, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{email}"
            .replaceAll("\\{" + "email" + "\\}", localVarApiClient.escapeString(email.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserByIDValidateBeforeCall(String email, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling getUserByID(Async)");
        }
        

        okhttp3.Call localVarCall = getUserByIDCall(email, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get the user with this email
     * @param email email of the user (required)
     * @return UserToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public UserToken getUserByID(String email) throws ApiException {
        ApiResponse<UserToken> localVarResp = getUserByIDWithHttpInfo(email);
        return localVarResp.getData();
    }

    /**
     * 
     * Get the user with this email
     * @param email email of the user (required)
     * @return ApiResponse&lt;UserToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserToken> getUserByIDWithHttpInfo(String email) throws ApiException {
        okhttp3.Call localVarCall = getUserByIDValidateBeforeCall(email, null);
        Type localVarReturnType = new TypeToken<UserToken>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the user with this email
     * @param email email of the user (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserByIDAsync(String email, final ApiCallback<UserToken> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserByIDValidateBeforeCall(email, _callback);
        Type localVarReturnType = new TypeToken<UserToken>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUsers
     * @param pageNumber  (optional, default to 0)
     * @param numberOfUsersPerPage  (optional, default to 30)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success to get users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsersCall(Integer pageNumber, Integer numberOfUsersPerPage, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("PageNumber", pageNumber));
        }

        if (numberOfUsersPerPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("numberOfUsersPerPage", numberOfUsersPerPage));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUsersValidateBeforeCall(Integer pageNumber, Integer numberOfUsersPerPage, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getUsersCall(pageNumber, numberOfUsersPerPage, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a list of all users
     * @param pageNumber  (optional, default to 0)
     * @param numberOfUsersPerPage  (optional, default to 30)
     * @return List&lt;UserToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success to get users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public List<UserToken> getUsers(Integer pageNumber, Integer numberOfUsersPerPage) throws ApiException {
        ApiResponse<List<UserToken>> localVarResp = getUsersWithHttpInfo(pageNumber, numberOfUsersPerPage);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a list of all users
     * @param pageNumber  (optional, default to 0)
     * @param numberOfUsersPerPage  (optional, default to 30)
     * @return ApiResponse&lt;List&lt;UserToken&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success to get users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<UserToken>> getUsersWithHttpInfo(Integer pageNumber, Integer numberOfUsersPerPage) throws ApiException {
        okhttp3.Call localVarCall = getUsersValidateBeforeCall(pageNumber, numberOfUsersPerPage, null);
        Type localVarReturnType = new TypeToken<List<UserToken>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all users
     * @param pageNumber  (optional, default to 0)
     * @param numberOfUsersPerPage  (optional, default to 30)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success to get users </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUsersAsync(Integer pageNumber, Integer numberOfUsersPerPage, final ApiCallback<List<UserToken>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUsersValidateBeforeCall(pageNumber, numberOfUsersPerPage, _callback);
        Type localVarReturnType = new TypeToken<List<UserToken>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePasswordByID
     * @param email email of the user (required)
     * @param password The password to change (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePasswordByIDCall(String email, String password, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/users/{email}"
            .replaceAll("\\{" + "email" + "\\}", localVarApiClient.escapeString(email.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (password != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("password", password));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Bearer" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePasswordByIDValidateBeforeCall(String email, String password, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling updatePasswordByID(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling updatePasswordByID(Async)");
        }
        

        okhttp3.Call localVarCall = updatePasswordByIDCall(email, password, _callback);
        return localVarCall;

    }

    /**
     * 
     * Change password with this email
     * @param email email of the user (required)
     * @param password The password to change (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public void updatePasswordByID(String email, String password) throws ApiException {
        updatePasswordByIDWithHttpInfo(email, password);
    }

    /**
     * 
     * Change password with this email
     * @param email email of the user (required)
     * @param password The password to change (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updatePasswordByIDWithHttpInfo(String email, String password) throws ApiException {
        okhttp3.Call localVarCall = updatePasswordByIDValidateBeforeCall(email, password, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Change password with this email
     * @param email email of the user (required)
     * @param password The password to change (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> You do not have necessary permissions for the resource </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePasswordByIDAsync(String email, String password, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePasswordByIDValidateBeforeCall(email, password, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
