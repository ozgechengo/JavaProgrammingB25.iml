package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {


        // age : 38 years old

        byte age = 38;

         // weight : 160 pounds

        // byte weight = 160   // 160 is bigger than byte' range . out of byte type
        // byte num =  -129 ; // - 129 is out of byte' type

        short  weight = 160 ; //160 is in range of short

        // salary : 1000000 $
        // short salary = 1000000 ;  1000000 is out of short' range

        int salary = 100_000 ; // int is the preffered data type for integer numbers

        long asset = 3_333_333_333L;

     // tax:0.26

        float tax = 0.26F ;

        double PI = 3.14;

          //#
        char ch1 = '#';
        System.out.println("ch1 = "+ch1);
        char  ch2 = 35 ;
        System.out.println("ch2 = " + ch2 );

        char ch3 = 35000;
        System.out.println("ch3 =" +ch3);

        char ch4 = 15000 ;
        System.out.println( "ch4 =" +ch4);

        char ch5 = 36 ;
        System.out.println("ch5 = " + ch5);
        char  ch6 = 67;
        System.out.println("ch6 = " + ch6 );


      Boolean  isemployeed = true ;

         char yesNo  = 'Y' ;

         String name = " Wooden Spoon";
         String city = " McLean " ;
         String state = " Virginia" ;
         String country = "USA ";


    }
}