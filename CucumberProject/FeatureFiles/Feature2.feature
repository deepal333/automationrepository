Feature: Test login Feature

  Scenario Outline: Test login feature eith multiple data
    Given Application is up and running
    When I enter <username> and<password> on login page
    Then I should be logged in successfully

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
