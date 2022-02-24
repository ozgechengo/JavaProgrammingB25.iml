package DeviceTask;

public class Desktop extends Computers{
    public Desktop(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, color, price, hasBattery, hasPowerButton);
    }


    @Override
    public void turnOn() {


    }

    @Override
    public void turnOff() {

    }
}
