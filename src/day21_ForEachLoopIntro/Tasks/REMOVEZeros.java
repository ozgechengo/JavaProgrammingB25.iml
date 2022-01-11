package day21_ForEachLoopIntro.Tasks;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class REMOVEZeros {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0, 9,0,0, 8, 0, 6, 5, 4, 3, 2, 0));


               list.removeIf(p -> p == 0);

                    System.out.println(list);


}}
