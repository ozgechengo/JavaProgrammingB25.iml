package day09_IfStatements;

public class MinimumNumber {
    public static void main(String[] args) {


        int n1 = 100;
        int n2 = 200;

        boolean num1IsMin = n1<n2 ;
        boolean num2IsMin = n2<n1 ;
        boolean equal     = n1 == n2 ;




        if (num1IsMin) {
            System.out.println(n1 + " is the minimum number");
        }
        if (num2IsMin) {
            System.out.println(n2 + " is the minimum number");
        }
        if (equal) {
            System.out.println("Numbers are Equal");
        }

    }
}