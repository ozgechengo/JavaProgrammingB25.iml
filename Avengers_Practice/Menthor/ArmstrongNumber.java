package Menthor;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongNumber {
    public static void main(String[] args) {
        armstrongCheck(153);
        armstrongCheck(370);
        armstrongCheck(371);
        armstrongCheck(0);
        armstrongCheck(15);

    }
    public static void armstrongCheck(int a){ // a= 371  , means  (3*3*3) + (7*7*7) + (1*1*1) = 375
        String value=""+a;  // we  create a String from number to split them.
        int total=0   ,  temp=0;

        ArrayList<String> list = new ArrayList<>(Arrays.asList(value.split("")));

        for (String each : list) {
            temp=Integer.parseInt(each);  //i turned them into number with wrapper class

            total+=temp+temp+temp;
        }
        if(a==total){
            System.out.println(a+" is an Armstrong number");
        }else{
            System.out.println(a+" is not Armstrong number");
        }

    }


}
