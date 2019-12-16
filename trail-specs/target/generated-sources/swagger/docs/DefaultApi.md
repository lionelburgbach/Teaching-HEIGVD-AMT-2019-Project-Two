# DefaultApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allTrails**](DefaultApi.md#allTrails) | **GET** /trail | 
[**createRegistration**](DefaultApi.md#createRegistration) | **POST** /registration | 
[**createTrail**](DefaultApi.md#createTrail) | **POST** /trail | 
[**createUser**](DefaultApi.md#createUser) | **POST** /user | 
[**deleteRegistration**](DefaultApi.md#deleteRegistration) | **DELETE** /registration/{id} | 
[**deleteTrail**](DefaultApi.md#deleteTrail) | **DELETE** /trail/{id} | 
[**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /user/{email} | 
[**getRegistrationByID**](DefaultApi.md#getRegistrationByID) | **GET** /registration/{id} | 
[**getTrailByID**](DefaultApi.md#getTrailByID) | **GET** /trail/{id} | 
[**getUserByID**](DefaultApi.md#getUserByID) | **GET** /user/{email} | 
[**updateTrail**](DefaultApi.md#updateTrail) | **PUT** /trail/{id} | 
[**updateUser**](DefaultApi.md#updateUser) | **PUT** /user/{email} | 


<a name="allTrails"></a>
# **allTrails**
> List&lt;Trail&gt; allTrails()



all trails

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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Trail> result = apiInstance.allTrails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#allTrails");
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

[**List&lt;Trail&gt;**](Trail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | created |  -  |

<a name="createRegistration"></a>
# **createRegistration**
> Object createRegistration(user)



create a registration

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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Registration user = new Registration(); // Registration | 
    try {
      Object result = apiInstance.createRegistration(user);
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
 **user** | [**Registration**](Registration.md)|  |

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

<a name="createTrail"></a>
# **createTrail**
> Object createTrail(trail)



create a trail

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
    defaultClient.setBasePath("http://localhost:8081/api");

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
    defaultClient.setBasePath("http://localhost:8081/api");

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | created |  -  |

<a name="deleteRegistration"></a>
# **deleteRegistration**
> deleteRegistration(id)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | The name that needs to be deleted
    try {
      apiInstance.deleteRegistration(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteRegistration");
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
 **id** | **Long**| The name that needs to be deleted |

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
**400** | Invalid id supplied |  -  |
**404** | Registration not found |  -  |

<a name="deleteTrail"></a>
# **deleteTrail**
> deleteTrail(id)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | The name that needs to be deleted
    try {
      apiInstance.deleteTrail(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteTrail");
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
 **id** | **Long**| The name that needs to be deleted |

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
**400** | Invalid Trail id supplied |  -  |
**404** | Trail not found |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(email)



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
    defaultClient.setBasePath("http://localhost:8081/api");

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
**404** | User not found |  -  |

<a name="getRegistrationByID"></a>
# **getRegistrationByID**
> Registration getRegistrationByID(id)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | The name that needs to be fetched. Use user1 for testing. 
    try {
      Registration result = apiInstance.getRegistrationByID(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getRegistrationByID");
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
 **id** | **Long**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**Registration**](Registration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid id supplied |  -  |
**404** | Registration not found |  -  |

<a name="getTrailByID"></a>
# **getTrailByID**
> Trail getTrailByID(id)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | The name that needs to be fetched. Use user1 for testing. 
    try {
      Trail result = apiInstance.getTrailByID(id);
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
 **id** | **Long**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**Trail**](Trail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | Invalid Trail supplied |  -  |
**404** | Trail not found |  -  |

<a name="getUserByID"></a>
# **getUserByID**
> User getUserByID(email)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String email = "email_example"; // String | The name that needs to be fetched. Use user1 for testing. 
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
 **email** | **String**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**User**](User.md)

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
**404** | User not found |  -  |

<a name="updateTrail"></a>
# **updateTrail**
> updateTrail(id, body)



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
    defaultClient.setBasePath("http://localhost:8081/api");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long id = 56L; // Long | name that need to be updated
    Trail body = new Trail(); // Trail | Updated Trail object
    try {
      apiInstance.updateTrail(id, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateTrail");
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
 **id** | **Long**| name that need to be updated |
 **body** | [**Trail**](Trail.md)| Updated Trail object |

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
**400** | Invalid trail supplied |  -  |
**404** | Trail not found |  -  |

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
    defaultClient.setBasePath("http://localhost:8081/api");

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
**404** | User not found |  -  |

