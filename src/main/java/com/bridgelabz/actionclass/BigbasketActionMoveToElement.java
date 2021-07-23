package com.bridgelabz.actionclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class BigbasketActionMoveToElement {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.bigbasket.com/");
        Thread.sleep(1000);

        WebElement ShopByCategory = driver.findElement(By.xpath("//a[contains(text(),'Shop by Category')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(ShopByCategory).perform();
        Thread.sleep(2000);

        WebElement beverages = driver.findElement(By.linkText("Beverages"));
        actions.moveToElement(beverages).perform();
        Thread.sleep(2000);

        WebElement energyAndSoftDrinks = driver.findElement(By.linkText("Energy & Soft Drinks"));
        actions.moveToElement(energyAndSoftDrinks).click().perform();
        Thread.sleep(2000);
    }
}
