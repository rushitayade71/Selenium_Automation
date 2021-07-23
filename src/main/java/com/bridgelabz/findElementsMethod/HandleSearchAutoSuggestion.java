package com.bridgelabz.findElementsMethod;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleSearchAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);
        List<WebElement> searchSuggestionslist = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        System.out.println("Total number of suggestions are :- " +searchSuggestionslist.size());
        String expectedValue="seleniumhq";

        for (WebElement suggestion : searchSuggestionslist) {
            String text = suggestion.getText();
            System.out.println(" " +text);

            if (text.equalsIgnoreCase(expectedValue)) {
                suggestion.click();
                break;
            }
        }
    }
}
