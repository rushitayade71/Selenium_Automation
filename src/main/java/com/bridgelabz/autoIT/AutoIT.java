package com.bridgelabz.autoIT;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class AutoIT {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/seeker/registration");
        driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).click();
        Thread.sleep(3000);
        /*---Run AutoIT Script---*/
        Runtime.getRuntime().exec("C:\\Users\\Hp\\AutoIT\\FileUpload.exe");
        System.out.println("File Uploded!!");
        Thread.sleep(5000);
    }
}
