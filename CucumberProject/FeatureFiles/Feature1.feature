Feature: Test login feature

  Scenario: Test login feature with valid credentials
    Given Application is up and running
    When I enter valid credentials
    Then I should be logged in successfully
