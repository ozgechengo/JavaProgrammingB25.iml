package interview;

public class FrequencyOfAnElement {

    public static void main(String[] args) {

          String str="adlskjksdla";
          char   ch='s';

        System.out.println(frequecy(str,ch));
    }

    public static int frequecy(String str , char ch ){


           int count =0;


        for (int i = 0; i <str.length() ; i++) {

            if(ch==str.charAt(i)){
                count++;
            }
        }

        return count;
    }

}
///*
//Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
//            Ex:
//                inputs:
//                    str = "aabcccd";
//                    char = 'c';
//
//                output: 3
//
//                inputs:
//                    "Java programming language"
//                    'g'
//
//                output: 4
// */
