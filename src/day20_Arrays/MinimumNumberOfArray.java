package day20_Arrays;

import java.util.Arrays;

public class MinimumNumberOfArray {
    public static void main(String[] args) {

        int[] numbers={100,300,500,600,400,80,90};
        int min= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) {
                min=numbers[i];

            }
            }
            System.out.println(min);
        }}

