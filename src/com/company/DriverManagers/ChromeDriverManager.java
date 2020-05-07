package com.company.DriverManagers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends  DriverManager {
    @Override
    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "E:\\Installation\\chromedriver_win32 (3)\\chromedriver.exe");
        this.driver = new ChromeDriver(options);
    }
}