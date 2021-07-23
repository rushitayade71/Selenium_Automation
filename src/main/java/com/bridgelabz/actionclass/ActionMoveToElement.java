package com.bridgelabz.actionclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;

public class ActionMoveToElement {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.actimind.com/");
        Thread.sleep(1000);

        WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);

        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Cloud Applications')]"));
        actions.moveToElement(submenu).click().perform();
        Thread.sleep(5000);

        driver.quit();
    }
}