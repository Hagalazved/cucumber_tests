Feature: Check the title page

  Scenario: Check page title for cars page
    Given I am on the OLX website
    When I navigate to ".//*[@id='searchmain-container']/div/div/div[1]/div[3]/div/a/span[1]" ".//*[@id='bottom3']/ul/li[1]/a/span/span"
    Then I check page title is "Автобазар Украины"
    And I close browser

  Scenario: Check page title for job page
    Given I am on the OLX website
    When I navigate to ".//*[@id='searchmain-container']/div/div/div[1]/div[4]/div/a/span[1]" ".//*[@id='bottom6']/ul/li[1]/a/span/span"
    Then I check page title is "Работа в торговле"
    And I close browser

  Scenario: Check page title for animals page
    Given I am on the OLX website
    When I navigate to ".//*[@id='searchmain-container']//div[6]/div[1]//span[1]" ".//*[@id='bottom35']/ul/li[1]/a/span/span"
    Then I check page title is "Собаки:"
    And I close browser
