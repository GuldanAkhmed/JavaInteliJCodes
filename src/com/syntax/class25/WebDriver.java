package com.syntax.class25;

public interface WebDriver {
    void OpenBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class  ChromeDriver implements WebDriver {

    @Override
    public void OpenBrowser() {
        System.out.println("open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize Window");
    }

    @Override
    public void findElement() {
        System.out.println("find element");
    }

    class FirefoxDriver implements WebDriver{

        @Override
        public void OpenBrowser() {
            System.out.println("open the Browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("close the browser");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("maximize window");
        }

        @Override
        public void findElement() {
            System.out.println("find element");
        }
    }
}

