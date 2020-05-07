package com.company.MainPage;

import com.company.DriverManagers.DriverManager;
import com.company.DriverManagers.DriverManagerFactory;
import com.company.DriverManagers.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSystemPage {

    DriverManager driverManager;
    WebDriver driver;

    @org.junit.Test
    public void AdminPanelCreateQueueAppTest() throws InterruptedException {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://qr-queue-project.herokuapp.com/index");

        WebElement email = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));

        Thread.sleep(3000);
        email.sendKeys("admin");

        Thread.sleep(3000);
        password.sendKeys("password");
        System.out.println("Employee Data Field Set");

        WebElement loginBtn = driver.findElement(By.cssSelector(".btn"));
        loginBtn.click();

        Thread.sleep(3000);
        WebElement newQueue = driver.findElement(By.cssSelector("input[name=name]"));

        WebElement createQueueBtn = driver.findElement(By.cssSelector("input[type=submit]"));

        Thread.sleep(3000);
        newQueue.sendKeys("Парикмахер");
        createQueueBtn.click();

        System.out.println("Queue Data Field Set");
    }

    @org.junit.Test
    public void AdminPanelAddEmployeeAppTest() throws InterruptedException {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        driver.get("https://qr-queue-project.herokuapp.com/employee");

        WebElement email = driver.findElement(By.cssSelector("#username"));
        WebElement password = driver.findElement(By.cssSelector("#password"));

        Thread.sleep(3000);
        email.sendKeys("admin");

        Thread.sleep(3000);
        password.sendKeys("password");
        System.out.println("Employee Data Field Set");

        WebElement loginBtn = driver.findElement(By.cssSelector(".btn"));
        loginBtn.click();

        Thread.sleep(3000);
        WebElement newEmployeeBtn = driver.findElement(By.cssSelector(".btn-link "));
        newEmployeeBtn.click();

        Thread.sleep(3000);
        WebElement nameEmployee = driver.findElement(By.cssSelector("input[name=name]"));
        nameEmployee.sendKeys("Mark");

        Thread.sleep(3000);
        WebElement emailEmployee = driver.findElement(By.cssSelector("input[name=email]"));
        emailEmployee.sendKeys("noble@gmail.com");

        Thread.sleep(3000);
        WebElement passwordEmployee = driver.findElement(By.cssSelector("input[name=password]"));
        passwordEmployee.sendKeys("noble");

        Thread.sleep(3000);
        WebElement submitData = driver.findElement(By.cssSelector("input[type=submit]"));
        submitData.click();



    }
}
