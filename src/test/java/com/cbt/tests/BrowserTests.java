package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class BrowserTests {

    public static void ChromeTest(String url1,String url2){

        WebDriver driver= BrowserFactory.getDriver ( "chrome" );

        driver.get ( url1);
        String chromeUrl1= driver.getTitle ();
        System.out.println (chromeUrl1);

        driver.get ( url2 );
        String chromeUrl2= driver.getTitle ();
        System.out.println (chromeUrl2);

        driver.navigate ().back ();
        String ActualChromeUrl1=driver.getTitle ();
        System.out.println (ActualChromeUrl1);

        StringUtility.verifyEquals ( chromeUrl1,ActualChromeUrl1 );

        driver.navigate ().forward ();
        String ActualChromeUrl2=driver.getTitle ();
        System.out.println (ActualChromeUrl2);

        StringUtility.verifyEquals ( chromeUrl2,ActualChromeUrl2 );

        driver.quit ();

    }

    public static void firefoxTest(String url1,String url2){

        WebDriver driver= BrowserFactory.getDriver ( "firefox" );

        driver.get ( url1 );
        String firefoxUrl1= driver.getTitle ();
        System.out.println (firefoxUrl1);

        driver.get ( url2 );
        String firefoxUrl2=driver.getTitle ();
        System.out.println (firefoxUrl2);

        driver.navigate ().back ();

        String ActualFirefoxUrl1=driver.getTitle ();
        System.out.println (ActualFirefoxUrl1);

        StringUtility.verifyEquals ( firefoxUrl1,ActualFirefoxUrl1 );

        driver.navigate ().forward ();

        String ActualFirefoxUrl2=driver.getTitle ();
        System.out.println (ActualFirefoxUrl2);

        StringUtility.verifyEquals ( firefoxUrl2,ActualFirefoxUrl2 );

        driver.quit ();


    }
    public static void safariTest(String url1,String url2){

        WebDriver driver= BrowserFactory.getDriver ( "safari" );

        driver.get ( url1 );
        String safariUrl1= driver.getTitle ();
        System.out.println (safariUrl1);

        driver.get ( url2 );
        String safariUrl2=driver.getTitle ();
        System.out.println (safariUrl2);

        driver.navigate ().back ();

        String ActualSafariUrl1=driver.getTitle ();
        System.out.println (ActualSafariUrl1);

        StringUtility.verifyEquals ( safariUrl1,ActualSafariUrl1 );

        driver.navigate ().forward ();

        String ActualSafariUrl2=driver.getTitle ();
        System.out.println (ActualSafariUrl2);

        StringUtility.verifyEquals ( safariUrl2,ActualSafariUrl2 );

        driver.quit ();

    }


}
