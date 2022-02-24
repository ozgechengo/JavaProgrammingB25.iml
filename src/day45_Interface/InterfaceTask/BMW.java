package day45_Interface.InterfaceTask;

public class BMW extends Car{

    public BMW(String model,  int year, double price, String color) {
        super(model,"BMW", year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+ " push the  START  button to start .");

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
    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" needs driver .");

    }
}


