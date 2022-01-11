package day18_WhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

       while (true){
        System.out.println("PLEASE ENTER A NUMBER");
        int number = scan.nextInt();

        if (number % 2 == 0) {
                System.err.println("EVEN NUMBER");
            } else {
                System.err.println("ODD NUMBER");
            }
            System.out.println(" Do you want to add another number");

               String answer =scan.next().toLowerCase();

             while (  !(answer.equals("yes")     ||    answer.equals("no"))  ) {



              if(answer.equals("no"));
                 {
                     break;

                 }}}}}