package NewYearTasks;

public class Car {
    public double make;
    public String model;
    public String color;
    public int year;
    public double price;

    public static int numberofWheels=4;
    public static boolean hasSeats=true;
    public static boolean hasBattery=true;

    public Car(double make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }


    public String toString() {
        return "Car{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", does it has   " + numberofWheels +" wheels"+
                ", does it have  seats " +hasSeats +
                ", does it have  battery " +hasBattery +
                ", price=" + price +
                '}';
    }
    public void drive(){

        System.out.println(model+ " is driving ");
    }

    public static void main(String[] args) {

        Car car1=new Car(12.34,"AUDI","Pink",2021,132.323);

        car1.drive();
        System.out.println(car1);

    }
}
