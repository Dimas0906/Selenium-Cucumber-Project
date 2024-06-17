package com.dimas.stepdef;

import com.dimas.BaseTest;
import com.dimas.page.loginPage;

import io.cucumber.java.en.Given;

public class loginStepDef extends BaseTest {
  loginPage loginPage;

  @Given("I am on the login page")
  public void userIsOnLoginPage() {
    loginPage = new loginPage(driver);
    loginPage.goToLoginPage();
  }
}
