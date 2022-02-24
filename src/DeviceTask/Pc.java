package DeviceTask;

public class Pc extends Computers{
    public Pc(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {
        System.out.println(" is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(" turned off");
    }
}
