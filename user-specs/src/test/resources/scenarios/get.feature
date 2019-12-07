Feature: Get user

  Background:
    Given there is a server

  Scenario: read user
    When I GET it to the /user endpoint
    Then I receive an 200 status code