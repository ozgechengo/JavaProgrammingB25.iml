package day52_Map_FunctionalInterface;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {


            String str = "aabcccdeeeef";
            String[] arr = str.split("");
            Map<String, Integer> uniqueList = new HashMap<>();

            Set<String> removeDup = new TreeSet<>(Arrays.asList(arr));


            int i = 0;
            for (String key : removeDup) {
                if (Collections.frequency(Arrays.asList(arr),key)==1)
                    uniqueList.put(key, Collections.frequency(Arrays.asList(arr), key));

            }
            System.out.println("Unique= " + uniqueList);


    String str2 = "aabcccdeeeef";
    Map<String,Integer>map = new LinkedHashMap<>();
        for (String eachCh : str2.split("")) {
        if( Collections.frequency(Arrays.asList(str.split("")),eachCh)==1){
            map.put(eachCh,1);
        }
    }
        System.out.println("map = " + map);

}
}
