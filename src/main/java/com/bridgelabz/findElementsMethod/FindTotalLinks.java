package com.bridgelabz.findElementsMethod;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindTotalLinks {
    public static void main(String[] args) {
        WebDriver driver = new DriverSelector().chromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();


        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links Present on Webpage are :- " +links);
        System.out.println("Number of Links on Webpage :- "+links.size());


        int visibleLinks = 0;
        int hiddenLinks = 0;

        for (WebElement link : links) {
            if(link.isDisplayed()){
                visibleLinks++;
                System.out.println("Visible--------->");
                System.out.println(link.getAttribute("href"));

            }
            else {
                hiddenLinks++;
                System.out.println("Hidden--------->");
                System.out.println(link.getAttribute( "href"));
            }
        }
        System.out.println("Number of visible links are :- " +visibleLinks);
        System.out.println("Number of hidden links are :- " +hiddenLinks);
        driver.quit();
    }
}
