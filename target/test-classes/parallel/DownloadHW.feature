Feature: Download All Submissions (with Status)

  Background:
    Given user is on moodle login page
    When user enters a valid username as username
    And user enters a valid password as password
    And user clicks on login button
    Then user should enter the homepage

  @Positive @e2e
  Scenario: User downloads all submissions
    When user clicks on csd-1240-e
    When user clicks on HW 4 - E
    When user clicks on View all submissions
    Then user downloads all homework submissions
    And user exits the application

