package com.dimas;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.dimas" }, features = "src/test/resources", plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json" })
public class CucumberTest {
}
