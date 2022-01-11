package day21_ForEachLoopIntro.Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayList {
    public static void main(String[] args) {


        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));


        Collections.swap(list, 0, list.size() - 1);


        System.out.println(list);


    }

}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

 */