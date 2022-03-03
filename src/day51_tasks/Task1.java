package day51_tasks;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        Map< String,Integer> students = new Hashtable<>();
        students.put("OZGE",90);
        students.put("George",60);
        students.put("Jack",95);
        students.put("Emma",76);
        students.put("Fatma",89);
        students.put("Isabella",78);


        System.out.println(students.keySet());// gives  only keys , WHICH IS STRING in that case


        Set<String> keys  =students.keySet();  // sadece key leri almak icin olusturduk
        for (String each : keys) {
            Integer  value =students.get(each);
       if(value<90){
           students.remove(each);
       }

            System.out.println(students);



        }

                 System.out.println(students);





        }
}


/*
1. create a map that can contain student name and student' score
            put 5 of your friends names and their scores
            print out the names of the students who made less than 80
 */
