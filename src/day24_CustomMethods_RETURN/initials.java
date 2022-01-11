package day24_CustomMethods_RETURN;

import java.util.Locale;

public class initials {
    public static void main(String[] args) {

        initials("ozge","sengocen");
  }

    public static void initials(String name,String lastname ) {

         String nameinitials=name.charAt(0)+"."+lastname.charAt(0)+".";

        System.out.println(nameinitials.toUpperCase(Locale.ROOT));

    }
}
