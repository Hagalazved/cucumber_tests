Feature: Adopt an contact

  @web
  Scenario: Send email
    Given I am on OLX website now
    When I am navigate to contact
    And I am choose message theme
    And populate this contact form
    Then There should on contact confirmation page