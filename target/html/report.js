$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature_suite/ZooTest.feature");
formatter.feature({
  "line": 1,
  "name": "To test the high level functionality of the zoo website2",
  "description": "",
  "id": "to-test-the-high-level-functionality-of-the-zoo-website2",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the zoo siteweb",
  "keyword": "Given "
});
formatter.match({
  "location": "ZooTest.i_am_on_the_zoo_siteweb()"
});
formatter.result({
  "duration": 25085039081,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Populate the contact forms",
  "description": "",
  "id": "to-test-the-high-level-functionality-of-the-zoo-website2;populate-the-contact-forms",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am click on \"Contact\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I populate the entri form",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#  And I enter \"Name test\" into the name field"
    },
    {
      "line": 10,
      "value": "#  And I enter \"Address test\" into the address field"
    },
    {
      "line": 11,
      "value": "#  And I enter \"Postcode test\" into the postcode field"
    },
    {
      "line": 12,
      "value": "#  And I enter \"Email test\" into the email field"
    }
  ],
  "line": 13,
  "name": "I submit the contact form",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I am check I am on page configuretion",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Contact",
      "offset": 15
    }
  ],
  "location": "ZooTest.i_am_click_on(String)"
});
formatter.result({
  "duration": 4725421880,
  "status": "passed"
});
formatter.match({
  "location": "ZooTest.i_populate_the_entri_form()"
});
formatter.result({
  "duration": 7723795139,
  "status": "passed"
});
formatter.match({
  "location": "ZooTest.i_submit_the_contact_form()"
});
formatter.result({
  "duration": 717182778,
  "status": "passed"
});
formatter.match({
  "location": "ZooTest.i_am_check_I_am_on_page_configuretion()"
});
formatter.result({
  "duration": 136937907,
  "status": "passed"
});
formatter.match({
  "location": "ZooTest.close_browser()"
});
formatter.result({
  "duration": 3026769401,
  "status": "passed"
});
});