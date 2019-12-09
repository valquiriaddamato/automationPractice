Feature: Login

  Scenario: Login successfully
    Given that I access the 'Automation practice' page
    And I have registration
    When I click on 'Sign In'
    And fill in the email form 'Already registered'
    And fill in the password
    And I click the 'Sign In' button
    Then the system must login successfully
    And should I view the 'My account' page