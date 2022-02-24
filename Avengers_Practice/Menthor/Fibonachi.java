package Menthor;

public class Fibonachi {
    public static void main(String[] args) {



        int first =0;
        int second=1;

        int fibo =8;
        int result=0;


        for (int i = 2; i <=fibo ; i++) {
            result=first+second;
            first=second;
            second=result;

            System.out.println(result);

        }





    }
}
