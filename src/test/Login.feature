Feature:  valid the Register
@Login


  Scenario Outline: Verify the Fdma working
    Given open the Browser
    And navigate to the url
    And click the login button
    And click the user button
    And click the signup link
    When Enter the username as <username>
    When Enter the Email as <Email>
    When Enter the phoneno as <phno1>
    When Enter the password <pass>
    When Enter the confirmpassword <Confirm>
    Then click the register button1

    Examples:
      |username| Email| phon1| pass| Confirm|
      |siva ram| siva@gmail.com| 7654321234| Satya@2020| Satya@2020|







