package day20_Arrays;

import java.util.Scanner;

public class SquareAre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){
        System.out.println("Enter the side of the square");
        double side= input.nextDouble();


         if(side<=0){
             System.out.println("Entry for the side of the square");
             System.exit(0);
         }
             double area =side *side;
             double perimeter = 4* side;
            System.out.println(area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("Would you like to calculate another Square");
             String a= input.next();
             while (!(a.equalsIgnoreCase("yes"))||(a.equalsIgnoreCase("no"))){
                 System.out.println("INVALID ENTRY");
                 a=input.next();
                 if(a.equalsIgnoreCase("no")){
                     System.out.println("Thank you for using Cydeo Square Calculator APP");
                     break;
                 }
         }
         }
    }
    }

