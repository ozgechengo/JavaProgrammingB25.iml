package day11_Switch_Scanner;

public class NumberOfMonth {
    public static void main(String[] args) {
        int number=1;
        String text="";

        switch (number){
            case 1:
                text="Monday";
                break;
            case  2:
                text="Tuesday";
                break;
            case  3:
                text="Wednesday";
                break;
            case  4:
                text="Thursday";
                break;
            case  5:
                text="Friday";
                break;
            case  6:
                text="Saturday";
                break;
            case  7:
                text="Sanday";
                break;
            default:
                text="Wrong Number";
        }
        System.out.println(text);

    }
}
