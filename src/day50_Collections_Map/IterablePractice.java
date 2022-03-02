package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {


    public static void main(String[] args) {


        List<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3,4,5,4,3,5,3,3,5));

        for (int i= 0; i <list.size() ; i++) {
            if(list.get(i)<4){
                list.remove(i);
        }

        }

        System.out.println(list);



        List<Integer> list2 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3,4,5,4,3,5));


        Iterator<Integer> it=list2.iterator();

        boolean r1=it.hasNext();

        while (it.hasNext()){
           if( it.next()<4){
               it.remove();
           }

        }

        System.out.println(list2);

        List<Integer> list3 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3,4,5,4,3,5));


        for ( Iterator<Integer> it2=list3.iterator(); it2.hasNext();) {
            if (it2.next() < 4) {
                it2.remove();
            }
        }
            System.out.println(list3);


        List<Integer> list4 =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,5,4,3,4,5,4,3,5));


          list4.removeIf(each-> each < 4);

        }



    }

