package day38_Inheritance.Browser;

public class SafariBrowser extends Browser{


    public SafariBrowser(String Browser) {
        super("SAFARI");
    }

    @Override
    public void openBrowser() {
        System.out.println("SAFARI is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("SAFARI is closing");
    }
}
