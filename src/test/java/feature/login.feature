Feature: Verify the login page

  Scenario: Verify the login vth valid data
    Given Open the Browser and enter the url
    When enter valid user name and password
    Then click on login button

    Scenario: verify the login with invalid data
      Given Open chrome and enter url
      Then User give invalid user name and password
      And Click on submit button

