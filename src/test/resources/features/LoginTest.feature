Feature: Login

  Scenario: Login successfully
    Given that I access the Automation practice page
    And I click in Sign In Link
    When I login with the email val2@teste.com and password 123456
    Then should I view the page name MY ACCOUNT in the My account page
    And should I view the name Val DAmato in the user logged in