package day05_Concatenation;

import java.sql.SQLOutput;

public class OzgeDenemeler {
      public static void main(String[] args) {


            int burakGozluk = 210;
            int burakDisci = 159;
            int burakOyun = 20;
            int burakGezi = 1950;
            int burakHarclik = 350;
            int burakGelir = 3250 ;
            int burakToplamGider = burakDisci + burakGezi + burakGozluk + burakOyun + burakHarclik;
            int burakBakiye = burakGelir - burakToplamGider;

            System.out.println("BurakGozluk = $" + burakGozluk+ "\nBurakDisci = $ " +burakDisci+ "\nBurakOyun = $ "+burakOyun+ "\nburakHarclik = $ " +burakHarclik + "\nburakgezi = $" +burakGezi+ "\nBurakGelir =  $"+burakGelir+ "\nBurakToplamGider = $" +burakToplamGider+ "\nBurakBakiye = $" + burakBakiye  );


      }
}