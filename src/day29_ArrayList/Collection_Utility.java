package day29_ArrayList;


import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Collection_Utility {
    public static void main(String[] args) {



            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(10, 9, 8, 7,6,5,4,3,2,1));

            Collections.sort(list);

            System.out.println(list);

            System.out.println("-----------------------------------");

            ArrayList<Character> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

            System.out.println(list2);

            Collections.reverse(list2);

            System.out.println(list2);

            System.out.println("-----------------------------------");

            ArrayList<Integer> list3 = new ArrayList<>();
            list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

            Collections.swap(list3, 4, 1 );

            System.out.println(list3);

            System.out.println("-----------------------------------");

            int max = Collections.max(list3);
            int min = Collections.min(list3);

            System.out.println("min = " + min);
            System.out.println("max = " + max);

        System.out.println("---------------------------------------------------");


        ArrayList<Integer> list4=new ArrayList<>();



            list4.addAll(Arrays.asList(10,20,30,40,50,60,10,10,10));

        Collections.replaceAll(list4,10,555);

        System.out.println(list4);

        System.out.println("------------------------------------------------");

              int freq =Collections.frequency(list4,555);
              System.out.println(freq);


              System.out.println("------------------------------------------------");


              ArrayList<String> names=new ArrayList<>();
             names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

            int freqname=Collections.frequency(names,"Java");
        System.out.println(freqname);


        }

    }
