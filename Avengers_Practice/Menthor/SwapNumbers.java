package Menthor;

public class SwapNumbers {

    public static void main(String[] args) {

        swapnumbers( 15,10);

    }

    public  static void swapnumbers(int a , int b){


        a=a+b; // a=15  b = 10   a=25
        b=a-b; // b=10  25-10    b =15
        a=a-b;  // a=25  25-15    a =10

        System.out.println("a = " + a + " and b = " + b);
    }

}
