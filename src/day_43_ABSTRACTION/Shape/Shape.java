package day_43_ABSTRACTION.Shape;

public abstract class Shape {

    public String name;

    public Shape(String name) {
        this.name = name;
    }


    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
        this.name = name;
    }
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }




    public abstract double area();


    public abstract double perimeter();




}
