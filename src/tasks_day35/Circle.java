package tasks_day35;

public class Circle {

    private double radius;
    public static double pi = 3.14;


    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Can not be negative number ");
        }
        this.radius = radius;
    }


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }


    public double calcArea() {
        return radius * radius * pi;
    }

    public double calPerimeter() {
        return radius * 2 * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calPerimeter() +
                '}';
    }

    public static void main(String[] args) {

        Circle circ1 = new Circle(6);
        System.out.println(circ1);

        circ1.calPerimeter();
        System.out.println(circ1.calcArea());
        System.out.println(circ1.getRadius());
        System.out.println(circ1.calPerimeter());
        System.out.println(circ1.radius);
        System.out.println(circ1.toString());

    }
}

/*

2. Create a class named Circle

            privtae variables:
                radius

            public variable:
                pi

             Encapsulate all the private fields

                     1. radius of the circle can not be zero or negative

             Add a constructor that can set the raidus of coircle when circle object is created

             Methods:
                 calcArea()
                 calcPerimeter()
                 toString()
 */