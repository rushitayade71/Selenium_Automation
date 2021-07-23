package com.bridgelabz.popuphandling;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPopUp_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container div.row div.col-md-3 > input:nth-child(3)")).sendKeys("C:\\Users\\Hp\\Desktop\\RUSHI\\RushikeshResume.pdf");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/input[2]")).sendKeys("C:\\Users\\Hp\\Desktop\\RUSHI\\PHOTO.jpg");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body.ng-scope:nth-child(2) div.container div.row div.col-md-9 div:nth-child(4) > button.btn.btn-danger.btn-s:nth-child(4)")).click();
        driver.quit();
    }
}
