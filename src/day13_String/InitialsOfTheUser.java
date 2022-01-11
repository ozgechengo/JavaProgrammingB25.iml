package day13_String;

import java.util.Scanner;

public class InitialsOfTheUser {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName  = input.next();


        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        String initials = first + ". " +last +"." ;
        System.out.println("initial =" +initials);



    }


}
