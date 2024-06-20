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
    List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
    int length = elements.size();

    if (length != 0) {
      for (WebElement element : elements) {
        if (element.getText().equals(nameProduct)) {
          boolean compare = element.getText().contains(nameProduct);
          System.out.println("Product Found: " + compare);
          if (compare == true) {
            WebElement parent = element.findElement(By.xpath("//div[@class=\"inventory_item\"]"));
            WebElement button = parent.findElement(By.xpath("//button"));
            button.click();
          }
        }
      }
    }

  }

  public void checkChartItems(String items) {
    WebElement element = driver.findElement(By.className("shopping_cart_badge"));

    String elementContent = element.getText();
    assertTrue(elementContent.equals(items));
  }
}