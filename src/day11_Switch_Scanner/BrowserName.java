package day11_Switch_Scanner;

public class BrowserName {
    public static void main(String[] args) {

        String browserName = "EDGE";

        switch (browserName) {

            case "FIREFOX":
                browserName = ("YOU ARE USING FIREFOX");
                break;
            case "SAFARI":
                browserName = ("YOU ARE USING SAFARI");
                break;
            case "EDGE":
                browserName= ("YOU ARE USING EDGE");
                break;
            case "OPERA":
                browserName= ("YOU ARE USING OPERA");
                break;
            case "CHROME":
                browserName= ("YOU ARE USING CHROME");

            default:
                browserName = "INVALID BROWSER";
        }


        System.out.println(browserName);


    }
}