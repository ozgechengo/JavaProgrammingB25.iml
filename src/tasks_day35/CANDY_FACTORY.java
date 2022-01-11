package tasks_day35;

import java.util.ArrayList;
import java.util.Arrays;

public class CANDY_FACTORY {

    public static void main(String[] args) {

    Candies candy1=new Candies("HARRIBO",3,3.2,false);
    Candies candy2=new Candies("Hershey's",7,0,false);
    Candies candy3=new Candies("BUTTERFINGERS",5,1.9,true);
    Candies candy4=new Candies("SNICKERS",4,1.9,true);
    Candies candy5=new Candies("NESTLE",2,3.4,true);

        ArrayList<Candies> CANDYFAC=new ArrayList<>();

        CANDYFAC.addAll(Arrays.asList(candy1,candy2,candy3,candy5));

        for (Candies candies : CANDYFAC) {
                    System.out.println(candies);

        }

        }

        }





/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */
