package com.bridgelabz.findElementsMethod;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\Checkbox.html");
        driver.manage().window().maximize();

        List<WebElement> CountCheckbox = driver.findElements(By.tagName("input"));
        System.out.println("Total number of checkbox present on the page :- " +CountCheckbox.size());

        int i;
        for (i = 0; i<=CountCheckbox.size()-1; i++) {
            CountCheckbox.get(i).click();
            Thread.sleep(500);
        }
        for (i=CountCheckbox.size()-1; i>=0; i--) {
            CountCheckbox.get(i).click();
            Thread.sleep(500);
        }
        CountCheckbox.get(0).click();
        Thread.sleep(500);
        CountCheckbox.get(CountCheckbox.size()-1).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
