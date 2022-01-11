package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_RETAIN {
    public static void main(String[] args) {

        ArrayList<String>employees=new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","Ahmet","David","Jimmy","Daniel","Aaron","David","Ahmet","Shay"));
        employees.retainAll(Arrays.asList("Ahmet","David"));


        System.out.println(employees);





    }
}
