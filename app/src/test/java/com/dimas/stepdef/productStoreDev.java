package com.dimas.stepdef;

import com.dimas.BaseTest;
import com.dimas.page.loginPage;
import com.dimas.page.productStore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class productStoreDev extends BaseTest {
  productStore productStore;
  loginPage loginPage;

  @Given("User try to login to the page")
  public void userIsOnLoginPage() {
    loginPage = new loginPage(driver);
    loginPage.goToLoginPage();
  }

  @And("User input valid username and key in {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("User input valid password and key in {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click on the login")
  public void userClickLoginButton() {
    loginPage.clickLoginButton();
  }

  @Then("User should be redirected to the List Product page")
  public void userShouldBeRedirectedToListProductPage() {
    assert driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
  }

  @When("User click on the add to cart button on product {string}")
  public void userSelectTheProductListProduct(String nameProduct) {
    productStore.selectTheProductListProduct(nameProduct);
  }

  @Then("User will see the chart icon with {string}")
  public void checkChartIcon(String productTotal) {
    productStore.checkChartItems(productTotal);
  }
}
