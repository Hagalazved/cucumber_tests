Feature: To test contact form works when are no errors

  Scenario: Check form is validated when there are no errors
    Given I am on OLX wesite
    When I am click on contact link
    And populate the contact form
    Then I should on contact confirmation page
