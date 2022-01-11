package day29_ArrayList;

import java.util.ArrayList;

public class MIN_NUMBER {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(5);

        int min=list.get(0);

        for (Integer each : list) {
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);



    }
}

