package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;


        if (n1 > n2) {
            System.out.println(n1 + " is the maximum number");
        }
        if (n2 > n1) {
            System.out.println(n2 + " is the maximum number");
        }
        if (n1 == n2) {
            System.out.println("Numbers are Equal");
        }

    }}