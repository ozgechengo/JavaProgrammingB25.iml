package day50_Collections_Map;

import java.util.*;

public class ListSetPractice2 {

    public static void main(String[] args) {


        Set<Integer>set =new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,3,2,4,3,5,3,2));

        System.out.println(set);

       Integer[] array =set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));

        List<Integer> list=new ArrayList<>(set);
        System.out.println(list);

        List<String> names=null;
        System.out.println(names.size());

    }
}