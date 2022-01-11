package tasks_day35;



public class Carpet {
   private double width;
   private double length;
   private double unitPrice;
   private boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setLength(length);
        setWidth(width);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
           return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            System.out.println("INVALID NUMBER");
            System.err.println(0);
        }
        this.length=length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        this.isPersian = persian;
    }


    public double calCost( ) {
        if (isPersian) {
            return  200+(width * length) * unitPrice;
        } else {
            return (width * length) * unitPrice;
        }}
        public String toString() {
            return "Carpet{" +
                    "width=" + width +
                    ", length=" + length +
                    ", unitPrice=" + unitPrice +
                    ", isPersian=" + isPersian +
                    ", Total Cost=" + calCost() +
                    '}';
        }


    public static void main(String[] args) {

        Carpet carpet1=new Carpet(2 ,2,200,true);

        System.out.println(carpet1);
        System.out.println(carpet1.getLength());
        System.out.println(carpet1.getWidth());
        System.out.println(carpet1.isPersian());
        System.out.println(carpet1.calCost( ));







    }
}

