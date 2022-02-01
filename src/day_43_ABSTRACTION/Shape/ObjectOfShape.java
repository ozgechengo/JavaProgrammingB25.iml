package day_43_ABSTRACTION.Shape;

public class ObjectOfShape {
    public static void main(String[] args) {


        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(3, 4);
        Square square = new Square(2);

        System.out.println("===================================================");

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

        System.out.println("===================================================");
        square.area();
        rectangle.area();
        rectangle.setLength(4.5);
        square.setSide(4);

        System.out.println("===================================================");


        System.out.println("area: " + rectangle.area());
        System.out.println("perimeter: " + rectangle.perimeter());
        System.out.println("perimeter: " + square.perimeter());
        System.out.println("area  : " + square.area());
        System.out.println("area  : " + circle.area());
        System.out.println("perimeter: " + circle.perimeter());


    }
}
