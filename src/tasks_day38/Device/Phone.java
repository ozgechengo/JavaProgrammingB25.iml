package tasks_day38.Device;

public class Phone extends Device{


    public Phone(String brand, String model, double price) {
        super(brand, model, price);
    }




        @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() +"  is  ON !");
    }

    @Override
     public void turnOff() {
        System.out.println(getBrand()+ " says BYE ");
    }


   public void call(Long number) {
        System.out.println(number + "  is calling  ");

    }

    public void text(Long number) {
        System.out.println("You have text from   =  " + number);


    }
}


