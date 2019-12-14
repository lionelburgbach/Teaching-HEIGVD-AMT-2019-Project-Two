# DefaultApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthenticationToken**](DefaultApi.md#createAuthenticationToken) | **POST** /authenticate | 
[**createUser**](DefaultApi.md#createUser) | **POST** /user | 
[**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /user/{email} | 
[**getUserByID**](DefaultApi.md#getUserByID) | **GET** /user/{email} | 
[**getUsers**](DefaultApi.md#getUsers) | **GET** /user | 
[**updateUser**](DefaultApi.md#updateUser) | **PUT** /user/{email} | 


<a name="createAuthenticationToken"></a>
# **createAuthenticationToken**
> Object createAuthenticationToken(userLogin)



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
    UserAuth userLogin = new UserAuth(); // UserAuth | 
    try {
      Object result = apiInstance.createAuthenticationToken(userLogin);
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
 **userLogin** | [**UserAuth**](UserAuth.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | created |  -  |

<a name="createUser"></a>
# **createUser**
> Object createUser(user)



create a user

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
    UserInput user = new UserInput(); // UserInput | 
    try {
      Object result = apiInstance.createUser(user);
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
 **user** | [**UserInput**](UserInput.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | created |  -  |
**403** | You do not have necessary permissions for the resource |  -  |

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
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The name that needs to be deleted
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
 **email** | **String**| The name that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

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
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The name that needs to be fetched. Use user1 for testing. 
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
 **email** | **String**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**UserOutput**](UserOutput.md)

### Authorization

No authorization required

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
import io.avalia.user.models.*;
import io.avalia.user.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api");

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**403** | You do not have necessary permissions for the resource |  -  |

<a name="updateUser"></a>
# **updateUser**
> updateUser(email, body)



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
    String email = "email_example"; // String | name that need to be updated
    User body = new User(); // User | Updated user object
    try {
      apiInstance.updateUser(email, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateUser");
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
 **body** | [**User**](User.md)| Updated user object |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**400** | Invalid user supplied |  -  |
**403** | You do not have necessary permissions for the resource |  -  |
**404** | User not found |  -  |

