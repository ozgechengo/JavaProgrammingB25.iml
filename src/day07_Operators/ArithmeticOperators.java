package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1      = 10 ;
        int num2      = 3  ;
        int division  = num1 / num2 ; // division contains the result of num1 divided by num2 .
        int remainder = num1 % num2 ; // it means left over .Contains the
                                     // remainder of num1 divided by num2

          // 10 divide by 3 is equal to 3 with a reminder of 1

        System.out.println(num1 / num2 + num1 % num2 );
        System.out.println("remainder = " + remainder);
        System.out.println("division = " + division);
        System.out.println(num1 +" divided by " + num2 + " is equal to " + division + " with a remainder of " + remainder );

       // What is the remainder of 25 divided by 4

        System.out.println(25 % 4);
        System.out.println( 24 / 4);



           // What is the remain of 5 divided by 5

        System.out.println( 25 % 5 );



    }






}






