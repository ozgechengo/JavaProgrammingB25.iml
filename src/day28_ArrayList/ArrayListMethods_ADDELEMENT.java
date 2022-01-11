package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_ADDELEMENT {
    public static void main(String[] args) {

        ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(10);  // index 0
        numbers.add(20);  //index 1
        numbers.add(30);   // index 2
        numbers.add(40);  // index 3
        numbers.add(50);  // index 4


         numbers.add(0,70);
         numbers.add(1,70);  //   index 1
         numbers.add(2,70);  //   index 2
         numbers.add(4,70);   //   index 4
         numbers.add(3,70);  //   index 3
         numbers.add(5,70);  //   index 5


        System.out.println(numbers);
    }
}
//istedigin kadar ekleyebilirsin .
//her eklemende listen olusur.


