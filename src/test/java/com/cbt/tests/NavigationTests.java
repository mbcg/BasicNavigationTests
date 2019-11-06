package com.cbt.tests;


import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {
    String expected = "";
    String actual = "";
    //This test is done for windows Environment.
    public static void main(String[] args) throws InterruptedException {
        NavigationTests google = new NavigationTests();
        NavigationTests etsy = new NavigationTests();

        String[] browsers = {"edge", "chrome", "firefox"};
        for (int i = 0; i < 3; i++) {

            WebDriver driver = BrowserFactory.getDriver(browsers[i]);
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("We are now using the " + driver);
            System.out.println("---------------------------------------------------------------------------------");
            driver.get("https://google.com");
            Thread.sleep(4000);
            google.expected = driver.getTitle();
            driver.get("https://etsy.com");
            Thread.sleep(4000);
            etsy.expected = driver.getTitle();
            driver.navigate().back();
            Thread.sleep(4000);
            google.actual = driver.getTitle();
            StringUtility.verifyEquals(google.expected, google.actual);
            driver.navigate().forward();
            Thread.sleep(4000);
            etsy.actual = driver.getTitle();
            StringUtility.verifyEquals(etsy.expected, etsy.actual);
            System.out.println("---------------------------------------------------------------------------------");
            Thread.sleep(6000);
            driver.close();
        }

    }


}

