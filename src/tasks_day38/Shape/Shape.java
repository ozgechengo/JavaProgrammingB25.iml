package tasks_day38.Shape;

public class Shape {

    private  String name;



    public Shape(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        if(name==null || name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name:"+ name);
            System.exit(1);
        }
        this.name = name;
    }





    public double area(){
        return  0;

    }
    public double perimeter(){
        return 0;


    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
