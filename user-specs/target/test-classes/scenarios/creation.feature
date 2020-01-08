Feature: User

  Background:
    Given there is a users server

  Scenario: create a users
    Given I have an authenticate users
    Then I receive an 200 status code
    Given I have a user payload
    When I POST it to the /users endpoint
    Then I receive a 201 status code