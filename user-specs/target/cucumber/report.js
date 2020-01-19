$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("badcreation.feature");
formatter.feature({
  "line": 1,
  "name": "User",
  "description": "",
  "id": "user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_users_server()"
});
formatter.result({
  "duration": 422563953,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a user who already exist",
  "description": "",
  "id": "user;create-a-user-who-already-exist",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have an authenticate userss",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have a user already in payload",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I POST the already in db user to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I receive an other 400 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "BadCreationSteps.iHaveAnAuthenticateUserss()"
});
formatter.result({
  "duration": 10737089,
  "error_message": "java.lang.IllegalArgumentException: Expected URL scheme \u0027http\u0027 or \u0027https\u0027 but no colon was found\n\tat okhttp3.HttpUrl$Builder.parse$okhttp(HttpUrl.kt:1257)\n\tat okhttp3.HttpUrl$Companion.get(HttpUrl.kt:1630)\n\tat okhttp3.Request$Builder.url(Request.kt:184)\n\tat io.avalia.users.ApiClient.buildRequest(ApiClient.java:1025)\n\tat io.avalia.users.ApiClient.buildCall(ApiClient.java:1000)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenCall(DefaultApi.java:99)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenValidateBeforeCall(DefaultApi.java:111)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenWithHttpInfo(DefaultApi.java:150)\n\tat io.avalia.user.api.spec.steps.BadCreationSteps.iHaveAnAuthenticateUserss(BadCreationSteps.java:46)\n\tat ✽.Given I have an authenticate userss(badcreation.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "BadCreationSteps.i_have_a_users_already_in_db_payload()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BadCreationSteps.i_POST_it_to_the_users_already_in_db_endpoint()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 19
    }
  ],
  "location": "BadCreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("creation.feature");
formatter.feature({
  "line": 1,
  "name": "User",
  "description": "",
  "id": "user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a users server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_users_server()"
});
formatter.result({
  "duration": 288885,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a users",
  "description": "",
  "id": "user;create-a-users",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have an authenticate users",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I have a user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I POST it to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreationSteps.iHaveAnAuthenticateUsers()"
});
formatter.result({
  "duration": 302090,
  "error_message": "java.lang.IllegalArgumentException: Expected URL scheme \u0027http\u0027 or \u0027https\u0027 but no colon was found\n\tat okhttp3.HttpUrl$Builder.parse$okhttp(HttpUrl.kt:1257)\n\tat okhttp3.HttpUrl$Companion.get(HttpUrl.kt:1630)\n\tat okhttp3.Request$Builder.url(Request.kt:184)\n\tat io.avalia.users.ApiClient.buildRequest(ApiClient.java:1025)\n\tat io.avalia.users.ApiClient.buildCall(ApiClient.java:1000)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenCall(DefaultApi.java:99)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenValidateBeforeCall(DefaultApi.java:111)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenWithHttpInfo(DefaultApi.java:150)\n\tat io.avalia.user.api.spec.steps.CreationSteps.iHaveAnAuthenticateUsers(CreationSteps.java:52)\n\tat ✽.Given I have an authenticate users(creation.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreationSteps.i_have_a_users_payload()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "CreationSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("delete.feature");
formatter.feature({
  "line": 1,
  "name": "User",
  "description": "",
  "id": "user",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a user servers",
  "keyword": "Given "
});
formatter.match({
  "location": "DeleteSteps.there_is_a_users_server()"
});
formatter.result({
  "duration": 287801,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "delete a user",
  "description": "",
  "id": "user;delete-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have an authenticate users with admin rights",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I DELETE it to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive again a 200 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteSteps.iHaveAnAuthenticateUsersWithAdminRights()"
});
formatter.result({
  "duration": 239492,
  "error_message": "java.lang.IllegalArgumentException: Expected URL scheme \u0027http\u0027 or \u0027https\u0027 but no colon was found\n\tat okhttp3.HttpUrl$Builder.parse$okhttp(HttpUrl.kt:1257)\n\tat okhttp3.HttpUrl$Companion.get(HttpUrl.kt:1630)\n\tat okhttp3.Request$Builder.url(Request.kt:184)\n\tat io.avalia.users.ApiClient.buildRequest(ApiClient.java:1025)\n\tat io.avalia.users.ApiClient.buildCall(ApiClient.java:1000)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenCall(DefaultApi.java:99)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenValidateBeforeCall(DefaultApi.java:111)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenWithHttpInfo(DefaultApi.java:150)\n\tat io.avalia.user.api.spec.steps.DeleteSteps.iHaveAnAuthenticateUsersWithAdminRights(DeleteSteps.java:47)\n\tat ✽.Given I have an authenticate users with admin rights(delete.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "DeleteSteps.iDELETEItToTheUsersEndpoint()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 18
    }
  ],
  "location": "DeleteSteps.iReceiveAgainAStatusCode(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("get.feature");
formatter.feature({
  "line": 1,
  "name": "Get authentication",
  "description": "",
  "id": "get-authentication",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "there is a server",
  "keyword": "Given "
});
formatter.match({
  "location": "GetSteps.there_is_a_server()"
});
formatter.result({
  "duration": 285742,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "get a token with credentials",
  "description": "",
  "id": "get-authentication;get-a-token-with-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "A user with correct credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST a correct users /authenticate endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive an 200 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "GetSteps.aUserWithCorrectCredentials()"
});
formatter.result({
  "duration": 37921,
  "status": "passed"
});
formatter.match({
  "location": "GetSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 246208,
  "error_message": "java.lang.IllegalArgumentException: Expected URL scheme \u0027http\u0027 or \u0027https\u0027 but no colon was found\n\tat okhttp3.HttpUrl$Builder.parse$okhttp(HttpUrl.kt:1257)\n\tat okhttp3.HttpUrl$Companion.get(HttpUrl.kt:1630)\n\tat okhttp3.Request$Builder.url(Request.kt:184)\n\tat io.avalia.users.ApiClient.buildRequest(ApiClient.java:1025)\n\tat io.avalia.users.ApiClient.buildCall(ApiClient.java:1000)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenCall(DefaultApi.java:99)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenValidateBeforeCall(DefaultApi.java:111)\n\tat io.avalia.users.api.DefaultApi.createAuthenticationTokenWithHttpInfo(DefaultApi.java:150)\n\tat io.avalia.user.api.spec.steps.GetSteps.i_POST_it_to_the_users_endpoint(GetSteps.java:52)\n\tat ✽.When I POST a correct users /authenticate endpoint(get.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 13
    }
  ],
  "location": "GetSteps.i_receive_a_GET_status_code(int)"
});
formatter.result({
  "status": "skipped"
});
});