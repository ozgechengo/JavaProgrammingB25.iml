package day37_Inheritance.Phone;

public class Iphone extends Phone {
    public Iphone(String brand, String model, char size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public  void facetime(long number){
        System.out.println("You have call from : "+ number);

    }
    public  void facetime(String email){
        System.out.println("You have an email from : "+ email);


    }}
