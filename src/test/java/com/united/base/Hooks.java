package com.united.base;

import com.united.utilis.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    String URL = "https://www.united.com/en/us";

    @Before
    public void setUp(){
        driver = BrowserManager.getDriver("chrome");
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}


