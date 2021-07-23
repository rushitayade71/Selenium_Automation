package com.bridgelabz.seleniumbasicsandlocators;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Flipkart {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Automation\\driver\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        WebDriver driver = new DriverSelector().edgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        /*---Registration---*/
//        driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart? Create an account')]")).click();
//        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("9309768837");
//        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/input[1]")).sendKeys("Demo@123");

        /*---Login---*/
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("9309768837");
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")).sendKeys("Demo@123");
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();

        /*---Search---*/
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Mobiles");
        driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")).submit();
    }
}
