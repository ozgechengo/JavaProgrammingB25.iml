package day20_Arrays;

import java.util.Arrays;

public class Alphabets2 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];  //Z~A



        for(char i ='A', j =0;  i <='Z' && j<alphabets.length; i++, j-- ){
                  alphabets[i] = j;
        }


        //   System.out.println( alphabets );
        System.out.println(Arrays.toString(alphabets) ); // print the whole array
        //       System.out.println( alphabets[0] ); // printing the element of array




    }


}
