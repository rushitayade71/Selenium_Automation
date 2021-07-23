package com.bridgelabz.robotclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MouseMove {

    public static void main(String[] args) throws AWTException {


        WebDriver driver = new DriverSelector().chromeDriver();
//        WebDriver driver = new DriverSelector().firefoxDriver();
//        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");
        String url = driver.getCurrentUrl();
        System.out.println("URL is : " + url);

        WebElement location = driver.findElement(By.name("login"));
        System.out.println(location.getRect().getPoint().getX());
        System.out.println(location.getRect().getPoint().getY());

//        int x = location.getRect().getPoint().getX();
//        int y = location.getRect().getPoint().getY();

        int x = location.getLocation().getX();
        int y = location.getLocation().getY();
        System.out.println(x);
        System.out.println(y);

        int width = location.getSize().width;
        int height = location.getSize().height;

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links);
        System.out.println("Number of links used in Webpage : " +links.size());

        Robot robot = new Robot();
        robot.mouseMove((x+width/2), ((y+height/2)+110));
    }

}
