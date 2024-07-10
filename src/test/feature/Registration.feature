Feature: Registration functionality
  Scenario: User creates an account only with mandatory fields
    Given user navigates to register account page
    When User enters the below fields
    |firstName|Arun|
    |lastName |motoori|
    |email    |amotoori24122022@gmail.com|
    |password |12345                     |
    And user selects privacy policy
    And user clicks on continue button
    Then user account should get created successfully


  Scenario: User creates an account with all fields
    Given user navigates to register account page
    When User enters the below fields
      |firstName|Arun|
      |lastName |motoori|
      |email    |amotoori24122022@gmail.com|
      |telephone|12345                     |
      |password |12345                     |
    And user selects yes for Newsletter
    And user selects privacy policy
    And user clicks on continue button
    Then user account should get created successfully

  Scenario: User creates duplicate account
    Given user navigates to register account page
    When User enters the below fields
      |firstName|Arun|
      |lastName |motoori|
      |email    |amotoori24122022@gmail.com|
      |password |123456789                     |
    And user selects privacy policy
    And user clicks on continue button
    Then user account should get proper error