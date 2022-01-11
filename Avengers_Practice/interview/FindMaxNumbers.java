package interview;

import java.util.Arrays;

public class FindMaxNumbers {
    public static void main(String[] args) {

        int[] nums={12,23,45,67,78,89,};

        int max=0;


        for (int each : nums) {
            if (each > max) {
                max = each;
            }
        }
            System.out.println(max);
        }




    }
