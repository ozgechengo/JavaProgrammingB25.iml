package day45_Interface.InterfaceTask;

public class CydeoCar  extends  Car implements AutoPark, AutoPilot ,FlyAble {

    public CydeoCar(String model,  int year, double price, String color) {
        super(model,"CYDEO CAR", year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" "+" can park by itself .");


    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" "+" can go by itself .");


    }



    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" "+"starts by voice control.");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" "+" has  driving safe  .");

    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" "+" can FLY .");

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
