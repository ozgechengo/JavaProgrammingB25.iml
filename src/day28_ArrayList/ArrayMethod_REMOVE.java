package day28_ArrayList;

import java.util.ArrayList;

public class ArrayMethod_REMOVE {                  //removes the element that number given
    public static void main(String[] args) {       // size degrees everytime you remove

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(1);

        System.out.println(employees);

        employees.remove( employees.size() -1 );

        System.out.println(employees);

        boolean r1 = employees.remove("Hulya");

        System.out.println(employees);

        boolean r2 = employees.remove("Neira");

        System.out.println(employees);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------------------");


            ArrayList<Integer> list = new ArrayList<>();
            list.add(100);
            list.add(200);
            list.add(200);
            list.add(200);
            list.add(300);
            list.add(400);
            list.add(500);

            System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
*/
            Integer num = 2000;
            //list.remove(200);
            boolean r = list.remove(num);

            System.out.println(list);
            System.out.println(r);

            System.out.println("-----------------------------------------");

            System.out.println(list.size());

            list.clear();

            System.out.println(list.size());

            System.out.println(list);




        }


    }
