package day45_Interface.InterfaceTask;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String model, int year, double price, String color) {
        super(model, "Mercedes", year, price, color);
    }


    @Override
    public void start() {
        System.out.println(getMake() + " " + getModel() + " " + " has voice control .");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " " + " can go by itself .");
    }


    @Override
    public void autoPark() {
        System.out.println(getMake() +" "+ getModel() + "  can park by itself .");


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

