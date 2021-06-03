package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browserName) {

        WebDriver driver = null;
        if (browserName.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            return driver;
        }
        if (browserName.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().equals("edge") && System.getProperty("os.name").contains("Windows")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            return driver;
        }
        if (browserName.toLowerCase().equals("safari") && System.getProperty("os.name").contains("Mac")) {

            return new SafariDriver();
        } else {
            return driver;
        }
    }
}
