package com.dimas.stepdef;

import com.dimas.BaseTest;
import com.dimas.page.loginPage;
import com.dimas.page.productPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productStepDef extends BaseTest {
  loginPage loginPage;
  productPage productPage;

  @Given("User try to login to the page")
  public void userTryToLogin() {
    loginPage = new loginPage(driver);
    loginPage.goToLoginPage();
  }

  @And("User input valid username and key in {string}")
  public void inputValidUsernameCredential(String userName) {
    loginPage.inputUsername(userName);
  }

  @And("User input valid password and key in {string}")
  public void inputValidPasswordCredential(String password) {
    loginPage.inputPassword(password);
  }

  @When("User login with valid password")
  public void userTryToAccessTheProduct() {
    loginPage.clickLoginButton();
  }

  @Then("User should be redirected to the List Product page")
  public void userCanAccessProductPage() {
    loginPage.isUserOnProductPage();
  }

  @When("User click on the add to cart button on product {string}")
  public void userAddToCart(String productName) {
    productPage = new productPage(driver);
    productPage.AddProduct(productName);
  }

  @When("User try to remove the product {string}")
  public void userRemoveProduct(String productName) {
    productPage.removeProductFromCart(productName);
  }

  @Then("User will see the chart icon with {string}")
  public void checkChartNotification(String totalProductAdded) {
    productPage.checkChart(totalProductAdded);
  }

  @When("User click on cart icon")
  public void userClickCartIcon() {
    productPage.clickCarticon();
  }
}
