Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user provides login credentials username and password
		| username | password|
		| crmseltest | test@123 |
Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
		|title       | amount | probability | commission |
		| test deal1 | 1000.12 | 50 | 10 |
		| test deal2 | 2000.13 | 60 | 20 |
		| test deal3 | 3000.145 | 70 | 30 |

Then Close the browser