package day45_Interface.Shape;

public class Cylinder extends Shape implements  Volume{
    public Cylinder(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double Volume() {
        return 0;
    }
}
