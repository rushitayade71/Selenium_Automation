package com.bridgelabz.popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

public class FileDownloadPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Hp\\Automation\\driver\\geckodriver.exe");

        FirefoxProfile profile = new FirefoxProfile();
        String key = "browser.helperApps.neverAsk.saveToDisk";
        String value = "application/zip";
        profile.setPreference(key,value);
        profile.setPreference("browser.download.folderList",2);
        profile.setPreference("browser.download.dir","E:\\Download");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(FirefoxDriver.PROFILE,profile);
        WebDriver driver = new FirefoxDriver(capabilities);

        driver.get("http://www.seleniumhq.org/download/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("3.141.59")).click();
        Thread.sleep(3000);


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Automation\\driver\\chromedriver.exe");

        //Create Hashmap object and assign the profile settings
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "E:\\Download");

        //Assign this chromePrefs object with ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        //Create Capability object and assign the option object
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver1 = new ChromeDriver(cap);
        driver1.get("http://www.seleniumhq.org/download/");
        Thread.sleep(3000);
//        String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
        driver1.findElement(By.linkText("3.141.59")).click();
    }
}
