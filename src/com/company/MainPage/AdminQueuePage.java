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
    public void AdminPanelQueueAppTest() throws InterruptedException {
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

        Thread.sleep(5000);
        email.sendKeys("noble@gmail.com");

        Thread.sleep(5000);
        password.sendKeys("noble");
        System.out.println("Employee Data Field Set");

        WebElement loginBtn = driver.findElement(By.cssSelector("#input_submit"));
        loginBtn.click();

        System.out.println("Admin Panel is open");


        Thread.sleep(3000);
        WebElement deleteBtn = driver.findElement(By.cssSelector(".close-container"));
        deleteBtn.click();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        System.out.println("The client has been deleted");

        Thread.sleep(3000);
        WebElement logoutBtn = driver.findElement(By.cssSelector(".logout"));
        logoutBtn.click();

        Thread.sleep(3000);
        driver.close();
    }

}
