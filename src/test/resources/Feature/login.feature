Feature: verifying the flipkart

  Scenario: checking the home page
    Given open the urls
    And Enter the details
    Then click the login


Scenario:open the url1
  Given open the urls1
  And Enter the details1
  When click the login button
  Then flipkart page is open

  Scenario: open the uel2
    Given open the urls2
    And Enter  the details2
    When click the login button1
    Then flipkart page is login

    Scenario Outline: valid facebook functionality
      Given open the browser
      And valid user as username And pass as password
      When  hit the button
      Examples:
        |  |


