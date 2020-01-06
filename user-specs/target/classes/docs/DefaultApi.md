# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](DefaultApi.md#changePassword) | **PUT** /users/{email} | 
[**createAuthenticationToken**](DefaultApi.md#createAuthenticationToken) | **POST** /authenticate | 
[**createUser**](DefaultApi.md#createUser) | **POST** /users | 
[**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /users/{email} | 
[**getUserByID**](DefaultApi.md#getUserByID) | **GET** /users/{email} | 
[**getUsers**](DefaultApi.md#getUsers) | **GET** /users | 


<a name="changePassword"></a>
# **changePassword**
> changePassword(email, password)



### Example
```java
// Import classes:
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.auth.*;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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
      apiInstance.changePassword(email, password);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#changePassword");
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

<a name="createAuthenticationToken"></a>
# **createAuthenticationToken**
> Object createAuthenticationToken(userAuth)



try to authenticate

### Example
```java
// Import classes:
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.auth.*;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(email)



This can only be done by the logged in user.

### Example
```java
// Import classes:
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.auth.*;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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
      apiInstance.deleteUser(email);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUser");
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
> UserOutput getUserByID(email)



### Example
```java
// Import classes:
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.auth.*;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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
      UserOutput result = apiInstance.getUserByID(email);
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

[**UserOutput**](UserOutput.md)

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
> List&lt;UserOutput&gt; getUsers()



get user paramater

### Example
```java
// Import classes:
import io.avalia.user.ApiClient;
import io.avalia.user.ApiException;
import io.avalia.user.Configuration;
import io.avalia.user.auth.*;
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

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
      List<UserOutput> result = apiInstance.getUsers();
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

[**List&lt;UserOutput&gt;**](UserOutput.md)

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

