package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UNIQUELEMENTS2 {
    public static void main(String[] args) {


               ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 78, 8, 56, 45, 34, 34534, 34, 34, 5, 34));

               ArrayList<Integer> unique2 = new ArrayList<>(list2); //add all element of list2

               unique2.removeIf(p ->Collections.frequency(list2,p)>1);


                System.out.println(unique2);


    }
}

