package tasks_day38.Device;

public class MyDevices {

    public static void main(String[] args) {




       TV device1 = new TV(" ", "HEBELE", 1222.33);
        System.out.println(device1);
       Phone device2 = new Phone("Apple", "13XL  ", 991.23);

       Desktop device3 = new Desktop("IMAC", " CHS", 2115.32);

       Samsung device4 = new Samsung("SAMSUNG","ZIBIRT",1234.67); // input 0 and -15  -> output : Invalid Price

        Laptop device5 = new Laptop("ASUS","H400",1300);
        System.out.println(device4);
        device5.carry();
        device4.turnOff();
        device3.playGames();
        device5.connecting();
        device1.channelUp();



    }
}

