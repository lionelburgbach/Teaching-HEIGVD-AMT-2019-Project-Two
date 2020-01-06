Feature: Get authentication

  Background:
    Given there is a server

  Scenario: get a token with credentials
    When I POST a correct user /authenticate endpoint
    Then I receive an 200 status code