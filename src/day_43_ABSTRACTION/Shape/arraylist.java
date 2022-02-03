package day_43_ABSTRACTION.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {

    public static void main(String[] args) {

        Circle circle = new Circle(4.5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 8);

        ArrayList<Shape> listOFShapes = new ArrayList<>(Arrays.asList(circle, square, rectangle));

        // System.out.println("listOFShapes = " + listOFShapes);

        for (Shape each : listOFShapes) {
            System.out.println("Area of " + each.getName() + " " + each.area());
            System.out.println("Perimeter of " + each.getName() + " " + each.perimeter());
        }

        double min = Double.MAX_VALUE;
        for (Shape each : listOFShapes) {
            if (min > each.area()) {
                min = each.area();
            }
        }
        System.out.println("min = " + min);

    }
}