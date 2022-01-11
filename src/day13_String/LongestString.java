package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your first sentence.");
        String sent1=input.nextLine();

        System.out.println("Please enter your last sentence .");
        String sent2=input.nextLine();
         int lenght1  = sent1.length();
         int lenght2  = sent2.length();

        if (lenght1 > lenght2){
            System.out.println(sent1 + "is longer than "+ sent2);
        }else{
            System.out.println(sent2 + " is longer than " + sent1);
        }


    }


}
