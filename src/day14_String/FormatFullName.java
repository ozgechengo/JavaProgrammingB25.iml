package day14_String;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        System.out.println("Please enter your first name");
        Scanner inputn = new Scanner(System.in);
         String firstName =inputn.next();
        System.out.println("Please ENTER your last name");
         Scanner inputl = new Scanner(System.in);
        String lastName =inputl.next();

        String changedName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String changedLName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(changedName+ " " +changedLName);


    }
}
