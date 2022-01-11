package day18_WhileLoops.day27_WrapperClasses;

public class SumOfDigits {
    public static void main(String[] args) {

        String s="a3f3g4h5j6j7k8l9ke";
        int sum=0;


        for (char each:s.toCharArray()){

              if(Character.isDigit(each)){

                  sum+=Integer.parseInt(""+each);
              }

            System.out.println(sum);
        }
    }
}
