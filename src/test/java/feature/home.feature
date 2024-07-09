Feature: Register Page Functionality

  @Reg
  Scenario: Customer Registration
    Given Navigate to Register page
    When Enter UserName "ramya"
    And Enter password "ramyarao@1214"
    And Click On login
    Then User Successfully login

Feature


