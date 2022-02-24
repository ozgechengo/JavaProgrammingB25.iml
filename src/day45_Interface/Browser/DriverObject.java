package day45_Interface.Browser;

public class DriverObject {

    public static void main(String[] args) {


        ChromeDriver chrome = new ChromeDriver();
        EdgeDriver edge = new EdgeDriver();
        FireFoxDriver fireFox = new FireFoxDriver();
        OperaDriver opera = new OperaDriver();
        SafariDriver safari = new SafariDriver();

        safari.quit();
        opera.findElement("By name");
        opera.takeScreenShot();
        fireFox.getTitle();
        opera.quit();
        safari.close();
        safari.executeScript("HELLO");
        chrome.close();
        chrome.getBrowserName();
        chrome.executeScript("HELLO");
        edge.findElement("By Title");
        edge.getBrowserName();
        fireFox.findElements("By Title");



    }
}