package day43_ABSTRACTION.Shape;

public   class Rectangle extends Shape {

    private double length,width;

    public Rectangle(double length , double width) {
        super("Rectangle");
        setWidth(width);
        setLength(length);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("Length can not be less than zero ");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width<=0){
        throw new RuntimeException("Width "); }
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return  2 * (length+width);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "area =" + area() +
                " perimeter =" + perimeter() +
                "length =" + length +
                ", width =" + width +
                ", name ='" + name + '\'' +
                '}';
    }
}
