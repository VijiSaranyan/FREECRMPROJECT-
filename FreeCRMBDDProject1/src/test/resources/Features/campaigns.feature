Feature: Free CRM Campaign 

Background:

Given To open the browser and navigate to the URL
When the title of login page is FreeCRM
When the user enters "k.meeraanand@gmail.com" and "Dhanush123"
Then user clicks on login button
Then user is on homepage

Scenario: Navigate to Campaign Page
Given User is on homepage
When User clicks on Campaigns
Then User clicks on New
