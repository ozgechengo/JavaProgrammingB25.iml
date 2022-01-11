package day35_Encapsulation.encapsulation;

public class Carpet {
    private double width;
    private  double length;
    private double unitPrice;
    private  boolean isPersian;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }


    public void setWidth(double width) {
        if(width <=0){
            return;
        }
        this.width = width;
    }

    public void setLength(double length) {
        if(length <=0){
            return;
        }
        this.length = length;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice <=0 )
            this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(width);
        setPersian(isPersian);
    }

    public double calcCost (){

        if( isPersian){
            return  200 + (width*length)*unitPrice ;

        }
        else{
            return  (width*length)*unitPrice ;

        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total Cost=" + calcCost() +
                '}';
    }

    public static void main(String[] args) {
        Carpet carpet=new Carpet(2.3,3,123,true);

    }
}