package day20_Arrays;

public class MaximumNumberOfArray {
    public static void main(String[] args) {


            int[] numbers={100,300,500,600,400,80,90};
            int max= numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]>max) {
                    max=numbers[i];

                }
            }
            System.out.println(max);
        }}

/*

1. create an array that has the numbers 1 to 100
 */