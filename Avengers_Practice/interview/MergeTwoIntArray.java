package interview;

import java.util.Arrays;

public class MergeTwoIntArray {



        public static int[] mergetwoArrays(int[] num, int[] num2) {


            int [] merged = new int[num.length + num2.length];


            int i = 0;

            for (int each : num) {
                merged[i] = each;
                i++;


            }
            for (int each : num2) {
                merged[i] = each;
                i++;
            }

            return merged;
        }

        public static void main(String[] args) {

            int [] num = {1,2,3,4,5};
            int [] num2 = {2,4,5,6,7};

            System.out.println(Arrays.toString(mergetwoArrays(num,num2)));


        }
    }

