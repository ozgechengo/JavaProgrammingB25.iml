package day20_Arrays;

import java.util.Scanner;

public class Square2 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            while(true) {
                System.out.println("Enter the side of the square:");
                double side = scan.nextDouble();


                if (side <= 0) {
                    System.err.println("Invalid Entry for the side of the square.");
                    System.exit(0);
                }

                double area = side * side;
                double perimeter = 4 * side;

                System.out.println("area = "+ area);
                System.out.println("perimeter = " + perimeter);

                System.out.println("Would you like to calculate another Square?");
                String a = scan.next();

                while(!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))) {
                    System.err.println("Invalid entry. Please re-enter: ");
                    a = scan.next();
                }
                if(a.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    break;
                }
            }

        }
    }
