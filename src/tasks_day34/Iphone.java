package tasks_day34;

public class Iphone {


    public int model;
    public String size;
    public double price;

    public static String brand;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

     static {
     brand="Iphone";
     OS="IOS";
     isSmartPhone=true;
     madeIn="USA";
     designedIn="USA";

     }

    public Iphone(int  model,String size, double price) {
        this.model = model;
        this.size = size;
        this.price = price;
    }

    public String toString() {
        return "Iphone{" +
                "model=" + model +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public void printOperatingSystem() {
        System.out.println("Your operating system is " + OS);

    }

    public void call(long phoneNumber){
     System.out.println(phoneNumber +" is calling ");
    }
     public void text(long phoneNumber){
        System.out.println("You have text from : " +phoneNumber);
     }

    public void facetime(long phoneNumber){
        System.out.println("You have facetime call from : "+ phoneNumber);

    }
    public void facetime(String email) {
        System.out.println("You have an email from :  " + email);


    }


    public static void main(String[] args) {

         Iphone phone=new Iphone(13,"XL",1090.4);
         Iphone phone2=new Iphone(14,"PLUS",1080.4);
         Iphone phone3=new Iphone(12,"XL",1000.4);
         Iphone phone4=new Iphone(11,"XPLUS",1180.4);
        System.out.println(phone3);
        System.out.println("Is it  a smart phone ? "+isSmartPhone);
        System.out.println("Your phone designed in : "+ designedIn);
        System.out.println("Your phone made in : "+ madeIn);

        phone2.printOperatingSystem();

      phone.call(3333333);
      phone2.text(4444444);
      phone3.facetime("xxxxx@gmail.com");
      phone4.facetime(7777777);




    }
}






/*


1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */