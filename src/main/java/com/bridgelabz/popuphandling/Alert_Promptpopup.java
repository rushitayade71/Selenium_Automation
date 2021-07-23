package com.bridgelabz.popuphandling;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert_Promptpopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();

        driver.manage().window().maximize();
        driver.get("http://tizag.com/javascriptT/javascriptprompt.php");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("table.outter:nth-child(3) table.main tbody:nth-child(1) tr:nth-child(1) td.mainIn div.display:nth-child(12) > input:nth-child(2)")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Rushi");
        Thread.sleep(3000);
        System.out.println("Text on Prompt Pop Up is :- "+alert.getText());
        alert.accept();
        Thread.sleep(2000);
        System.out.println("Text on simple Pop Up is :- "+alert.getText());
        alert.dismiss();
        System.out.println("Prompt Pop Up Handled Successfully!!");
        Thread.sleep(5000);
        driver.quit();
    }
}
