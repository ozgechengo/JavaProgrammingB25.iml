package day04_Variables;

   /*3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI

   */

public class Circle {
    public static void main(String[] args) {
        //PI ,Radius ,Diameter ,Area , Perimeter
        double radius = 5.5;


        double PI         = 3.14;
        double diameter   = radius * 2;                // 10 * 2
        double area       = radius * radius * PI ;    // 10 * 10 * 3.14
        double  perimeter =  diameter * PI ;         // 10 * 2 * 3.14

        System.out.println("radius =" + radius);
        System.out.println("diameter =" + diameter);
        System.out.println("area +" +area);
        System.out.println("perimeter +" + perimeter);












    }}





