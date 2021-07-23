package com.bridgelabz.seleniumbasicsandlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalculator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web2.0calc.com/");
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("DemoUser");
        Thread.sleep(2000);
        driver.findElement(By.id("inputEmail")).sendKeys("Demo123@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("inputPassword1")).sendKeys("DemoPass@123");
        Thread.sleep(2000);
        driver.findElement(By.id("inputPassword2")).sendKeys("DemoPass@123");
        Thread.sleep(2000);
        driver.findElement(By.name("tos")).click();
        Thread.sleep(2000);
    }
}
