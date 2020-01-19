# DefaultApi

All URIs are relative to *http://localhost:8080/users-auth*

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



Try to authenticate

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");

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
**200** | authentication success |  -  |
**400** | Email and Password cannot be null |  -  |
**401** | Bad Credentials |  -  |

<a name="createUser"></a>
# **createUser**
> Object createUser(userInput)



Create a user

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");
    
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
**401** | You do not have necessary permissions to creat a user |  -  |

<a name="deleteUserByID"></a>
# **deleteUserByID**
> deleteUserByID(email)



Delete the user with this password

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email of the user
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
 **email** | **String**| email of the user |

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
**200** | successful operation |  -  |
**400** | Bad request |  -  |
**401** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

<a name="getUserByID"></a>
# **getUserByID**
> UserToken getUserByID(email)



Get the user with this email

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email of the user
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
 **email** | **String**| email of the user |

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
**400** | Bad request |  -  |
**401** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

<a name="getUsers"></a>
# **getUsers**
> List&lt;UserToken&gt; getUsers(pageNumber, numberOfUsersPerPage)



Get a list of all users

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageNumber = 0; // Integer | 
    Integer numberOfUsersPerPage = 30; // Integer | 
    try {
      List<UserToken> result = apiInstance.getUsers(pageNumber, numberOfUsersPerPage);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**|  | [optional] [default to 0]
 **numberOfUsersPerPage** | **Integer**|  | [optional] [default to 30]

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
**200** | success to get users |  -  |
**401** | You do not have necessary permissions for the resource |  -  |

<a name="updatePasswordByID"></a>
# **updatePasswordByID**
> updatePasswordByID(email, password)



Change password with this email

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
    defaultClient.setBasePath("http://localhost:8080/users-auth");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email of the user
    String password = "password_example"; // String | The password to change
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
 **email** | **String**| email of the user |
 **password** | **String**| The password to change |

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
**200** | successful operation |  -  |
**400** | You do not have necessary permissions for the resource |  -  |

