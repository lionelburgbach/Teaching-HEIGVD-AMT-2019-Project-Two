Feature: User

  Background:
    Given there is a users server

    Scenario: create a user who already exist
      Given I have an authenticate user
      Given I have a user already in payload
      When I POST the already in db user to the /users endpoint
      Then I receive an other 400 status code