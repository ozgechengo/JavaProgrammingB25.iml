package Menthor;

public class Swap2Numbers {
    public static void main(String[] args) {
        swapWithTheSum(15,5);
    }


    public static void swapWithTheSum(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " and b = " + b);
    }
 }




/*

        int a=10; //a=5
        int b=5;  //b=10


        a=a+b;//15
        b=a-b;//10
        a=a-b;//5
         System.out.println("a = " + a);
        System.out.println("b = " + b);

 */
