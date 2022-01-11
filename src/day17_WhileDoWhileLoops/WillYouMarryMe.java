package day17_WhileDoWhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {

        System.out.println("WILL YOU  MARRY ME ?");
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER YOUR ANSWER");
         String a= input.next().toLowerCase();


         if( a.equals("yes")){
             System.out.println("CONGRATS");
         }else {
             System.out.println("GOOD BYE");
         }




    }
}
/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and
    repeat it until the user enters either yes or no
 */