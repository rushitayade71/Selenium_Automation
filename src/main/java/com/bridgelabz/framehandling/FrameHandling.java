package com.bridgelabz.framehandling;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\src\\main\\java\\com\\bridgelabz\\framehandling\\FrameHTML\\Page2.html");
        driver.findElement(By.id("page2t1")).sendKeys("Shashi");

        Thread.sleep(2000);
        driver.switchTo().frame("f1");
        Thread.sleep(1000);
        driver.findElement(By.id("page1t1")).sendKeys("Rushikesh");

        driver.switchTo().parentFrame();
        driver.findElement(By.id("page2t2")).sendKeys("Kiran");
        Thread.sleep(1000);

        driver.switchTo().frame("f2");
        driver.findElement(By.id("page3t1")).sendKeys("Subodh");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
        driver.findElement(By.id("page2t2")).clear();
        driver.findElement(By.id("page2t2")).sendKeys("Abcd");
        Thread.sleep(5000);

        driver.quit();
    }
}