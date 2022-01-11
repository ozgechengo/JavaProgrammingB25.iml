package day30_CustomClass;

import java.util.ArrayList;

public class X5_NUMBERSLETTERSDigits {
    public static void main(String[] args) {

        String str="ABCD123$%#@&456EFG!";


        ArrayList<Character>chars=new ArrayList<>();


        for (int i = 0; i <str.length(); i++) {   // String i char a cevirip her kelimeyi aldim.
            chars.add((str.charAt(i)));           // chars a ekledim.

        }
        ArrayList<Character>letters=new ArrayList<>(chars); // BUTUN KARAKTERLERI EKLEDIM.
        letters.removeIf(p-> !Character.isLetter(p));

        System.out.println(letters);

        ArrayList<Character>digits=new ArrayList<>(chars); // BUTUN KARAKTERLERI EKLEDIM.
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character>special=new ArrayList<>(chars); // BUTUN KARAKTERLERI EKLEDIM.
        special.removeAll(letters);
        special.removeAll(digits);
        System.out.println(special);






    }
}
