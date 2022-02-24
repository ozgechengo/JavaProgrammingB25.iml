package Tasks_day45;

import day38_Inheritance.Car.BMW;
import day38_Inheritance.Car.Car;
import day38_Inheritance.Car.Tesla;
import day38_Inheritance.Car.Toyota;
import day43_ABSTRACTION.Person.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carshop {


    public static void main(String[] args) {


        Car[] cars = {
                new Toyota("Highlander", "pink", 2010, 25000, 25500),
                new BMW("X5", "WHITE", 2014, 32000, 12000),
                new Toyota("Corolla", "Red", 2021, 20000, 31000),
                new BMW("M3", "Blue", 2022, 32222, 14030),
                new BMW("M5", "Black", 2019, 32021, 15000),
                new BMW("M4", "White", 2019, 20203, 19000),
                new BMW("7 Series", "Purple", 2022, 23333, 21000),
                new BMW("i3", "RED", 2020, 32333, 9000),
                new Toyota("Camry", "NEON", 2020, 32322, 185000),
                new Toyota("Rav4", "BLUE", 2019, 42442, 285000),
                new Toyota("Avalon", "YELLOW", 2010, 32323, 175230),
                new Tesla("Model 3", "ORANGE", 2015, 43434, 235000),
                new Tesla("Model Y", "BROWN", 2017, 78733, 135000),
                new Tesla("Model X", "GRAY", 2016, 23234, 235000),
                new Tesla("Model X", "SOLMON", 2014, 34434, 236000)};


        List<Car> BMW = new ArrayList<>();
        List<Car> TESLA = new ArrayList<>();
        List<Car> TOYOTA = new ArrayList<>();
        List<Car> eligibleforrecall = new ArrayList<>();
        List<Car> allcars = new ArrayList<>();
        allcars.addAll(Arrays.asList(cars));

        double lowestmilages = allcars.get(0).miles;
        double highestmilages = allcars.get(0).miles;
        String highestmilagesCar = "";
        String lowestmilagesCar = "";


        for (Car every : cars) {
            if (every instanceof BMW)
                BMW.add(every);
            if (every instanceof Toyota)
                TOYOTA.add(every);
            if (every instanceof Tesla)
                TESLA.add(every);


            if (every.brand.equalsIgnoreCase("toyota") && (every.year >= 2010 && every.year <= 2011)) {
                eligibleforrecall.add(every);
            }
            if (every.brand.equalsIgnoreCase("bmw") && (every.year >= 1929 && every.year <= 2022)) {
                eligibleforrecall.add(every);
            }
            if (every.brand.equalsIgnoreCase("tesla") && (every.year >= 2015 && every.year <= 2016))
                eligibleforrecall.add(every);


            if (every.miles < lowestmilages) {
                lowestmilages = every.miles;
                lowestmilagesCar = lowestmilages + " " + every.brand;
            }
            if (every.miles > highestmilages) {
                highestmilages = every.miles;
                highestmilagesCar = highestmilages + " " + every.brand;
            }
        }

        System.out.println("----------    CARS  BY MILAGE   ----------");
        System.out.println(" Lowest  milage  car is " + lowestmilagesCar + " with milage of " + lowestmilages);
        System.out.println(" Highest  milage  car is " + highestmilagesCar + " with milage of " + highestmilages);
        System.out.println("---------- RECALLS ----------");
        System.out.println(eligibleforrecall);
        System.out.println("We have   " + eligibleforrecall.size() + " cars   for RECALL ! ");
        System.out.println("---------- HOW MANY CARS  WE HAVE ----------");
        System.out.println("We have  " + BMW.size() + "  BMW  ");
        System.out.println("We have  " + TOYOTA.size() + "  TOYOTA  ");
        System.out.println("We have  " + TESLA.size() + "  TESLA  ");
        System.out.println("----------  WHICH CARS WE HAVE  ----------");
        System.out.println(BMW);
        System.out.println(TESLA);
        System.out.println(TOYOTA);
        System.out.println("----------   All Cars    ----------");
        System.out.print(allcars);

    }
}
