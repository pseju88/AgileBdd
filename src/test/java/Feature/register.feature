Feature: Registration
  @regression1
  Scenario: I should able to register successfully with valid credentials

    Given I am on register page
    When I enter valid credentials
    And I should click on Register Button
    Then I should able to register successfully




