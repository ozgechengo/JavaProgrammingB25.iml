package task1;

public class Carpet {
    public double width, length, unitprice;
    public boolean isParsian;

    public Carpet(double width, double length, double unitprice, boolean isParsian) {
        this.width = width;
        this.length = length;
        this.unitprice = unitprice;
        this.isParsian = isParsian;
    }


    public String toString() {
        return "Carpet{" +
                "width =" + width +
                ", length =" + length +
                ", unitprice =" + unitprice +
                ", Is your carpet is  Parsian ?    " + isParsian +
                ",  Your total is  = " + calCoast() +
                '}';
    }

    public double calCoast() {
        if (isParsian) {
            return (width * length) * unitprice + 200;
        } else {
            return (width * length) * unitprice;


        }
    }
}




 /*  calcCost(): should be able to caculate the total cost of the carpet and return it as double
  toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */