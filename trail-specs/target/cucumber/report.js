$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addWithNoToken.feature");
formatter.feature({
  "line": 1,
  "name": "trailer",
  "description": "",
  "id": "trailer",
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
  "name": "there is an trailer server",
  "keyword": "Given "
});
formatter.match({
  "location": "AddWithNoToken.there_is_an_user_server()"
});
formatter.result({
  "duration": 398735999,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "creat a user with no token",
  "description": "",
  "id": "trailer;creat-a-user-with-no-token",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a new user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /users endpoint again",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a new 400 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "AddWithNoToken.iHaveANewUserPayload()"
});
formatter.result({
  "duration": 140293,
  "status": "passed"
});
formatter.match({
  "location": "AddWithNoToken.iPOSTItToTheUsersEndpointAgain()"
});
formatter.result({
  "duration": 81320812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 16
    }
  ],
  "location": "AddWithNoToken.i_receive_a_new_status_code(int)"
});
formatter.result({
  "duration": 1545797,
  "status": "passed"
});
formatter.uri("creationAndDelete.feature");
formatter.feature({
  "line": 1,
  "name": "trailer",
  "description": "",
  "id": "trailer",
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
  "name": "there is a trailer server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationAndDeleteSteps.there_is_a_user_server()"
});
formatter.result({
  "duration": 341632,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a user",
  "description": "",
  "id": "trailer;create-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a user payload",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I POST it to the /users endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_have_a_user_payload()"
});
formatter.result({
  "duration": 43035,
  "status": "passed"
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_POST_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 2121840,
  "error_message": "java.lang.NullPointerException\n\tat io.avalia.user.api.spec.steps.CreationAndDeleteSteps.i_POST_it_to_the_user_endpoint(CreationAndDeleteSteps.java:58)\n\tat ✽.When I POST it to the /users endpoint(creationAndDelete.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 12
    }
  ],
  "location": "CreationAndDeleteSteps.i_receive_a_status_code(int)"
});
formatter.result({
  "status": "skipped"
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
  "name": "there is a trailer server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationAndDeleteSteps.there_is_a_user_server()"
});
formatter.result({
  "duration": 324607,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "delete a user",
  "description": "",
  "id": "trailer;delete-a-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have a userId",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I Delete it to the /users/email endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_have_a_user_id()"
});
formatter.result({
  "duration": 32531,
  "status": "passed"
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_Delete_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 8867808,
  "error_message": "io.avalia.user.ApiException: Bad Request\n\tat io.avalia.user.ApiClient.handleResponse(ApiClient.java:979)\n\tat io.avalia.user.ApiClient.execute(ApiClient.java:895)\n\tat io.avalia.user.ApiClient.execute(ApiClient.java:878)\n\tat io.avalia.user.api.DefaultApi.deleteUserByIDWithHttpInfo(DefaultApi.java:736)\n\tat io.avalia.user.api.DefaultApi.deleteUserByID(DefaultApi.java:717)\n\tat io.avalia.user.api.spec.steps.CreationAndDeleteSteps.i_Delete_it_to_the_user_endpoint(CreationAndDeleteSteps.java:89)\n\tat ✽.When I Delete it to the /users/email endpoint(creationAndDelete.feature:13)\n",
  "status": "failed"
});
});