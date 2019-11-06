package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    //This test is done for windows Environment.
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");
        String[] title = new String[4];
        String[] url = new String[4];
        System.out.println("------------REPORT------------");
        for (int i = 0; i < 4; i++) {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get(urls.get(i));
            Thread.sleep(4000);
            title[i] = driver.getTitle();
            url[i] = driver.getCurrentUrl();
            System.out.println("------------------------------");
            System.out.println("--------" + (i + 1) + ". WebSite------------");
            System.out.println("Url:   " + url[i]);
            System.out.println("Title: " + title[i]);
            System.out.println("Does website have a title: " + (title[i].length() > 3));
            driver.close();
        }


    }


}


