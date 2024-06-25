@Cart
Feature: Cart

  Scenario: User try to remove one of the product from chart
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    And User click on the add to cart button on product "Sauce Labs Bike Light"
    Then User will see the chart icon with "2"
    When User click on cart icon
    Then User will be directed to cart page
    Then User will see the product "Sauce Labs Bike Light" in the cart
    And User will see the product "Sauce Labs Backpack" in the cart
    When User click on Remove on the product "Sauce Labs Bike Light"
    Then User will see the chart icon with "1"


  Scenario: User click on Continue Shoping from Cart page
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    And User click on the add to cart button on product "Sauce Labs Bike Light"
    Then User will see the chart icon with "2"
    When User click on cart icon
    Then User will be directed to cart page
    When User click on Continue Shopping
    Then User should be redirected to the product page


  Scenario: User click on Checkout from Cart page after adding one item
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"
    When User click on cart icon
    Then User will be directed to cart page
    When User click on Checkout
    Then User will be directed to checkout step "one"

  Scenario: User click on Continue Shoping from Cart page after adding one item
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"
    When User click on cart icon
    Then User will be directed to cart page
    When User click on Continue Shopping
    Then User should be redirected to the product page

  Scenario: User input information on checkout step one and click Continue
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"
    When User click on cart icon
    Then User will be directed to cart page
    When User click on Checkout
    Then User will be directed to checkout step "one"
    When User input first name "John"
    And User input last name "Doe"
    And User input postal code "12345"
    When User click on "continue" button on checkout step one
    Then User will be directed to checkout step "two"

  Scenario: User try to match the total price on checkout step two
    Given User on the login page
    And User input username and key in "standard_user"
    And User input password and key in "secret_sauce"
    When User click on the login button
    Then User should be redirected to the product page
    When User click on the add to cart button on product "Sauce Labs Backpack"
    Then User will see the chart icon with "1"
    When User click on cart icon
    Then User will be directed to cart page
    When User click on Checkout
    Then User will be directed to checkout step "one"
    When User input first name "John"
    And User input last name "Doe"
    And User input postal code "12345"
    When User click on "continue" button on checkout step one
    Then User will be directed to checkout step "two"
    When User click on "finish" on step two
    Then User will be directed to checkout step "complete"
    And User can see Thank You message to confirm the order
