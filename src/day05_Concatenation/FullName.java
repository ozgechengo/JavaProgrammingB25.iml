package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName   = "OZGE" ;
        String lastName    = " SENGOCEN";
        String fullName    = firstName +"" +lastName ;
        int    age         = 42 ;
        String jobTittle   = "SDET" ;
        String companyName = "APPLE" ;
        double salary      = 100000.58 ;



        // Full name of the person is ________
        // ___ is ___ years old .

        System.out.println("Full name of the person is "  +fullName+ "." );
        System.out.println(fullName + " is " +age+ " years old.");
        System.out.println(fullName+ " is " +jobTittle+ " and she works at " +companyName + ".");
        System.out.println(fullName+ "'s salary is $ " + salary + " . And she lived happly ever after.");





    }


}
