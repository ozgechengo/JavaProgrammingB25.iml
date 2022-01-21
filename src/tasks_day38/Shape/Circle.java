package tasks_day38.Shape;

import java.util.concurrent.Callable;

public class Circle extends Shape {

    private double radius;

    private static double pi = 3.14;


    public Circle(String name, double radius) {
        super("Circle");
        setRadius(radius);
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public  double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }

        this.radius = radius;
    }

@Override
    public double area() {
        return getRadius()* getRadius()* getPi();
    }

@Override
    public double perimeter() {
        return 2 * getRadius()* getPi();
    }


    @Override
    public String toString() {

        return "Circle {" +
                "Radious   ='" + getRadius() + '\'' +
                "Pi  =  '" + getPi() + '\'' +
                "Area  =  '" +  area() + '\'' +
                "Perimeter =  " +  perimeter() + '\'' +

                '}';
    }
}

