package day38_Inheritance.Browser;

public class OperaBrowser extends Browser {


    public OperaBrowser(String Browser) {
        super("OPERA");
    }
    @Override
    public void openBrowser() {
        System.out.println("Opera browser is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Opera is closing");
    }
}


