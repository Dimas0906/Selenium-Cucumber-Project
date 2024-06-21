@login
Feature: Login

  @valid-scenario
  Scenario: Login with valid credentials
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the home page

  @invalid-scenario
  Scenario: Login without fill in password
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in ""
    When User click on the login button
    Then User able to see error message "Epic sadface: Password is required"

  @invalid-scenario
  Scenario: Login without fill in username
    Given User on the login page
    And User input username and key in ""
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User able to see error message "Epic sadface: Username is required"

  @invalid-scenario
  Scenario: Login with empty credentials
    Given User on the login page
    When User click on the login button
    Then User able to see error message "Epic sadface: Username is required"

  @invalid-scenario
  Scenario: Login with invalid credentials
    Given User on the login page
    And User input username and key in "locked_out_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User able to see error message "Epic sadface: Sorry, this user has been locked out."

  @invalid-scenario
  Scenario: Login with problem user account
    Given User on the login page
    And User input username and key in "test_user"
    And User input password and key in "test_password"
    When User click on the login button
    Then User able to see error message "Epic sadface: Username and password do not match any user in this service"

