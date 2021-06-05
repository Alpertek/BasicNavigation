package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {



    public static WebDriver getDriver(String browserType){
    WebDriver driver=null;
    if(browserType.toLowerCase ().equalsIgnoreCase ( "chrome" )){
        WebDriverManager.chromedriver ().setup ();
        return  new ChromeDriver();

    }if(browserType.toLowerCase ().equalsIgnoreCase ( "firefox" )){

        WebDriverManager.firefoxdriver ().setup ();
        return new FirefoxDriver();
        }if(browserType.toLowerCase().equals("edge")&& System.getProperty("os.name").contains("Windows")){
        WebDriverManager.edgedriver ().setup ();
        return new EdgeDriver();

        }if ((browserType.toLowerCase().equals("safari")&&System.getProperty("os.name").contains("Mac"))){

            return new SafariDriver();

        }else{
        return driver;
        }

    }





}
