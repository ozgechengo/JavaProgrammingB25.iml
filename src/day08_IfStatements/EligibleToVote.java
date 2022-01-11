package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; //True

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------------------------");

        String name2       = "Daniel";
        int    age2        = 23 ;    // age must be 21
        int    creditScore = 720 ;  // credit score must be  above 700
        int    income      = 40000 ; //  Income must be above  60000

        boolean  isEligibleForTheLoan  =  creditScore >=720 && age2 >= 21  &&  income >= 60000 ;


        System.out.println(name2+"  is Eligible for the loan = "+isEligibleForTheLoan);

        System.out.println("-------------------------------------------------------------------");
        String  name3  = "Ozge" ;
        int     age3    =  21 ;     //  Age must be above 18
        char    gender = 'F' ;     //  Genger is not importand.


        boolean isEligibleForTheJob  =  age >= 18  && (gender == 'M' ||  gender == 'F' ) ;
        // gender ikiside olabilir. ama
        //  ayri bir islem oldugu icin
        // parantez icinde gosterdik.


        System.out.println("Is   "+ name3+ "   Eligible  for job = " + isEligibleForTheJob);


        System.out.println("-----------------------------------------------------------------");

         String name4               = "Burak " ;
         String countryOfBirth      = "UK" ;
         Boolean marriedToUsCitizen = false ;

         boolean isEligibile4CitizenShip = countryOfBirth == "USA" || marriedToUsCitizen == true;


        System.out.println(name4 + "  is Eligibile for CitizenShip = " + isEligibile4CitizenShip);

    }

}