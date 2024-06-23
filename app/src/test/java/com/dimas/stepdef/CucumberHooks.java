package com.dimas.stepdef;

import com.dimas.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {
  @Before
  public void beforeTest() {
    getDriver();
  }

  @After
  public void afterTest() throws InterruptedException {
//    Thread.sleep(2000);
    driver.quit();
  }
}
