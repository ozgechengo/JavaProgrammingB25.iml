package day28_ArrayList;

import java.util.ArrayList;

public class ArrayMethods_GET {                 // GET THE ELEMENT FROM THE SPECIFIC ELEMENT
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

         int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }




    }
}
