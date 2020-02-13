package com.w2a.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver;

@BeforeSuite
    public void setUp() {

    }

@AfterSuite
    public void tearDown() {

    }
}
