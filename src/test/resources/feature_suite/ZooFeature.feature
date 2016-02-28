Feature: To test the high level functionality of the zoo website

  Background:
    Given I am on the zoo site

  Scenario: To set the start date
    When I click on "Adoption"
    Then I set the start date to "Today"
    And I close browsers

  Scenario: To populate the contact form
    When I click on "Contact"
    Then I populate contact form
    And I close browsers

  Scenario: To populate the contact form
    When I click on "About"
    And I close browsers

  Scenario: To populate the contact form
    When I click on "Home"
    And I close browsers