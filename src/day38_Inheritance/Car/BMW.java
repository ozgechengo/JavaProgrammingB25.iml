package day38_Inheritance.Car;

public class BMW extends Car {


    public BMW(String model, String color, int year, double price, double miles) {
        super("BMW", model, color, year, price, miles);
    }

    public void breaksDown() {

        System.out.println(brand + " is always breaksdown !");
    }

    public void racing() {

        System.out.println(brand + "is racing !!!");
    }

    @Override
    public void start() {
        System.out.println("You have to call your mechanic to start your " + brand);
    }
}