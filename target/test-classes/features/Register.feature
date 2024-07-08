@Lucky
Feature: Registration functionality

  Scenario: User creates an account only with all fields
    Given User navigates to Register Account page
    When User enters the details into below fields
    |petName  |Ceaser                       |
    |breed |Pomernian                 |
    |species    |pom|
    |age|1             |
    |weight            |    2              |
    |color                  |       white            |
    |height                 |      15                  |
    |disease                |            none              |
    |fullName               |  Archana N                   |
    |mobileNumber           |  9876542456                  |
    |alternativeMobileNumber   |     8654224575         |
    |emailAddress              |archanannettim18@gmail.com   |
    |password                   |arch@12                      |
    |confirmPassword            |arch@12                      |
    |city                       |hyderabad                    |
    And User clicks on Register button
    Then User account should get created successfully

  Scenario: User creates a duplicate account
    Given User navigates to Register Account page
    When User enters the details into below fields
      |petName  |Ceaser                       |
      |breed |Pomernian                 |
      |species    |pom|
      |age|1             |
      |weight            |    2              |
      |color                  |       white            |
      |height                 |      15                  |
      |disease                |            none              |
      |fullName               |  Archana N                   |
      |mobileNumber           |  9876542456                  |
      |alternativeMobileNumber   |     8654224575         |
      |emailAddress              |archanannettim18@gmail.com   |
      |password                   |arch@12                      |
      |confirmPassword            |arch@12                      |
      |city                       |hyderabad                    |
    And User clicks on Register button
    Then User should get a proper warning about duplicate email

  Scenario: User creates an account without filling any details
    Given User navigates to Register Account page
    When User dont enter any details into fields
    And User clicks on Register button
    Then User should get a proper warning messages