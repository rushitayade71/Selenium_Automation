package com.bridgelabz.popuphandling;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();

        driver.manage().window().maximize();
        driver.get("file://C:/Users/Hp/Desktop/fileupload.html");
        driver.findElement(By.name("resumeupload")).sendKeys("C:\\Users\\Hp\\Desktop\\RUSHI\\RushikeshResume.pdf");
        Thread.sleep(5000);
        System.out.println(" File Upload Pop Up Handled Successfully!! ");
        driver.quit();
    }
}
