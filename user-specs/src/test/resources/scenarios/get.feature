Feature: Get authentication

  Background:
    Given there is a server

  Scenario: get a token with credentials
    Given A user with correct credentials
    When I POST a correct users /authenticate endpoint
    Then I receive an 200 status code