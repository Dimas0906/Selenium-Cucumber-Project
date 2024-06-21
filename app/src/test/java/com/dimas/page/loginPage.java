package com.dimas.page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
  WebDriver driver;

  public loginPage(WebDriver driver) {
    this.driver = driver;
  }

  public void goToLoginPage() {
    driver.get("https://www.saucedemo.com/");
  }

  public void inputUsername(String username) {
    driver.findElement(By.id("user-name")).sendKeys(username);
  }

  public void inputPassword(String password) {
    driver.findElement(By.id("password")).sendKeys(password);
  }

  public void clickLoginButton() {
    driver.findElement(By.id("login-button")).click();
  }

  public void getErrorMessage(String errMsg) {
    assertTrue(driver.getPageSource().contains(errMsg));
  }
}
