Feature: User

  Background:
    Given there is a user server

  Scenario: create a user
    Given I have a user payload
    When I POST it to the /user endpoint
    Then I receive a 201 status code