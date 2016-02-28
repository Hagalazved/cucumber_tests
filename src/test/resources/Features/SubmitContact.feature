Feature: Submit a valid contact form

  Scenario: Submit form using valid data
    Given I am on the OLX site
    When I navigate to contact
    And I submit form with submit data
    |Fields |Value                          |
    |Message|Hello World! Привет Лунатикам! |
    |adId   |555444                         |
    |eMail  |dudu@mail.ru                   |
    Then I check that the form has been submitted