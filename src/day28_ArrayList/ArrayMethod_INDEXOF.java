package day28_ArrayList;

import java.util.ArrayList;

public class ArrayMethod_INDEXOF {
    public static void main(String[] args) {   // returns first matching element number returns int

        ArrayList<Character> characters=new ArrayList<>();


        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a=characters.indexOf('A');
        int b=characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);


         boolean r2=characters.contains('z');
         boolean r3=characters.contains('A');
        System.out.println(r2);
        System.out.println(r3);







    }
}
