package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName  = input.next();


        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = f+ ". " +l +"." ;
        System.out.println("initial =" +initials);
    }

}
