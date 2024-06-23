@Product-Store
Feature: Product Store

  @test
  Scenario: User try to add one product to chart
    Given User try to login to the page
    And User input valid username and key in "standard_user"
    And User input valid password and key in "secret_sauce"
    When User click on the login
    Then User should be redirected to the List Product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
# Then User will see the chart icon with "1"


