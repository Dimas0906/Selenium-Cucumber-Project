package com.dimas.stepdef;

import com.dimas.BaseTest;
import com.dimas.page.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends BaseTest {
  loginPage loginPage;

  @Given("User on the login page")
  public void userIsOnLoginPage() {
    loginPage = new loginPage(driver);
    loginPage.goToLoginPage();
  }

  @And("User input username and key in {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("User input password and key in {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click on the login button")
  public void userClickLoginButton() {
    loginPage.clickLoginButton();
  }

  @Then("User should be redirected to the product page")
  public void userShouldBeRedirectedToHomePage() {
    loginPage.isUserOnProductPage();
  }

  @Then("User able to see error message {string}")
  public void userShouldSeeAnErrorMessage(String errMsg) {
    loginPage.getErrorMessage(errMsg);
  }
}
