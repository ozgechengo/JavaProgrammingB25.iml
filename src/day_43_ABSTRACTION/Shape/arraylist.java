package day_43_ABSTRACTION.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {


    Circle circle = new Circle(1);
    Rectangle rectangle = new Rectangle(3, 4);
    Square square = new Square(2);


    ArrayList<Shape>list=new ArrayList<>(Arrays.asList(square,circle,rectangle));





}}
