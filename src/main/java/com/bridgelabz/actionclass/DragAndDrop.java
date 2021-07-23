package com.bridgelabz.actionclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));
        Thread.sleep(2000);
        actions.dragAndDrop(source,destination).perform();

    }
}
