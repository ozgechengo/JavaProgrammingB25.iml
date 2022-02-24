package DeviceTask;

public abstract class Device {

    private final String brand,model,size;
    private String color;
    private double price;
    private boolean hasBattery,hasPowerButton;

    public Device(String brand, String model, String size, String color, double price, boolean hasBattery, boolean hasPowerButton) {
        if(brand==null || brand.isEmpty() || brand.isBlank()){
            throw new RuntimeException("Brand can not be EMPTY ,NULL OR BLANK");
        }
        this.brand = brand;
        if(model==null || model.isEmpty() || model.isBlank()){
            throw new RuntimeException("MODEL can not be EMPTY ,NULL OR BLANK");
        }
        this.model = model;
        if(size==null || size.isEmpty() || size.isBlank()){
            throw new RuntimeException("SIZE can not be EMPTY ,NULL OR BLANK");
        }
        this.size = size;
        setColor(color);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setColor(String color) {
        if(color==null || color.isEmpty() || color.isBlank()){
            throw new RuntimeException("COLOR can not be EMPTY ,NULL OR BLANK");
        }

        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("INVALID PRICE");
        }
        this.price = price;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return    getClass().getSimpleName()+
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
