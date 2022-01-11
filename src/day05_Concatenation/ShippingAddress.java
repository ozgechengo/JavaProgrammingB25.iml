package day05_Concatenation;

public class ShippingAddress {


    public static void main(String[] args) {
        /*
        String name = "James";
        String buildingNumber = "1123B";
         */


        String name = "Ozge Sengocen",
                buildingNumber = "945",
                streetName = "Cherringham Court",
                city = "Johns Creek",
                state = "GA",
                zipCode = "30005";

       /*
        String name = "James King";
        String buildingNumber = "11821B";
        String  streetName = "Jones Branch Dr";
        String city = "McLean";
        String state = "VA";
        String zipCode = "22031A";
        */

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city +", " + state +" " + zipCode );


    }

}

/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */


