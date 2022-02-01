package day_43_ABSTRACTION.Shape;

public   class Square extends Shape {
    private  double side;

    public Square( double side) {
        super("Square");
       setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side ");}
        this.side = side;
    }


    @Override
    public double area() {
        return side* side;
    }

    @Override
    public double perimeter() {
        return side *4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                "area ='" + area() + '\'' +
                "perimeter  ='" + perimeter() + '\'' +
                ", side=" + side +
                '}';
    }
}
