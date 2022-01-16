package tasks_day38.Device;

public class Nokia extends Phone{
    public Nokia(String brand, String model, double price) {
        super(brand, model, price);
    }



    public void selfDefence(){
        System.out.println(getModel()+ " can protect you  !!!");
    }

}
