package com.bridgelabz.autoIT;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class FileUpload {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new DriverSelector().chromeDriver();

        driver.manage().window().maximize();
        driver.get("file://C:/Users/Hp/Desktop/fileupload.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@name='resumeupload']")).click();
        Runtime.getRuntime().exec("C:\\Users\\Hp\\AutoIT\\ResumeUpload.exe");
    }
}
