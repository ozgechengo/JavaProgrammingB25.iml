package day45_Interface.InterfaceTask;

public class Honda extends Car {

    public Honda(  String model, int year, double price, String color) {
        super( model,"HONDA" , year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+ " turn the key  to start.");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+"  needs driver . ");
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
