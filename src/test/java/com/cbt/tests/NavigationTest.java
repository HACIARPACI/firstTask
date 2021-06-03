package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTest {
    public static void main(String[] args) {
         testChrome();
         testFirefox();
         testEdge();
       /* browserTestMethod.testBrowser("chrome");
        browserTestMethod.testBrowser("firefox");
        browserTestMethod.testBrowser("edge");*/
    }
        public static void testChrome() {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("https://google.com");
            String titleGoogle = driver.getTitle();
            driver.get("https://etsy.com");
            String titleEtsy = driver.getTitle();
            driver.navigate().back();
            String titleGoogleBack = driver.getTitle();
            StringUtility.verifyEquals(titleGoogleBack, titleGoogle);
            driver.navigate().forward();
            String titleEtsyForward = driver.getTitle();
            StringUtility.verifyEquals(titleEtsyForward, titleEtsy);
            driver.quit();
        }
    public static void testFirefox() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        String titleGoogleBack = driver.getTitle();
        StringUtility.verifyEquals(titleGoogleBack, titleGoogle);
        driver.navigate().forward();
        String titleEtsyForward = driver.getTitle();
        StringUtility.verifyEquals(titleEtsyForward, titleEtsy);
        driver.quit();
    }
    public static void testEdge() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        String titleGoogleBack = driver.getTitle();
        StringUtility.verifyEquals(titleGoogleBack, titleGoogle);
        driver.navigate().forward();
        String titleEtsyForward = driver.getTitle();
        StringUtility.verifyEquals(titleEtsyForward, titleEtsy);
        driver.quit();
    }


    }


