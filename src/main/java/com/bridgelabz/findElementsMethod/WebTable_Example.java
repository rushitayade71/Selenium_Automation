package com.bridgelabz.findElementsMethod;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTable_Example {

    public static void main(String[] args) {

        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\WebTable.html");
        driver.manage().window().maximize();

        List<WebElement> totalRows = driver.findElements(By.tagName("tr"));
        System.out.println("Total number of Rows present are :- " +totalRows.size());

        List<WebElement> totalColumns = driver.findElements(By.tagName("th"));
        System.out.println("Total number of Columns present are :- " +totalColumns.size());

//        int totalCells = ((totalColumns.size())*(totalRows.size()));
//        System.out.println("Total number of Cells present are :- " +totalCells );

        List<WebElement> totalCell = driver.findElements(By.xpath("//th|//td"));
        System.out.println("Total number of Cells present are :- " +totalCell.size());

        int countNumericValue = 0;
        int sum = 0;

        for (WebElement cell : totalCell) {
            String cellValue = cell.getText();

            try{
            int number = Integer.parseInt(cellValue);
                System.out.println(" " +number);
                countNumericValue++;
                sum += number;
            }catch (Exception exception){
            }
        }

        System.out.println("Total number of Numeric Values are :- " +countNumericValue);
        System.out.println("Sum of all numeric Values is :- " +sum);

        driver.quit();
    }
}
