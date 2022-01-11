package day24_CustomMethods_RETURN;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Find_Unique_Character {
    public static void main(String[] args) {

        //
        String str = "jhgjhgjhfjgkjhlk";

        for (int i = 0; i < str.length(); i++) {

            int frequency = frequency(str, str.charAt(i));

            if(frequency == 1){
                System.out.println(str.charAt(i));
            }

        }





    }


    //                              "aaa"      'a'
    public static int frequency(String str, char ch){

        int count = 0;

       for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;
    }






}