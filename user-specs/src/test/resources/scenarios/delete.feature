Feature: User

  Background:
    Given there is a user servers

  Scenario: delete a user
    Given I have an authenticate users with admin rights
    When I DELETE it to the /users endpoint
    Then I receive again a 200 status code

  #Scenario: delete a user fail
  #  Given I have an authenticate users with admin rights
  #  When I DELETE it to the /users endpoint
  #  Then I receive again a 200 status code