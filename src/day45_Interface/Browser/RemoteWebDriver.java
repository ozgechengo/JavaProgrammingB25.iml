package day45_Interface.Browser;

public  class RemoteWebDriver implements Webdriver,TakeScreenShots, JavaScriptExecuter{


    private final String browserName;

    public String getBrowserName() {
        return browserName;
    }

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
        System.out.println("Opening "+ browserName+" browser");
    }


    public void executeScript(String script) {
        System.out.println("Executing \"" + script + "\" script on" + browserName + " browser");
    }

    public void findElement(String locator) {
        System.out.println(browserName+" driver locating an element by " + locator);
    }

    public void findElements(String locator) {
        System.out.println(browserName+" driver locating multiple elements by " + locator);
    }

    public void get(String url) {
        System.out.println("Getting the "+url+" on " + browserName + " browser");
    }

    public void close() {
        System.out.println("Closing the tab on "+browserName+" browser");
    }

    public void quit() {
        System.out.println("Quiting the "+browserName+" browser");
    }

    public void getTitle() {
        System.out.println(browserName + "driver is getting the title");
    }

    public void takeScreenShot() {
        System.out.println("Taking screenshot on: " + browserName + " browser");
    }
}