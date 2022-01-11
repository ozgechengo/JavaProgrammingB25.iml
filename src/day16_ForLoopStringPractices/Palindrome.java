package day16_ForLoopStringPractices;

public class Palindrome {
    public static void main(String[] args) {


        String word = "hkjkhk";

        String reversed = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
          if (word.equalsIgnoreCase(reversed)) {
            System.out.println("palindorme");
        } else if (!(word.equalsIgnoreCase(reversed))){
            System.out.println("not palindorm");}


            System.out.println(word);
            System.out.println(reversed);

    }}




