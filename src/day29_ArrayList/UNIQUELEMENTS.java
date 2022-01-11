package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UNIQUELEMENTS {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 78, 8, 56, 45, 34, 34534, 34, 34, 5, 34));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int freq = Collections.frequency(list, each);
            if (freq == 1) {
                unique.add(each);

            }}
            System.out.println(unique);
        }


    }
