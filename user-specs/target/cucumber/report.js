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
  "duration": 375243398,
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
  "duration": 148275,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 81621254,
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
  "duration": 1610660,
  "status": "passed"
});
formatter.uri("get.feature");
formatter.feature({
  "line": 1,
  "name": "Get user",
  "description": "",
  "id": "get-user",
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
  "duration": 357072,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "read user",
  "description": "",
  "id": "get-user;read-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I GET it to the /user endpoint",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive an 200 status code",
  "keyword": "Then "
});
formatter.match({
  "location": "GetSteps.i_GET_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 15165026,
  "status": "passed"
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
  "duration": 95643,
  "status": "passed"
});
});