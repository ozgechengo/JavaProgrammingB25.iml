package day01_12_04;

public class removeDuplicate {


    public static void main(String[] args) {



        String str="axaasssddd";
        String result="";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
           String ch =""+ str.charAt(i);
               if (!result.contains(ch)) {


                result += ch;
            }
        }
            System.out.println(result+""+count);
}}