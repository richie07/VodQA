
@login
Feature: Como usuario deseo poder logearme

  Scenario: Logeo exitoso
    Given  Usuario enter "admin"
    And  enter "admin"
    When tap log in
    Then Validation succesfull