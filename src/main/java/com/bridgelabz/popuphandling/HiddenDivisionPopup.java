package com.bridgelabz.popuphandling;

import com.bridgelabz.DriverSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HiddenDivisionPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new DriverSelector().chromeDriver();
        driver.get("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DApple&otracker=clp_metro_expandable_7_3.metroExpandable.METRO_EXPANDABLE_iPhone_mobile-phones-store_92RED14GXPXF_wp3&fm=neo%2Fmerchandising&iid=M_5810fc92-59f5-4ee5-9269-1df0087d279a_3.92RED14GXPXF&ppt=hp&ppn=homepage&ssid=y2hlh511zk0000001626919244329");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/span[1]/label[1]/div[1]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
