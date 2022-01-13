package day38_Inheritance.Car;

public class BMW extends Car {


    public BMW(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void breaksDown() {

        System.out.println(brand + " is always breaksdown !");
    }

    public void racing() {

        System.out.println(brand + "is racing !!!");
    }
}