package com.bridgelabz.findElementsMethod;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StudentsTable_Example {
    public static void main(String[] args) {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("C:\\Users\\Hp\\eclipse-workspace\\Selenium\\htmlPage\\StudentsWebTable.html");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        int totalRows = rows.size();
        System.out.println("Total Rows present in table are :- " + totalRows);

        List<WebElement> totalColumns = driver.findElements(By.tagName("th"));
        System.out.println("Total Columns present in table are :- " + totalColumns.size());

        List<WebElement> totalCell = driver.findElements(By.xpath("//th|//td"));
        System.out.println("Total Cells present in table are :- " + totalCell.size());

        int sumOfMarks = 0;
        for (int i = 2; i <= totalRows - 1; i++) {
            WebElement subjectMarks = driver.findElement(By.xpath("//tr[" + i + "]/td[3]"));
            try {
                int marks = Integer.parseInt(subjectMarks.getText());
                sumOfMarks += marks;
            } catch (Exception exception) {
            }
        }
        System.out.println("Sum of marks is :- " + sumOfMarks);

        WebElement total = driver.findElement(By.xpath("//tr[" + totalRows + "]/td[3]"));
        int totalMarks = Integer.parseInt(total.getText());
        System.out.println("Total Marks :- " + totalMarks);

        if (sumOfMarks == totalMarks) {
            System.out.println("Sum of marks is equals to the Total Marks!!");
        } else {
            System.out.println("Sum of marks is not equals to the Total Marks!!");
        }
    }
}
