package day45_Interface.Shape;

public class Sphere extends Shape implements Volume {

    public Sphere(String name) {
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
