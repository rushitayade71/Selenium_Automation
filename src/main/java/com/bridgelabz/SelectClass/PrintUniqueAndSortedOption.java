package com.bridgelabz.SelectClass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.TreeSet;

public class PrintUniqueAndSortedOption {
    public static void main(String[] args) {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\SelectList.html");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.id("car")));
        List<WebElement> options = select.getOptions();
        System.out.println("Number of Options are :- " +options.size());

        TreeSet<String> list = new TreeSet<>();
        for (WebElement webElement:options) {
            String text = webElement.getText();
            list.add(text);
        }
        System.out.println(list);
        driver.close();
    }
}
