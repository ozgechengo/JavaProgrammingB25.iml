package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("ENTER THE RADIOUS OF THE CIRCLE");

        double r =input.nextDouble();
          //if want to use scanner again use  *double r =input.nextDouble();
        double area = r * r * 3.14 ;
        double peremiter = 2 * r *3.14 ;

        System.out.println("area = " +area );
        System.out.println("peremiter =" +peremiter );





    }


}
