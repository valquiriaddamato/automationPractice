Feature: Register customer

  Scenario: Successfully Register Customer
    Given that I access the 'Automation practice' page
    When I click on 'Sign In'
    And fill in the email form 'Create an account'
    And I click the 'Create an account' button
    And fill in the required data of my user
    And I click the 'Register' button
    Then the system must successfully register
    And should I view the 'My account' page
