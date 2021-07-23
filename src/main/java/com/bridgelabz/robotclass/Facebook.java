package com.bridgelabz.robotclass;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Facebook {
    public static void main(String[] args) throws InterruptedException, IOException {


        WebDriver driver = new DriverSelector().chromeDriver();
//        WebDriver driver = new DriverSelector().firefoxDriver();
//        WebDriver driver = new DriverSelector().edgeDriver();

        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");
        String url = driver.getCurrentUrl();
        System.out.println("URL is : " + url);

        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        String title = driver.getTitle();
        System.out.println("Title is : " + title);

        Thread.sleep(5000);
        WebElement text = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/p[1]"));
        System.out.println("Text on page : " + text.getText());

        /*---Registration Page---*/
        driver.findElement(By.name("firstname")).sendKeys("Rushikesh");
        driver.findElement(By.name("lastname")).sendKeys("Tayade");
        driver.findElement(By.name("reg_email__")).sendKeys("9309768837");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Rushi@123");

//        driver.findElement(By.name("birthday_day")).sendKeys("4");
//        driver.findElement(By.name("birthday_month")).sendKeys("May");
//        driver.findElement(By.name("birthday_year")).sendKeys("1998");

        /*---Select DOB---*/
        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByVisibleText("30");
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("Jan");
        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText("1998");

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        driver.findElement(By.name("websubmit")).click();

        /*---Screenshot---*/
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("./screenshots_FB/" + "fb_register_page_" + System.currentTimeMillis() + ".png");
        FileHandler.copy(sourceFile, destinationFile);

        /*---Handling Browser navigation---*/
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(500);
        driver.navigate().refresh();

        /*---Handling Mouse and Keyboard Operations---*/
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        /*---Handling Window switch Operations---*/
        String parent = driver.getWindowHandle();
        Set<String> switchwindow = driver.getWindowHandles();
        Iterator<String> iterator = switchwindow.iterator();
        while (iterator.hasNext()) {
            String child_window = iterator.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.get("https://www.amazon.in/");
            }
        }
        driver.switchTo().window(parent);
        Thread.sleep(2000);
        driver.quit();
    }
}
