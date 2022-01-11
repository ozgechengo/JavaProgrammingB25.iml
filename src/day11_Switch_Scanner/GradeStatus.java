package day11_Switch_Scanner;

public class GradeStatus {

    public static void main(String[] args) {
        char letter = 'A';
        String state = "";

        switch (letter) {

            case 'A':
                state = ("Excellent");
                break;
            case 'B':
                state = ("GREAT JOB");
                break;
            case 'C':
                state = ("GOOD");
                break;
            case 'D':
                state = ("PASSED");
                break;
            case 'F':
                state = ("FAILED");

            default:
                state = "NOT A VALID NUMBER";}


                System.out.println(state);


        }
    }