package com.dimas.page;

import org.openqa.selenium.WebDriver;

public class loginPage {
  WebDriver driver;

  public loginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void goToLoginPage() {
    driver.get("https://www.saucedemo.com/");
  }
}
