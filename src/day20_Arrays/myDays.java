package day20_Arrays;
import java.util.Arrays;

public class myDays {
    public static void main(String[] args) {

        String[] mydays ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

         int number=1;
         if(number<1||number>7){
             System.out.println("Invalid ");
         }

        System.out.println( mydays[1]);


    }
}
