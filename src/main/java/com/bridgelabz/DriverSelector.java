package com.bridgelabz;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSelector {
    public WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver firefoxDriver () {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Automation\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public  WebDriver edgeDriver () {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Hp\\Automation\\driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;

    }
}
