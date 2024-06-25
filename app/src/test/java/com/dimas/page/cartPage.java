package com.dimas.page;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
  WebDriver driver;

  public cartPage(WebDriver driver) {
    this.driver = driver;
  }

  public void isUserOnCartPage() {
    assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html"));
  }

  public void checkItemInCart(String productName) {
    List<WebElement> items = driver.findElements(By.xpath("//div[@class=\"cart_item\"]"));

    for (WebElement item : items) {
      String isProductExist = item.findElement(By.className("inventory_item_name")).getText();

      if (isProductExist.equals(productName)) {
        assertTrue(isProductExist.equals(productName));
        break;
      }
    }
  }

  public void removeItemFromCart(String productName) {

    List<WebElement> items = driver.findElements(By.xpath("//div[@class=\"cart_item\"]"));

    for (WebElement item : items) {
      boolean isProductExist = item.findElement(By.className("inventory_item_name")).getText().equals(productName);
      if (isProductExist) {
        WebElement removeButton = item.findElement(By.className("cart_button"));

        if (removeButton.getText().equals("Remove")) {
          removeButton.click();
        }
      }
    }
  }

  public void clickContinueShoping() {
    driver.findElement(By.xpath("//button[@id=\"continue-shopping\"]")).click();
  }

  public void clickCheckout() {
    driver.findElement(By.id("checkout")).click();
  }

  public void checkoutStep(String step) {
    if (step == "one") {
      driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-one.html");
    } else if (step == "two") {
      driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html");
    } else {
      driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html");
    }
  }

  public void userFirstName(String firstName) {
    driver.findElement(By.id("first-name")).sendKeys(firstName);
  }

  public void userLastName(String lastName) {
    driver.findElement(By.id("last-name")).sendKeys(lastName);
  }

  public void userPostalCode(String postalCode) {
    driver.findElement(By.id("postal-code")).sendKeys(postalCode);
  }

  public void clickButtonOnStepOne(String button) {
    if (button == "cancel") {
      driver.findElement(By.id("cancel")).click();
    } else {
      driver.findElement(By.id("continue")).click();
    }
  }

  public void clickButtonOnStepTwo(String button) {
    if (button == "cancel") {
      driver.findElement(By.id("cancel")).click();
    } else {
      driver.findElement(By.id("finish")).click();
    }
  }

  public void getConfirmationMessage() {
    assertTrue(driver.getPageSource().contains("Thank you for your order!"));
  }
}
