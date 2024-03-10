@smoke
Feature: F01_Login_and_add_user | Verify that the number of records retrieve the correct number
  Scenario: Verify that the number of records increased by 1 when add new user
    Given user navigate to Login page
    When Enter "Admin" as username
    And Enter "admin123" as password
    And Click on the login button
    Then Click on Admin tab on the left side menu
    And Get the number of records found
    And Click on add button
    And Fill the required data Emp"Sarah"Username"Elsayed"Pass"Qw123456"
    Then Verify that the number of records increased by 1
