package day45_Interface.InterfaceTask;

public class Audi extends Car implements AutoPark {



    public Audi(String model,  int year, double price, String color) {
        super(model,"AUDI", year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " push the button to start .");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " " + getModel()+"  needs driver .");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+"  can park by itself .");

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


