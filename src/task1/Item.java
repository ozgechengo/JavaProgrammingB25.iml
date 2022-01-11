package task1;

public class Item {

    public String name;
    public double unitPrice;
    public int  quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "Item{" +
                "name ='" + name + '\'' +
                ", unitPrice =" + unitPrice +
                ", quantity =" + quantity +
                ", Your total =" + calcCost() +
                '}';
    }
    public double calcCost(){

        return unitPrice* quantity;
    }
}




/*

                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()

 */