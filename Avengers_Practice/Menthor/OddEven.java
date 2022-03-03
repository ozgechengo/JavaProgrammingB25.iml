package Menthor;


public class OddEven {


    public static void main(String[] args) {

        System.out.println(returnOdd(5));

    }


    static String returnOdd(int num) {

        String result = "";

        if (num % 2 == 1) {
            result = ("number is ODD");
        } else {
            result = "number is EVEN";
        }
        return result;
    }
}



