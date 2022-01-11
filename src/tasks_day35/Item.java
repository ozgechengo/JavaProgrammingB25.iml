package tasks_day35;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()) {
            return;
        }
        this.name = name;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 32 && name.charAt(i) <= 65) {
                return;
            }
        }



        if (!((name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')
                    || (name.charAt(0) >= 'a' && name.charAt(0) <= 'z'))) {
                return;
            }

        }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        }
        if (name.equalsIgnoreCase("toilet paper")) {
            quantity = 1;
        }
        this.quantity = quantity;
    }

    public double calCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", unitPrice= $" + unitPrice + ", quantity=" + quantity + ",Total Cost= $" + calCost() + '}';
    }

    public static void main(String[] args) {
        Item shop = new Item("bread", 2.3, 3);


        System.out.println(shop);
        System.out.println(shop.calCost());
    }
}