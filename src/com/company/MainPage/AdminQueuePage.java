package com.company.MainPage;

import com.company.DriverManagers.DriverManager;
import com.company.DriverManagers.DriverManagerFactory;
import com.company.DriverManagers.DriverType;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminQueuePage {

    DriverManager driverManager;
    WebDriver driver;

    @org.junit.Test
    public void AdminLoginQueueAppTest() throws InterruptedException {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://qr-queue-0.firebaseapp.com/");

        WebElement enter = driver.findElement(By.cssSelector(".mobile-menu__btn"));
        enter.click();
        Thread.sleep(5000);
        WebElement aboutUsBtn = driver.findElement(By.cssSelector(".mobile-menu__item:nth-of-type(1)"));
        aboutUsBtn.click();

        WebElement email = driver.findElement(By.cssSelector("#field_email"));
        WebElement password = driver.findElement(By.cssSelector("#field_password"));
        email.sendKeys("noble@gmail.com");
        password.sendKeys("noble");
        System.out.println("Text Field Set");

        WebElement loginBtn = driver.findElement(By.cssSelector("#input_submit"));
        loginBtn.click();


        System.out.println("\"О нас\" button Done with Click");

    }
}
