package day45_Interface.InterfaceTask;

public class Nio  extends  Car implements AutoPilot,AutoPark{


    public Nio(String model,  int year, double price, String color) {
        super(model, "NIO", year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" "+" can park itself");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" "+"  has  self drive.");
    }


    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" "+"  has voice control.");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" "+" has auto pilot.  .");


    }
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel()+ '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }

}

