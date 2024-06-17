package com.dimas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
  protected static WebDriver driver;

  protected void getDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
  }

}
