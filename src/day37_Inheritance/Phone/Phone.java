package day37_Inheritance.Phone;

public class Phone {
    public String brand;
    public String model;
    public char   size;
    public double price;
    public String color;

    public static boolean hasBattery=true;


    public Phone(String brand, String model, char size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                ",has battery =" + hasBattery + '\'' +
                '}';
    }

    public void call(long number){
        System.out.println(number + " is callig");

    }
    public void  text(long number){
        System.out.println("You have a text from :  " +number);
    }
}
