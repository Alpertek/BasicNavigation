package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    private static String operatingSystem = System.getProperty("os.name");

    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        if(browserType.toLowerCase ().equalsIgnoreCase ( "chrome" )){
            WebDriverManager.chromedriver ().setup ();
            return  new ChromeDriver();
        }
        
        else if(browserType.toLowerCase ().equalsIgnoreCase ( "firefox" )){

            WebDriverManager.firefoxdriver ().setup ();
            return new FirefoxDriver();
        }
        else if(browserType.toLowerCase().equals("edge") && operatingSystem.contains("Windows")){
            WebDriverManager.edgedriver ().setup ();
            return new EdgeDriver();
        }
        else if((browserType.toLowerCase().equals("safari") && operatingSystem.contains("Mac"))){
            return new SafariDriver();
        }
        else{
            return driver;
        }
    }
}
