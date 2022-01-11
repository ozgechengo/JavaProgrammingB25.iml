package NewYearTasks;

import java.util.Arrays;

public class Phone {

    public  String model;
    public  double price;
    public  String color;
    public  String size;

    public Phone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +

                '}';
    }
    public void faceTime(long number){
        System.out.println(number+"is calling ");

    }
    public void faceTime(String email){
        System.out.println("you have email from  "+email);
    }
    public void call(long number){
       System.out.println(number+"is calling ");
   }
   public void text(long number){
       System.out.println("You have a text from  "+number);
   }

    public static void main(String[] args) {

        Phone phone1=new Phone("IPHONE",999.99,"pink","MAX");
        Phone phone2=new Phone("Samsung",898.99,"blue","plus");
        Phone phone3=new Phone("Huawei",799.99,"pink","XL");

        Phone [] phones={phone1,phone2,phone3};

        System.out.println(Arrays.toString(phones));

        phone1.color="green";

        System.out.println(Arrays.toString(phones));

         phone1.faceTime("xxxxxx@gmail.com");
         phone2.faceTime(232323232);
         phone1.call(232232233);
         phone2.text(232323232);

    }
}
