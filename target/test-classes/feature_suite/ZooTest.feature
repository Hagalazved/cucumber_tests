Feature: To test the high level functionality of the zoo website2

  Background:
    Given I am on the zoo siteweb

  Scenario: Populate the contact forms
    When I am click on "Contact"
    And I populate the entri form
  #  And I enter "Name test" into the name field
  #  And I enter "Address test" into the address field
  #  And I enter "Postcode test" into the postcode field
  #  And I enter "Email test" into the email field
    And I submit the contact form
    Then I am check I am on page configuretion
    And Close browser

