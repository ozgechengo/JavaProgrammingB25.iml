package day38_Inheritance.Car;

public class Tesla extends Car {

    public Tesla(String model, String color, int year, double price, double miles) {
        super("TESLA", model, color, year, price, miles);
    }


    public void autoPilot() {
        System.out.println(brand + "is driving by itself ! ");


    }

    @Override
    public void start() {
        System.out.println("You have say 'START' to start your  " + brand);
    }
}