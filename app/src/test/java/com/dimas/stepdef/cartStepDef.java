package com.dimas.stepdef;

import com.dimas.BaseTest;
import com.dimas.page.cartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cartStepDef extends BaseTest {
  cartPage cartPage;

  @Then("User will be directed to cart page")
  public void userIsOnCartPage() {
    cartPage = new cartPage(driver);
    cartPage.isUserOnCartPage();
  }

  @Then("User will see the product {string} in the cart")
  public void userWillSeeProductInCart(String productName) {
    cartPage.checkItemInCart(productName);
  }

  @When("User click on Remove on the product {string}")
  public void userRemoveProductFromCart(String productName) {
    cartPage.removeItemFromCart(productName);
  }

  @When("User click on Continue Shopping")
  public void userClickContinueShopping() {
    cartPage.clickContinueShoping();
  }

  @When("User click on Checkout")
  public void userClickOnCheckout() {
    cartPage.clickCheckout();
  }

  @When("User input first name {string}")
  public void userInputFirstName(String firstName) {
    cartPage.userFirstName(firstName);
  }

  @And("User input last name {string}")
  public void userInputLastName(String lastName) {
    cartPage.userLastName(lastName);
  }

  @And("User input postal code {string}")
  public void userInputPostalCode(String postalCode) {
    cartPage.userPostalCode(postalCode);
  }

  @When("User click on {string} button on checkout step one")
  public void userClickButtonOnCheckoutStepOne(String button) {
    cartPage.clickButtonOnStepOne(button);
  }

  @Then("User will be directed to checkout step {string}")
  public void userIsOnCheckOut(String step) {
    cartPage.checkoutStep(step);
  }

  @Then("User click on {string} on step two")
  public void userClickButtonOnStepTwo(String button) {
    cartPage.clickButtonOnStepTwo(button);
  }

  @Then("User can see Thank You message to confirm the order")
  public void userCanSeeThankYouMessage() {
    cartPage.getConfirmationMessage();
  }

}
