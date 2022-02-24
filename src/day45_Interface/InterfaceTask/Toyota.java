package day45_Interface.InterfaceTask;

public class Toyota  extends Car{


    public Toyota(String model , int year, double price, String color) {
        super(model, "TOYOTA", year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+getModel()+ " turn the key to start.");

    }

    @Override
    public void drive() {
        System.out.println(getMake()+getModel()+"needs driver . ");
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

