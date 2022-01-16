package tasks_day38.Device;

public class Device {

    private String brand;
    private String model;
    private double price;
    private static boolean hasBattery=true;
    private static boolean hasPowerButton=true;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null || brand.isEmpty()||brand.isBlank()){
            System.err.println("INVALID BRAND NAME");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null || model.isEmpty()||model.isBlank()){
            System.err.println("INVALID BRAND NAME");
            System.exit(1); }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("INVALID PRICE");
            System.exit(1);
        }
        this.price = price;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(brand+ " is turning on ! ");

    }

    public void turnOff(){
        System.out.println(brand+ " is turning  off ! ");

    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", has battert =" + hasBattery +
                ", has power button =" + hasPowerButton +
                ", price=" + price +
                '}';
    }
}


