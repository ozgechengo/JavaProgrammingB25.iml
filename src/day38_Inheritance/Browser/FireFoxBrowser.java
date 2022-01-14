package day38_Inheritance.Browser;

public class FireFoxBrowser extends Browser {


    public FireFoxBrowser(String Browser) {
        super("FireFox");
    }

    @Override
    public void openBrowser() {
        System.out.println("FireFox is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("FireFox is closing");
    }
}
