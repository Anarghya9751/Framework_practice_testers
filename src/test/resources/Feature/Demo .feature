Feature: verify the login

  Scenario: valid the login

    Given open the urls
    And Enter the datails
    When click the login page
    Then Navigate the home page
@pooja
    Scenario: open the login page
      Given open  urls
      And Enter the username
      When click the homepage
      Then flipkart page is open