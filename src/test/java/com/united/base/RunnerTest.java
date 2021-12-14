package com.united.base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src//test//resources//features"},
        glue = {"com/united"},
        tags = "@Test",
        publish = true



)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
