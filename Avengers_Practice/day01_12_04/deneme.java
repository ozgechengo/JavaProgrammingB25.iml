package day01_12_04;

public class deneme {

    public static void main(String[] args) {
       int count=countYZ("sdasdasydzzz");

        System.out.println(count);


    }

    public static   int countYZ(String str) {
            int count=0;

      //     for (int i =0; i <str.length() ; i++) {
               char ch = str.charAt(str.length() - 1);


            if((ch=='z' || ch=='y' ) && ( Character.isLetter(ch)==true)){
                count++;

        }

        return count;
    }

        }






 /*   Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in
 "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     We'll say that a y or z is at the end of a word if there is not an alphabetic letter
            immediately following it.
            (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)*/