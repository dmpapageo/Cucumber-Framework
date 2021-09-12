@ContactUsTest
Feature: Submit data to webdriveruniversity.com using contact us form
	
Background:	
	Given I access webdriveruniversity
	When I click on the contact us button
	
@submitValidForm	
Scenario: Submit valid data via contact us form
	And I enter a valid first name
	| Jon | Bob |
	And I enter a valid last name
	And I enter a valid email address
	And I enter comments
#	| example comment 1 | example comment 2 |
	When I click on the submit button
	Then the information should successfully be submitted via the contact us form
	
#Scenario: Submit non valid data via contact us form
#	And I enter a non valid first name
#	And I enter a non valid last name
#	And I enter a non valid email address
#	And I enter no comments
#	When I click on the submit button
#	Then the information should not be successfully be submitted via the contact us form
#	But the user should also be notified of the problem   