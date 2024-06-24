@Product-Store
Feature: Product Store

  @valid-scenario
  Scenario: User try to add one product to chart
    Given User try to login to the page
    And User input valid username and key in "standard_user"
    And User input valid password and key in "secret_sauce"
    When User login with valid password
    Then User should be redirected to the List Product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"

  @valid-scenario @delete-product
  Scenario: User try to add more than one product to chart
    Given User try to login to the page
    And User input valid username and key in "standard_user"
    And User input valid password and key in "secret_sauce"
    When User login with valid password
    Then User should be redirected to the List Product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    And User click on the add to cart button on product "Sauce Labs Bike Light"
    Then User will see the chart icon with "2"
    When User try to remove the product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"


