$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creation.feature");
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
  "name": "there is a user server",
  "keyword": "Given "
});
formatter.match({
  "location": "CreationSteps.there_is_a_user_server()"
});
formatter.result({
  "duration": 422155250,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "create a user",
  "description": "",
  "id": "user;create-a-user",
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
  "name": "I POST it to the /user endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive a 201 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "CreationSteps.i_have_a_user_payload()"
});
formatter.result({
  "duration": 225300,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 85937963,
  "status": "passed"
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
  "duration": 1898355,
  "error_message": "java.lang.AssertionError: expected:\u003c201\u003e but was:\u003c500\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat io.avalia.user.api.spec.steps.CreationSteps.i_receive_a_status_code(CreationSteps.java:71)\n\tat ✽.Then I receive a 201 status code(creation.feature:9)\n",
  "status": "failed"
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
  "duration": 395990,
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
  "name": "I POST a correct user /authenticate endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive an 200 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "GetSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 131573856,
  "error_message": "java.lang.ClassCastException: com.google.gson.internal.LinkedTreeMap cannot be cast to io.avalia.user.ApiResponse\n\tat io.avalia.user.api.spec.steps.GetSteps.i_POST_it_to_the_users_endpoint(GetSteps.java:43)\n\tat ✽.When I POST a correct user /authenticate endpoint(get.feature:7)\n",
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