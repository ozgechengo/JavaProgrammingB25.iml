package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;




    public void setInfo(String carbrand, String carmodel, String carcolor, int caryear, double carprice) {
        brand = carbrand;
        model = carmodel;
        year = caryear;
        color = carcolor;
        price = carprice;


    }
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
    public void drive(){
        System.out.println("Driving "+brand+" "+ model);


    }
    public void start(){
        System.out.println(brand+" "+model+" "+"has started.");}

    public void stop(){
        System.out.println(brand+" "+model+" "+" has stopped.");
    }

}
