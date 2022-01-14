package day39_RECAP.Shapes;

public class Shape {


    private String  name;



    public void setName(String name) {
        if(name==null) {
            System.err.println("Name can not be Null");
            System.exit(0);

        }
        if (name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid Name");
            System.exit(1);
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }




    public Shape(String name) {
        setName(name);
    }


    public String toString() {
        return "Shape{" +
                "Name='" + name + '\'' +
                " , Area='" + area() + '\'' +
                " , Perimeter='" + perimeter() + '\'' +
                '}';
    }

    public double area(){

        return 0;
    }

    public double perimeter(){


        return 0;
    }
}
