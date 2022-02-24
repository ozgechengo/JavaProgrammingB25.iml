package day45_Interface.Shape;

public class Square extends Shape {

    public Square( double side) {
        super("SQUARE");
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Side can not be NEGATIVE or ZERO ");
        }
        this.side = side;


    }

    @Override
    public double area() {
        return side * side;
    }



    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
