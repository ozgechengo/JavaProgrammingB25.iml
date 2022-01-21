package tasks_day38.Shape;

public class Square extends Shape{

    private double side;

    public Square(String name ,double side) {
        super("Square");
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return getSide() * getSide();

    }

    @Override
    public double perimeter() {
        return  getSide() * 4 ;
    }


    @Override
    public String toString() {
        return  "Square{" +
                "Side  ='" + getSide() + '\'' +
                "Area  ='" +  area() + '\'' +
                "Perimeter  ='" +  perimeter() + '\'' +
                '}';
    }
}



