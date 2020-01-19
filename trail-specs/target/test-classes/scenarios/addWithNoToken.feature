Feature: trailer

  Background:
    Given there is an trailer server

  Scenario: creat a user with no token
    Given I have a new user payload
    When I POST it to the /users endpoint again
    Then I receive a new 400 status code