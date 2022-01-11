package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BULK_operators {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,4,4,9,5,6,4,5,6,6,4,7,8,9,0,3,4,5,6,7));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,4,5));   //removes ALL 3 4 5

        System.out.println(list);

        list.retainAll(Arrays.asList(9));

        System.out.println(list);


        System.out.println("----------------------------------------------");
        ArrayList<String> Jobtitles=new ArrayList<>();

        Jobtitles.addAll(Arrays.asList("Doctor","Lawyer","Qa","Sdet","BA","Developer"));

        Jobtitles.removeAll(Arrays.asList("Lawyer"));

        System.out.println(Jobtitles);

        System.out.println("---------------------------------------------------------------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll( Arrays.asList(2, 5, 10, 1000) );

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);



        System.out.println("---------------------------------------------------------");



         String [] names={"ozge","burak","berk","anne","baba"};
        ArrayList<String> namesList=new ArrayList<>(Arrays.asList(names));


         namesList.addAll(Arrays.asList(names));



        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("-----------------------------------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }





}




