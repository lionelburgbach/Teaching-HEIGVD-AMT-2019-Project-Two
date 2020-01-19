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
  "duration": 388024808,
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
  "duration": 197496629,
  "status": "passed"
});
formatter.match({
  "location": "BadCreationSteps.i_have_a_users_already_in_db_payload()"
});
formatter.result({
  "duration": 123933,
  "status": "passed"
});
formatter.match({
  "location": "BadCreationSteps.i_POST_it_to_the_users_already_in_db_endpoint()"
});
formatter.result({
  "duration": 26394358,
  "status": "passed"
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
  "duration": 1719849,
  "status": "passed"
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
  "duration": 299254,
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
  "duration": 108376411,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_have_a_users_payload()"
});
formatter.result({
  "duration": 47791,
  "status": "passed"
});
formatter.match({
  "location": "CreationSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 133857493,
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
  "duration": 83741,
  "status": "passed"
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
  "duration": 294346,
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
  "duration": 118241683,
  "status": "passed"
});
formatter.match({
  "location": "DeleteSteps.iDELETEItToTheUsersEndpoint()"
});
formatter.result({
  "duration": 39401980,
  "status": "passed"
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
  "duration": 424982,
  "status": "passed"
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
  "duration": 353804,
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
  "duration": 44399,
  "status": "passed"
});
formatter.match({
  "location": "GetSteps.i_POST_it_to_the_users_endpoint()"
});
formatter.result({
  "duration": 121962923,
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
  "duration": 75227,
  "status": "passed"
});
});