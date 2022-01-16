package tasks_day38.Device;

public class TV extends Device{
    public TV(String brand, String model, double price) {
        super(brand, model, price);

    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ " is on NOW ! ");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+ " says GOOD BYE !! ");
    }

    public void  channelUp(){
        System.out.println(getModel() + " can change  channels by voice  !  ");
    }

    public void  channelDown(){
        System.out.println(getModel() + " can chanell down  channels by voice  !  ");
    }

}
