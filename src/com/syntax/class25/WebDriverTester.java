package com.syntax.class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();
        webDriver.OpenBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();

     WebDriver[] webDrivers={new ChromeDriver()};
     for (WebDriver w:webDrivers){
         w.OpenBrowser();
         w.closeBrowser();
         w.maximizeWindow();
         w.findElement();
     }
    }
}



