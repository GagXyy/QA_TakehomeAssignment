Feature: OrangeHRM Login

  Scenario: Verify login with valid username and password
    Given User launches OrangeHRM application
    When User logs in with valid username and password
    Then Dashboard page should be displayed

  Scenario: Verify user can log out successfully
    Given User launches OrangeHRM application
    When User logs in with valid username and password
    And User logs out from the application
    Then Login page should be displayed

  Scenario: Verify login with invalid username
    Given User launches OrangeHRM application
    When User logs in with invalid username and valid password
    Then Invalid credentials message should be displayed