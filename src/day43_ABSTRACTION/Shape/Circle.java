package day43_ABSTRACTION.Shape;

public   class Circle extends Shape {

    private double radius;
    private final   double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
         setRadius(radius);
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area =" + area()+
                " perimeter" + perimeter()+
                ", name='" + name + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius can not be less than zero");
        }

        this.radius = radius;
    }


    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}

