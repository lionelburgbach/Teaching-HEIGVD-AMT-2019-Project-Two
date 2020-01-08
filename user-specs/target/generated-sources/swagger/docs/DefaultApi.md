# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationToken**](DefaultApi.md#createAuthenticationToken) | **POST** /authenticate | 
[**createUser**](DefaultApi.md#createUser) | **POST** /users | 
[**deleteUserByID**](DefaultApi.md#deleteUserByID) | **DELETE** /users/{email} | 
[**getUserByID**](DefaultApi.md#getUserByID) | **GET** /users/{email} | 
[**getUsers**](DefaultApi.md#getUsers) | **GET** /users | 
[**updatePasswordByID**](DefaultApi.md#updatePasswordByID) | **PUT** /users/{email} | 


<a name="createAuthenticationToken"></a>
# **createAuthenticationToken**
> Object createAuthenticationToken(userAuth)



try to authenticate

### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserAuth userAuth = new UserAuth(); // UserAuth | 
    try {
      Object result = apiInstance.createAuthenticationToken(userAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createAuthenticationToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAuth** | [**UserAuth**](UserAuth.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | get your token |  -  |
**401** | fail to authenticat |  -  |

<a name="createUser"></a>
# **createUser**
> Object createUser(userInput)



create a user

### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.auth.*;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserInput userInput = new UserInput(); // UserInput | 
    try {
      Object result = apiInstance.createUser(userInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userInput** | [**UserInput**](UserInput.md)|  |

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | created |  -  |
**403** | You do not have necessary permissions for the resource |  -  |
**502** | You do not have necessary permissions for the resource |  -  |

<a name="deleteUserByID"></a>
# **deleteUserByID**
> deleteUserByID(email)



This can only be done by the logged in user.

### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.auth.*;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | name that need to be updated
    try {
      apiInstance.deleteUserByID(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUserByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| name that need to be updated |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Invalid username supplied |  -  |
**403** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

<a name="getUserByID"></a>
# **getUserByID**
> UserToken getUserByID(email)



### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.auth.*;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | name that need to be updated
    try {
      UserToken result = apiInstance.getUserByID(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUserByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| name that need to be updated |

### Return type

[**UserToken**](UserToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid username supplied |  -  |
**403** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

<a name="getUsers"></a>
# **getUsers**
> List&lt;UserToken&gt; getUsers()



get user paramater

### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.auth.*;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<UserToken> result = apiInstance.getUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserToken&gt;**](UserToken.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**403** | You do not have necessary permissions for the resource |  -  |

<a name="updatePasswordByID"></a>
# **updatePasswordByID**
> updatePasswordByID(email, password)



### Example
```java
// Import classes:
import io.avalia.users.ApiClient;
import io.avalia.users.ApiException;
import io.avalia.users.Configuration;
import io.avalia.users.auth.*;
import io.avalia.users.models.*;
import io.avalia.users.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | name that need to be updated
    String password = "password_example"; // String | Updated user object
    try {
      apiInstance.updatePasswordByID(email, password);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updatePasswordByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| name that need to be updated |
 **password** | **String**| Updated user object |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Invalid user supplied |  -  |
**403** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

