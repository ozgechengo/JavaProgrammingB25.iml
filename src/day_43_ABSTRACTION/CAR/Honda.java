package day_43_ABSTRACTION.CAR;

public class Honda extends car  {

    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void stop() {
        System.out.println("");
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }



}
