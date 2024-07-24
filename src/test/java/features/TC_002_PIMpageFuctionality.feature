Feature: orange HRM Application

  Scenario: validate Add Employee in PIM functionality
	When click on pim link and verify user is in pim page'		
	Then click on add button
	Then enter fname  and lname
	And capture employee id and store globally
	Then click on save button