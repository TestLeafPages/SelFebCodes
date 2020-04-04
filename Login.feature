Feature: Login into Leaftaps application [TET-1234]

Scenario: [TC001] Positive flow for Login
Given User opens the chrome browser
And User load the leaftaps Prod URL
And User maximise the browser
And User Set the default implicit timeout
And User enters the username as DemoSalesManager in the loginpage
And User enters the passowrd as crmsfa in the loginpage
When User click the Login button in the Loginpage
Then User should able to see the homepage

Scenario: [TC002] Negative flow for Login
Given User opens the chrome browser
And User load the leaftaps Prod URL
And User maximise the browser
And User Set the default implicit timeout
And User enters the username as DemoSalesManager1 in the loginpage
And User enters the passowrd as crmsfa in the loginpage
When User click the Login button in the Loginpage
But User should be in the Loginpage itself
And User should get this error message