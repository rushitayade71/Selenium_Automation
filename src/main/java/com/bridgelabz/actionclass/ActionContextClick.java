package com.bridgelabz.actionclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionContextClick {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");

        WebElement loginId = driver.findElement(By.id("email"));

        Actions actions = new Actions(driver);
        actions.contextClick(loginId).perform();
        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_UP);
        robot.keyRelease(KeyEvent.VK_UP);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.quit();
    }
}
