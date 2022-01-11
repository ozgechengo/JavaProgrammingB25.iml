package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYlISTTOARRAY {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here


        String [] result = info.split(",");
        System.out.println("person name: "+result[0]);

        System.out.println("last name: "+result[1]);

        System.out.println("age: "+result[2]);
    }

}