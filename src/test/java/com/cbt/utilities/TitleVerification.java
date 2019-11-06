package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    //This test is done for windows Environment.
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String[] title = new String[3];
        String[] url = new String[3];
        for (int i = 0; i < 3; i++) {
            driver.get(urls.get(i));
            Thread.sleep(4000);
            title[i] = driver.getTitle();
            url[i] = driver.getCurrentUrl();
        }

        if (title[0].equals(title[1]) && title[0].equals(title[2])) {
            System.out.println("---------------------");
            System.out.println("PASSED");
            System.out.println("ALL TITLES ARE SAME");
            System.out.println(title[0] + "\n" + title[1] + "\n" + title[2]);
            System.out.println("---------------------");

        } else {
            System.out.println("-------------------------");
            System.out.println("FAILED");
            System.out.println("ALL TITLES ARE NOT SAME");
            System.out.println(title[0] + "\n" + title[1] + "\n" + title[2]);
            System.out.println("-------------------------");
        }

        if (url[0].substring(0, 34).equals(url[1].substring(0, 34)) && url[0].substring(0, 34).equals(url[2].substring(0, 34))) {
            System.out.println("----------------------------");
            System.out.println("PASSED");
            System.out.println("ALL URL`s ARE STARTING SAME");
            System.out.println(url[0].substring(0, 34) + "\n" + url[1].substring(0, 34) + "\n" + url[2].substring(0, 34));
            System.out.println("----------------------------");

        } else {
            System.out.println("-------------------------");
            System.out.println("FAILED");
            System.out.println("ALL TITLES ARE NOT SAME");
            System.out.println(url[0].substring(0, 34) + "\n" + url[1].substring(0, 34) + "\n" + url[2].substring(0, 34));
            System.out.println("-------------------------");
        }

        driver.close();


    }

}
