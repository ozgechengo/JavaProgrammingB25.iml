package tasks_day38.Device;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price) {
        super(brand, model, price);
    }



    public void carry(){
        System.out.println(getBrand() + " you can carry it to STURBUCKS !! ");
    }
}
