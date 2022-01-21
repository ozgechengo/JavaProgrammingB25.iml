package tasks_day38.Shape;

public class Rectangle extends Shape{

    private  double length,width;

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            System.err.println("Invalid Side: "+length);
            System.exit(1);
        }

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            System.err.println("Invalid Side: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return   getWidth() * getLength() ;
    }

    @Override
    public double perimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "Area  ='" +  area() + '\'' +
                "Perimeter  ='" +  perimeter() + '\'' +
                '}';
    }
}
