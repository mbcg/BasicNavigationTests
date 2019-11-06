package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browsertype) {
        WebDriver driver = null;
        if (browsertype.toLowerCase()=="safari" && StringUtility.getOperatingSystemSystemUtils().equals("Windows 10")) {
            System.out.println("The Browser safari does not work with "+StringUtility.getOperatingSystemSystemUtils()+" operating system.");
            System.out.println("Please change your browser type and try again...");
            return null;
        }
        if (browsertype.toLowerCase()!="edge" && browsertype.toLowerCase()!="chrome" && browsertype.toLowerCase()!="firefox") {
            System.out.println("No valid browser entered...!");
            System.out.println("Your browser is NULL now...!");
            return null;
        }
        switch (browsertype.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        return driver;
    }










}
