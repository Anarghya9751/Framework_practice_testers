@Login
Feature: Login Functionality
  Scenario: Verify the login with valid credentials
    Given user has navigated to login page
    When user has entered valid "pravalika2@gmail.com" email
    And user has entered valid  "9010879221" password
    And user clicks on login button
    Then user should get successfully logged in popup

  Scenario: Verify the login with Invalid credentials
    Given user has navigated to login page
    When user has entered Invalid  "pravalika@gmail.com" Iemail
    And user has entered valid  "9010879221" Ipassword
    And user clicks on login button


  Scenario: Verify the login with valid username and Invalid Password
    Given user has navigated to login page
    When user has entered valid "pravalika2@gmail.com" email
    And user has entered Invalid  "9010879221" password
    And user clicks on login button


  Scenario: Verify the login with Invalid username and Invalid Password
    Given user has navigated to login page
    When user has entered Invalid  "pravalika@gmail.com" email
    And user has entered Invalid  "9010879221" password
    And user clicks on login button

