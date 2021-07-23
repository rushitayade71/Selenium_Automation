package com.bridgelabz.SelectClass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintOptions_SortedOrder {
    public static void main(String[] args) {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\SelectList.html");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.id("car")));
        List<WebElement> options = select.getOptions();
        System.out.println("Number of Options are :- " +options.size());

        ArrayList<String> list = new ArrayList<>();
        for (WebElement webElement:options) {
            String text = webElement.getText();
            list.add(text);
        }
        System.out.println(list);
        Collections.sort(list);

        for (String value:list) {
            System.out.println(value);
        }
        driver.close();
    }
}
