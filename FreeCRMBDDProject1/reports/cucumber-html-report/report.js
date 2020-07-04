$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/campaigns.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Campaign",
  "description": "",
  "id": "free-crm-campaign",
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
  "line": 5,
  "name": "To open the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user enters \"k.meeraanand@gmail.com\" and \"Dhanush123\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "CampaignStepDefinition.to_open_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "duration": 14066883300,
  "status": "passed"
});
formatter.match({
  "location": "CampaignStepDefinition.the_title_of_login_page_is_FreeCRM()"
});
formatter.result({
  "duration": 17379500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "k.meeraanand@gmail.com",
      "offset": 17
    },
    {
      "val": "Dhanush123",
      "offset": 46
    }
  ],
  "location": "CampaignStepDefinition.the_user_enters_and(String,String)"
});
formatter.result({
  "duration": 1323563800,
  "status": "passed"
});
formatter.match({
  "location": "CampaignStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 129032000,
  "status": "passed"
});
formatter.match({
  "location": "CampaignStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 213300,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Navigate to Campaign Page",
  "description": "",
  "id": "free-crm-campaign;navigate-to-campaign-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on Campaigns",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User clicks on New",
  "keyword": "Then "
});
formatter.match({
  "location": "CampaignStepDefinition.user_is_on_homepage1()"
});
formatter.result({
  "duration": 177200,
  "status": "passed"
});
formatter.match({
  "location": "CampaignStepDefinition.user_clicks_on_Campaigns()"
});
formatter.result({
  "duration": 4802859400,
  "status": "passed"
});
formatter.match({
  "location": "CampaignStepDefinition.user_clicks_on_New()"
});
formatter.result({
  "duration": 5738953000,
  "status": "passed"
});
});