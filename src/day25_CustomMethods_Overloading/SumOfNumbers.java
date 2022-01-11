package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static int sumof2(int num1,int num2) {
        return num1 + num2;


    }


    public static int sumof3(int num1,int num2,int num3) {
          return num1 + num2 + num3;


    }

    public static int sumof4(int num1,int num2,int num3,int num4) {
         return num1+num2+num3+num4;

    }


    public static void main(String[] args) {

        int sum2= sumof2(3,6);
        System.out.println(sum2);


        int sum3= sumof3(3,6,7);
        System.out.println(sum3);

        int sum4= sumof4(3,6,6,7);
        System.out.println(sum4);
    }
}
