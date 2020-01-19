# DefaultApi

All URIs are relative to *http://localhost:8081/trails*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistration**](DefaultApi.md#createRegistration) | **POST** /registrations/{email} | 
[**createTrail**](DefaultApi.md#createTrail) | **POST** /trails | 
[**createUser**](DefaultApi.md#createUser) | **POST** /users | 
[**deleteRegistrationByID**](DefaultApi.md#deleteRegistrationByID) | **DELETE** /registrations/{email} | 
[**deleteTrailByID**](DefaultApi.md#deleteTrailByID) | **DELETE** /trails/{id} | 
[**deleteUserByID**](DefaultApi.md#deleteUserByID) | **DELETE** /users/{email} | 
[**getRegistrationsByIdUser**](DefaultApi.md#getRegistrationsByIdUser) | **GET** /registrations/{email} | 
[**getTrailByID**](DefaultApi.md#getTrailByID) | **GET** /trails/{id} | 
[**getTrails**](DefaultApi.md#getTrails) | **GET** /trails | 
[**getUserByID**](DefaultApi.md#getUserByID) | **GET** /users/{email} | 
[**updateTrailByID**](DefaultApi.md#updateTrailByID) | **PUT** /trails/{id} | 
[**updateUserByID**](DefaultApi.md#updateUserByID) | **PUT** /users/{email} | 


<a name="createRegistration"></a>
# **createRegistration**
> Object createRegistration(email, registration)



Create a registration for this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email from the user
    RegistrationInput registration = new RegistrationInput(); // RegistrationInput | 
    try {
      Object result = apiInstance.createRegistration(email, registration);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createRegistration");
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
 **email** | **String**| email from the user |
 **registration** | [**RegistrationInput**](RegistrationInput.md)|  |

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
**400** | Registration problem |  -  |

<a name="createTrail"></a>
# **createTrail**
> Object createTrail(trail)



Create a trail

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Trail trail = new Trail(); // Trail | 
    try {
      Object result = apiInstance.createTrail(trail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createTrail");
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
 **trail** | [**Trail**](Trail.md)|  |

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

<a name="createUser"></a>
# **createUser**
> Object createUser(user)



Create a user

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    User user = new User(); // User | 
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
 **user** | [**User**](User.md)|  |

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
**404** | This email already exist! |  -  |

<a name="deleteRegistrationByID"></a>
# **deleteRegistrationByID**
> deleteRegistrationByID(email, id)



Delete a registration for this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The owner registration
    Long id = 56L; // Long | The registration id that needs to be deleted
    try {
      apiInstance.deleteRegistrationByID(email, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteRegistrationByID");
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
 **email** | **String**| The owner registration |
 **id** | **Long**| The registration id that needs to be deleted |

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
**400** | Invalid id supplied |  -  |
**404** | Registration not found |  -  |

<a name="deleteTrailByID"></a>
# **deleteTrailByID**
> deleteTrailByID(id)



Delete the trail with this id

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | trail that needs to be deleted
    try {
      apiInstance.deleteTrailByID(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTrailByID");
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
 **id** | **Long**| trail that needs to be deleted |

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
**400** | Invalid Trail id supplied |  -  |
**404** | Trail not found |  -  |

<a name="deleteUserByID"></a>
# **deleteUserByID**
> deleteUserByID(email)



Delete the user with this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | user that needs to be deleted
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
 **email** | **String**| user that needs to be deleted |

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
**400** | Invalid username supplied |  -  |
**404** | User not found |  -  |

<a name="getRegistrationsByIdUser"></a>
# **getRegistrationsByIdUser**
> List&lt;RegistrationOutput&gt; getRegistrationsByIdUser(email, pageNumber, numberOfRegistrationsPerPage)



Get All registration with this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email with registrations
    Integer pageNumber = 0; // Integer | 
    Integer numberOfRegistrationsPerPage = 30; // Integer | 
    try {
      List<RegistrationOutput> result = apiInstance.getRegistrationsByIdUser(email, pageNumber, numberOfRegistrationsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRegistrationsByIdUser");
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
 **email** | **String**| email with registrations |
 **pageNumber** | **Integer**|  | [optional] [default to 0]
 **numberOfRegistrationsPerPage** | **Integer**|  | [optional] [default to 30]

### Return type

[**List&lt;RegistrationOutput&gt;**](RegistrationOutput.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | read |  -  |
**400** | Invalid id supplied |  -  |
**404** | Registration not found |  -  |

<a name="getTrailByID"></a>
# **getTrailByID**
> TrailOutput getTrailByID(id)



Get the trail by this id

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | The id of the trail
    try {
      TrailOutput result = apiInstance.getTrailByID(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTrailByID");
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
 **id** | **Long**| The id of the trail |

### Return type

[**TrailOutput**](TrailOutput.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid Trail supplied |  -  |
**404** | Trail not found |  -  |

<a name="getTrails"></a>
# **getTrails**
> List&lt;TrailOutput&gt; getTrails(pageNumber, numberOfTrailsPerPage)



Get all trails

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer pageNumber = 0; // Integer | 
    Integer numberOfTrailsPerPage = 30; // Integer | 
    try {
      List<TrailOutput> result = apiInstance.getTrails(pageNumber, numberOfTrailsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTrails");
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
 **numberOfTrailsPerPage** | **Integer**|  | [optional] [default to 30]

### Return type

[**List&lt;TrailOutput&gt;**](TrailOutput.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array with all trails |  -  |

<a name="getUserByID"></a>
# **getUserByID**
> User getUserByID(email)



Get the user with this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | email of the user
    try {
      User result = apiInstance.getUserByID(email);
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

[**User**](User.md)

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

<a name="updateTrailByID"></a>
# **updateTrailByID**
> updateTrailByID(id, trail)



Update the trail with this id

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | id for the trail that need to be updated
    Trail trail = new Trail(); // Trail | Updated Trail object
    try {
      apiInstance.updateTrailByID(id, trail);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateTrailByID");
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
 **id** | **Long**| id for the trail that need to be updated |
 **trail** | [**Trail**](Trail.md)| Updated Trail object |

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
**400** | Invalid trail supplied |  -  |
**404** | Trail not found |  -  |

<a name="updateUserByID"></a>
# **updateUserByID**
> updateUserByID(email, userUpdate)



Update the user with this email

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
    defaultClient.setBasePath("http://localhost:8081/trails");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | user that need to be updated
    UserUpdate userUpdate = new UserUpdate(); // UserUpdate | Updated user object
    try {
      apiInstance.updateUserByID(email, userUpdate);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateUserByID");
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
 **email** | **String**| user that need to be updated |
 **userUpdate** | [**UserUpdate**](UserUpdate.md)| Updated user object |

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
**400** | Invalid user supplied |  -  |
**404** | User not found |  -  |

