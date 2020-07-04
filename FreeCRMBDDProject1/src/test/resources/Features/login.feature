Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario
Given User is already on Loginpage
When title of login page is Free CRM
When user enters "<username>" and "<password>"	
Then user clicks on loginbutton
Then user is on homepage

Examples:
|username|password|
|k.meeraanand@gmail.com|Dhanush123|
