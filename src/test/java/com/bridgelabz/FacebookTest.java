package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookTest {
    WebDriver driver;


    @Parameters({"browser"})
    @BeforeTest
    public void selectBrowser(String browser) throws Exception {
        if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("The Browser is :- " + browser);
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\Automation\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Chrome")) {
            System.out.println("The Browser is :- " + browser);
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            throw new Exception("Incorrect Browser");
        }
    }

    @Test(priority = 1)
    public void homePage() throws InterruptedException {
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("Title is : " + title);
        Assert.assertEquals(title,"Facebook – log in or sign up");
    }

    @Test(priority = 2, dependsOnMethods = "homePage")
    public void registrationPage() throws InterruptedException {
        /*---Registration Page---*/
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Rushikesh");
        driver.findElement(By.name("lastname")).sendKeys("Tayade");
        driver.findElement(By.name("reg_email__")).sendKeys("9309768837");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Rushi@123");

        /*---Select DOB---*/
        Select day = new Select(driver.findElement(By.name("birthday_day")));
        day.selectByVisibleText("30");
        Select month = new Select(driver.findElement(By.name("birthday_month")));
        month.selectByVisibleText("Jan");
        Select year = new Select(driver.findElement(By.name("birthday_year")));
        year.selectByVisibleText("1998");

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        driver.findElement(By.name("websubmit")).click();

        driver.quit();
    }
}