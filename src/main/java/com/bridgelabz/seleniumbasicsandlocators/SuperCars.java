package com.bridgelabz.seleniumbasicsandlocators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperCars {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wsupercars.com/website-search/");
        driver.manage().window().maximize();
        driver.findElement(By.id("s")).sendKeys("Porsche");
        driver.findElement(By.xpath("/html/body/div/main/section/div[2]/form/button")).click();

        JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
        scrolldown.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/section[1]/div[4]/a[8]")).click();

//        driver.findElement(By.cssSelector("div.wrapper:nth-child(1) main:nth-child(2) section.content div.search-box-holder:nth-child(5) > a.home-box:nth-child(8)")).click();
        System.out.println("Done");


    }

}
