@Ammu
Feature: Login functionality

  Scenario: Login with valid credentials
    Given User navigates to login page
    When User enters valid email address "archanannettim18@gmail.com" into email field
    And User enters valid password "arch@12" into password field
    And User clicks on Login button
    Then user should get successfully logged in

  Scenario: Login with invalid credentials
    Given User navigates to login page
    When User enters invalid email address "archanannettim1234@gmail.com" into email field
    And User enters invalid password "arch@12456789" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with valid email and invalid password
    Given User navigates to login page
    When User enters valid email address "archanannettim18@gmail.com" into email field
    And User enters invalid password "arch@123456789" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login with invalid email and valid password
    Given User navigates to login page
    When User enters invalid email address "archanannettim1234@gmail.com" into email field
    And User enters valid password "arch@12" into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials mismatch

  Scenario: Login without providing any credentials
    Given User navigates to login page
    When User dont enter email address into email field
    And User dont enter password into password field
    And User clicks on Login button
    Then User should get a proper warning message about credentials