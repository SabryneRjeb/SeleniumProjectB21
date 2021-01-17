package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelectorTask {
    public static void main(String[] args) {
        //1. Open Chrome browser
        // using our utility to do setup + open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Enter search term (use cssSelector to locate search box)

        WebElement amazonSearchBar = driver.findElement(By.cssSelector(""));
        // tag name[attribute='value]

        //4. Verify title contains search term




    }
}
