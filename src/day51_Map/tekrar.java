package day51_Map;

import java.util.Map;
import java.util.TreeMap;

public class tekrar {
    public static void main(String[] args) {

        Map<Integer, String> treeMap = new TreeMap<>(); // Key can not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(11, "Arthur");
        treeMap.put(12, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,null);
        treeMap.put(2,null);
        treeMap.put(4,null);


        System.out.print("treeMap = " + treeMap);



    }
}
