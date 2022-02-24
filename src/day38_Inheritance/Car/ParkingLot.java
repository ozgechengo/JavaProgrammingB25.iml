package day38_Inheritance.Car;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "YELLOW", 2000, 45.666, 23456);

        Tesla tesla = new Tesla("Model S", "PINK", 2022, 123.444, 0);

        BMW bmw = new BMW("X5", "GRAY", 2021, 73.44, 12000);


        System.out.println(bmw);
        System.out.println(tesla);
        System.out.println(toyota);

        toyota.start();
        bmw.start();
        tesla.start();
        System.out.println(tesla.year);



    }

}

