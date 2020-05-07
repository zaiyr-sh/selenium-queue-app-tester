package com.company.DriverManagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        FirefoxOptions options =  new FirefoxOptions();
        System.setProperty("webdriver.gecko.driver","E:\\Installation\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
        this.driver = new FirefoxDriver(options);

    }
}