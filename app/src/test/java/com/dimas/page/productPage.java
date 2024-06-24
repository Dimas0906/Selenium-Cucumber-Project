package com.dimas.page;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
  WebDriver driver;

  public productPage(WebDriver driver) {
    this.driver = driver;
  }

  public void AddProduct(String productName) {
    List<WebElement> products = driver.findElements(By.xpath("//div[@class=\"inventory_item\"]"));

    for (WebElement product : products) {
      Boolean isProductExist = product.findElement(By.className("inventory_item_name")).getText().equals(productName);

      if (isProductExist) {
        product.findElement(By.className("btn_inventory")).click();
        break;
      }
    }

  }

  public void checkChart(String totalProductAdded) {
    String cartTotalItem = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).getText();

    assertTrue(cartTotalItem.equals(totalProductAdded));
  }

  public void removeProductFromCart(String productName) {

    String cartTotalItem = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]")).getText();

    if (cartTotalItem.equals("0")) {
      return;
    } else {
      List<WebElement> products = driver.findElements(By.xpath("//div[@class=\"inventory_item\"]"));

      for (WebElement product : products) {
        Boolean isProductExist = product.findElement(By.className("inventory_item_name")).getText().equals(productName);

        if (isProductExist) {
          WebElement buttonProduct = product.findElement(By.className("btn_inventory"));

          if (buttonProduct.getText().equals("Remove")) {
            buttonProduct.click();
          }
        }
      }
    }
  }

}
