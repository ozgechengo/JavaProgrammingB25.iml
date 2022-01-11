package day11_Switch_Scanner;

public class CappucinoBuyer {
      public static void main(String[] args) {
          double coffee1  = 3.69 ;
          double coffee2= 3.99 ;
          double coffee3= 4.29 ;

          String coffeeSelection = "tall";


       boolean selection = (coffeeSelection == "tall" || coffeeSelection== "venti" ||
                                           coffeeSelection == "grand"   )  ;

      if(selection) {
            switch (coffeeSelection){
                  case "tall" :
                        System.out.println(coffee1 + " TALL  = 90 calories");
                  break;
                  case  "venti" :
                        System.out.println(coffee2+  " VENTI = 120 calories");
                  break;
                        default:
                        System.out.println(coffee3+  " GRANDE = 150 calories");}
      }else  {
                  System.out.println("INVALID SELECTION");
            }
}}