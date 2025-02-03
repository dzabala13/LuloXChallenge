Feature: Interacting with employees

  Scenario: Delete an existing employee
    Given User creates a new employee
    And  User retrieve that user
    When User delete that user
    Then User retrieve all the employees
    And User doesn't see the new employee
