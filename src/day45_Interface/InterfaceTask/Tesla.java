package day45_Interface.InterfaceTask;

public class Tesla extends  Car implements AutoPilot ,AutoPark {



    public Tesla(String model,  int year, double price, String color) {
        super(model,"TESLA", year, price, color);
    }
    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" "+" can park itself");

    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" "+" has self drive.");
    }


    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" "+" has voive control.");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" "+" can go by itself .");
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
