package DeviceTask;

public class Iphone extends Phones implements AppleApps {
    public Iphone(String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, size, color, price, hasBattery, hasPowerButton);
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
    public String toString() {
        return super.toString() +
                ", appStoreName=" + AppsStore +
                ", os=" + OS
                + '}';
    }

    public void faceTime(long number) {
        System.out.println(getBrand() + " " + getModel() + " is Face Timing" + number);
    }


    @Override
    public void downloadAble() {
        System.out.println(getBrand()+" " +getModel()+"can download application ");

    }
}
//Iphone :
//extends Phone class and implements Downloadable & AppleApps interfaces