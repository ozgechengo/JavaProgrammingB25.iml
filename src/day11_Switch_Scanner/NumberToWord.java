package day11_Switch_Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 1;
        String text = "";

        switch (number) {
            case 1:
                text = "one";
                break;
            case 2:
                text = "two";
                break;
            case 3:
                text = "three";
                break;
            case 4:
                text = "four";
                break;
            case 5:
                text = "five";
                break;
            case 6:
                text = "six";
                break;
            case 7:
                text = "seven";
                break;
            case 8:
                text = "eight";
                break;
            case 9:
                text = "nine";

            default:
                text = "not a valid number";
        }System.out.println(text);

        }

    }