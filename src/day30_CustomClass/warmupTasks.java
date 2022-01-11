package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 0, 3, 4, 5, 5, 6, 7, 7));


        Collections.swap(list, 0, list.size() - 1);    // ilk ve son sayiyi degistirdim.
        System.out.println(list);

        int size = list.size();       //sifirlari cikarmadan once size i belirledim.
        list.removeIf(p -> p == 0);      // sifir varsa cikar dedim.
        System.out.println(list);

        int newsize = list.size();   //sifirlar cikarilmis haldeki newsize i

        int totalremovednewsize = size - newsize;  // yeni boyutu bulmak icin ilk haliyle ikinci halini cikardim.

        for (int i = 0; i < totalremovednewsize; i++) {  // sonra kalan size kadar eklemesini istedim loopla
            list.add(0);


        }


        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println(result);


    }
}

/*

1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */