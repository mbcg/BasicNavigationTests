package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;


public class TitleVerification2 {
    //This test is done for windows Environment.
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String[] title = new String[4];
        String[] url = new String[4];
        for (int i = 0; i < 4; i++) {
            driver.get(urls.get(i));
            Thread.sleep(4000);
            title[i] = driver.getTitle();
            url[i] = driver.getCurrentUrl();
        }
        driver.close();
        System.out.println("------------REPORT------------");
        for (int j = 0; j < 4; j++) {
            System.out.println("------------------------------");
            System.out.println("--------" + (j + 1) + ". WebSite------------");
            System.out.println("Url:   " + url[j]);
            System.out.println("Title: " + title[j]);
            System.out.println("Does website have a title: " + (title[j].length() > 3));


        }


    }

}
