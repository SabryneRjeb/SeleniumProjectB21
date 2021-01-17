package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        // 1-setup the web driver
        WebDriverManager.chromedriver().setup();

        //2- create the instance of chrome driver
        // this is the line where the selenium WebDriver opens the browser

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // this line maximizes the browser

        //3- test if driver is working      get("URL)
        driver.get("https://www.google.com");
        System.out.println("Current tittle of the pages:"+driver.getTitle());
        // getting the current URL and storing from selenium library
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl= "+currentUrl);

        // we are using navigate.back method from SELENIUM LIBRARY
        Thread.sleep(3000);       // it comes from Java library
        driver.navigate().back();  // goes back

        Thread.sleep(3000);
        driver.navigate().forward(); // goes forward
        Thread.sleep(3000);
        driver.navigate().to("https://www.tesla.com"); // this is similar to get method. it gets the given URL

        System.out.println("Current tittle of the pages:"+driver.getTitle());
        // we are reassigning the value of"currentURL" String by calling the method again
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl= "+currentUrl);



            driver.quit();// closing the browser



    }
}
