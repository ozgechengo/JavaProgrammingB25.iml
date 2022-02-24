package day45_Interface.Shape;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return   "name ='" + getName() + '\'' +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}

