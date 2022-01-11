package practice_12_08;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciWithArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number=input.nextInt();



         int[] fibo=new int[number];

         fibo[0]=0;
         fibo[1]=1;
            for (int i =2 ; i<number ; i++) {

                fibo[i]=fibo[i-1]+fibo[i-2];
            //  fibo[2]=fibo[2-1]+fibo[2-2]
           //   fibo[3]=fibo[3-1]+fibo[3-2]
           //   fibo[4]=fibo[4-1]+fibo[3-2]
            }
        System.out.println(Arrays.toString(fibo));
            }

        }