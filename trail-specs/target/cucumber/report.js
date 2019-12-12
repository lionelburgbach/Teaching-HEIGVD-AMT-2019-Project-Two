$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("creationAndDelete.feature");
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
  "duration": 400874071,
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
  "name": "I POST it to the /user endpoint",
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
  "duration": 207774,
  "status": "passed"
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_POST_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 90920470,
  "status": "passed"
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
  "duration": 1586051,
  "status": "passed"
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
  "duration": 339089,
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
  "name": "I Delete it to the /user/email endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_have_a_user_id()"
});
formatter.result({
  "duration": 26959,
  "status": "passed"
});
formatter.match({
  "location": "CreationAndDeleteSteps.i_Delete_it_to_the_user_endpoint()"
});
formatter.result({
  "duration": 20115644,
  "status": "passed"
});
});