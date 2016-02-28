Feature: Test Page Headings

 # Scenario: Test Cars Page Heading
 #  Given I am on OLX website
 #   When I click on Cars inCar
 #   Then I check I am on Cars
 #   And I close the browser

 # Scenario: Test Job Page Heading
 #   Given I am on OLX website
 #   When I click on Job inJob
 #   Then I check I am on Job
 #   And I close the browser

 # Scenario: Test Cars Page Heading
 #   Given I am on OLX website
 #   When I click on Animals inAnimals
 #   Then I check I am on Animals
 #   And I close the browser

  Scenario Outline: Test Cars Page Heading
    Given I am on OLX website
    When I click on <Link> <Link2>
    Then I check I am on <Title>
    And I close the browser
    Examples:
      |Link                                                                  |Link2                                      |Title               |
      |.//*[@id='searchmain-container']/div/div/div[1]/div[3]/div/a/span[1]  |.//*[@id='bottom3']/ul/li[1]/a/span/span   |Купить авто:        |
      |.//*[@id='searchmain-container']/div/div/div[1]/div[4]/div/a/span[1]  |.//*[@id='bottom6']/ul/li[1]/a/span/span   |Работа в торговле   |
      |.//*[@id='searchmain-container']//div[6]/div[1]//span[1]              |.//*[@id='bottom35']/ul/li[1]/a/span/span  |Собаки:             |

