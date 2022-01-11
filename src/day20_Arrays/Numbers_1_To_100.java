package day20_Arrays;

import java.util.Arrays;

public class Numbers_1_To_100 {

        public static void main(String[] args) {

            int[]numbers = new int[100];

            for (int i = 1;i<=numbers.length; i++) {
                  numbers[i-1] = i;


            } System.out.println(Arrays.toString(numbers));

        }
}
