package day32_Constructors;

public class CarObject {
    public static void main(String[] args) {

        Car car1=new Car("Toyota");
        Car car2=new Car("AUDI","rav4");
        Car car3=new Car("BMW","M3",2022);
        Car car4=new Car("LEXUS","RX350",2122,345.333);
        Car car5=new Car("TESLA","MODEL2",2022,345.535,"PINK");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
}}
