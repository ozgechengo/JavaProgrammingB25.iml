package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_SET {           // REPLACE
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("java");
        list.add("Phyton");
        list.add("c#");
        list.add("Rubby");
        list.add("Javac");

        list.set(0,"ozge");

        System.out.println(list);




    }

}
