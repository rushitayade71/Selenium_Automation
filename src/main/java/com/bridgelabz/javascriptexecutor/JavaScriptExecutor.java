package com.bridgelabz.javascriptexecutor;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.bigbasket.com/");
        String url = driver.getCurrentUrl();
        System.out.println("URL is : " + url);

        /*---Scrollup ScrollDown---*/

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i <= 10; i++) {
            js.executeScript("window.scrollBy(0,450)");
            Thread.sleep(1000);
        }
        for (int i = 1; i <= 5; i++) {
            js.executeScript("window.scrollBy(0,-450)");
            Thread.sleep(1000);
        }

        WebElement location = driver.findElement(By.xpath("//h4[contains(text(),'PAYMENT OPTIONS:')]"));
        int x = location.getRect().getX();
        int y = location.getRect().getY();

        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);

        /*---Find Element By JavaScript ---*/
        js.executeScript("document.getElementById('toTop').click();");
        Thread.sleep(3000);
        driver.quit();
    }
}
