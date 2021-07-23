package com.bridgelabz.SelectClass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleListBox {
    public static void main(String[] args) {

        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\SelectList.html");
        driver.manage().window().maximize();

        Select select = new Select(driver.findElement(By.id("car")));
        List<WebElement> options = select.getOptions();
        System.out.println("Number of Options are :- " +options.size());

        for (WebElement webElement:options) {
            String text = webElement.getText();
            System.out.println(text);
        }

        select.selectByVisibleText("Audi");
        select.selectByValue("m");
        select.selectByIndex(1);

        System.out.println("Number of selected options are :-" +select.getAllSelectedOptions().size());

        for (WebElement webElement:select.getAllSelectedOptions()) {
            System.out.println(webElement.getText());
        }
        boolean multiple = select.isMultiple();
        System.out.println(multiple+", List Box is Multi selected!!");

        select.deselectByIndex(0);
        select.deselectByVisibleText("BMW");

        if (multiple == true) {
            WebElement firstSelectedOption = select.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText() +" -- is first selected option from list");
        }
    }
}
