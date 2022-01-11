package day01_082022;

public class calculator {



        public static int add(int num1,int num2) {

            return num1 + num2;


        }
        public static int multiply(int num1,int num2){

            return  num1*num2;
    }

        public static int subs(int num1 , int num2){
            return num1/num2;

        }


    public static void main(String[] args) {

        System.out.println(add(3,4));
        System.out.println(multiply(3,4));
        System.out.println(subs(4,2));



    }

}
