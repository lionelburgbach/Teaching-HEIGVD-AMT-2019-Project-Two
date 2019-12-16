Feature: trailer

  Background:
    Given there is a trailer server

  Scenario: create a user
    Given I have a user payload
    When I POST it to the /user endpoint
    Then I receive a 201 status code

  Scenario: delete a user
    Given I have a userId
    When I Delete it to the /user/email endpoint
    #Then I have an error if I get this id