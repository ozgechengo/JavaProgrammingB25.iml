package DeviceTask;

public class Samsung extends  Phones implements  AndroidApps{
    public Samsung(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super("SAMSUNG", model, size, color, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " turns on with a power button");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " turns off with a power button");

    }

    @Override
    public void downloadAble() {
        System.out.println(getBrand()+" " +getModel()+"can download application ");

    }

}
