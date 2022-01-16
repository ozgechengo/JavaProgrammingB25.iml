package tasks_day38.Device;

public class Computer extends Device {


    public Computer(String brand, String model, double price) {
        super(brand, model, price);
    }



    @Override
    public void turnOn() {
        System.out.println(getBrand() + " says  BYE ! ");
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public void connecting(){
        System.out.println(" YOU CAN CONNECT THE WORLD NOW ! ");
    }

}

