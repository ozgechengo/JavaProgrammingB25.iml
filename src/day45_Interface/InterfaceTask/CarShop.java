package day45_Interface.InterfaceTask;

public class CarShop {
    public static void main(String[] args) {

        CydeoCar car1=new CydeoCar("XHS ",2022,123.444,"NEON");
        Honda    car2=new Honda("HN33",2028,78.232,"WHITE") ;
        Tesla    car3=new Tesla("001",2029,123.442,"BLACK");
        BMW      car4=new BMW("M99",2032,98.233,"PINK")     ;
        Mercedes car5=new Mercedes("CLX",2035,129.333,"YELLOW");
        Nio      car6=new Nio("JNT",2028,123.443,"BROWN");
        Audi     car7=new Audi("QX99",2030,234.555,"CHANGEABLE");
        Toyota   car8=new Toyota("A",2027,78.333,"RED");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        System.out.println(car7);
        System.out.println(car8);



        car1.fly();
        car2.drive();
        car3.drive();
        car4.start();
        car4.drive();
        car5.autoPark();
        car5.autoPark();
        car6.selfDrive();
        car7.start();
        car8.drive();


    }
}
