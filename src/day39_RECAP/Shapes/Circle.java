package day39_RECAP.Shapes;

public class Circle extends Shape{

    public double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadious(radius);
    }


    public double getRadious() {
        return radius;
    }

    public void setRadious(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid Radius " + radius);
            System.exit(1);

        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return  radius*radius * pi;
    }

    @Override
    public double perimeter() {
        return   2* radius *pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=  " + radius +
                "Pi =  " + pi +
                " , Area =  " + area() + '\'' +
                " , Perimeter =  " + perimeter() + '\'' +
                '}';
    }
}