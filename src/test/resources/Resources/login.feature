
@smoke
Feature: To validate the functionality of facebook

Background:
Given The user should launch the chrome browser
When The user should type the url
And The user should maximise the window

@sanity
Scenario Outline: Validate with invalid username and invalid password

And The user should type the invalid username and invalid password 
     #2D Map with Header
     |first|last|user|pass|data|storage|
     |vijay|vijay@123|ajith|ajith@123|viki|viki@123
     |siva|siva@123|dhini|dhoni@123|mahee|mahee@123
     |suresh|suresh@123|sneha|sneha@123|sam|sam@123
      raina|raina@123|gayu|gayu@123|ram|ram@123
And The user should click the login button
And The user should get the title of the incorrect credential page
Then The user should navigate to incorrect credential page


Scenario Outline:
Validate with invalid username and valid password

And The user should type the invalid username "<aarthy>" and valid password "<aarthy123>"
And The user should click the login button
And the user should get the current url of the incorrect credential page
Then The user should navigate the incotrrect credential page

Examples:


|aarthy|aarthy123|
|kanish|23456|
|viki|6789|