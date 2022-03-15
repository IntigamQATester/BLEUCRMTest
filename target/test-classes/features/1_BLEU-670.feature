
Feature: Filter and search functionality


	Background:
		Given HR User is on the login page
		Then Hr enters the login credentials correctly
		And HR is logged in succesfully
		When User navigates to Message Tag

	##	When HR clicks "filter and search" functionality




	Scenario Outline: User should be able to see default filters as "my activity, work, favorite, announcements, and workflows"
		Given user is able to enter "filter and search" functionality
		When  "<defaultFilters>" are visible on the left side
		Examples:
		|defaultFilters|
		|MY ACTIVITY|
	    |WORK         |
	    |FAVORITE      |
		|ANNOUNCEMENT|
	    |WORKFLOWS    |

		Scenario: User should be able to add and remove field
			Given User clicks "add field" button
			And new fields are displayed with checkboxes
			Then user selects fields
			When fields are added to the page
			Then user should be able to remove fields

		Scenario: User should be able to save filter.
			When user clicks save filter
			And enters filter name on the box
			Then clicks to "save" button
			When new filter is added

		Scenario: User should be able to restore default field,
			When button is clickible and user clicks "restore default field" button
			Then fields are restored on the page