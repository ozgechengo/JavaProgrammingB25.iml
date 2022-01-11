package interview;

import java.util.Arrays;

public class ReverseDoubleArray {
    public static void main(String[] args) {

        double[] nums = {2.3, 5.6, 6.5, 4.7, 4.8, 2.3, 4.5};

        double[] reverse = reverseDoubleArray(nums);

        System.out.println(Arrays.toString(reverse));


    }

    public static double[] reverseDoubleArray(double[] args) {


        double[] reverse = new double[args.length];


        for (int i = args.length - 1, j = 0; i >= 0; i--, j++) {

            reverse[j] = args[i];


        }


        return reverse;
    }


}


// 2. Create a method that can reverse a double array