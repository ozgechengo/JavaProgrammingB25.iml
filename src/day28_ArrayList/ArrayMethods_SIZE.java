package day28_ArrayList;

import java.util.ArrayList;

public class ArrayMethods_SIZE {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7

        numbers.add(2, 25); //2
        numbers.add(5, 45); //5

        System.out.println(numbers);


        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);
    }
}