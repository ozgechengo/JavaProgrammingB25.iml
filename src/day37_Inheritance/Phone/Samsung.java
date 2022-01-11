package day37_Inheritance.Phone;

public class Samsung extends Phone {


    public Samsung(String brand, String model, char size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public  void freeze(){
         System.out.println(" Your phone izz freezingg  !!  " );
     }


}
