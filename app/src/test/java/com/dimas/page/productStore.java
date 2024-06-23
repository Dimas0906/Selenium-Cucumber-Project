package com.dimas.page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productStore {
  WebDriver driver;

  public productStore(WebDriver driver) {
    this.driver = driver;
  }

  // Product Store Steps
  public void selectTheProductListProduct(String nameProduct) {
    driver.findElement(By.xpath("//*[text()='"+nameProduct+"']/parent::*/parent::*/following-sibling::*/child::button")).click();
  }

  public void checkChartItems(String items) {
    WebElement element = driver.findElement(By.className("shopping_cart_badge"));

    String elementContent = element.getText();
    assertTrue(elementContent.equals(items));
  }
}
