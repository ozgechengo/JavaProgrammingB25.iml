package tasks_day35;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth(double width ){
        return width;
    }
    public double getLength(double length){
        return length;

    }


    public void  setLength(double length){
        if(length<0){
            System.out.println("INVALID");
            System.err.println(0);

        }
      this.length=length;
    }
    public void setWidth(double width){
        if(width<0){
            System.out.println("INVALID");
            System.err.println(0);
        }
        this.width=width;
        }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +" "+
                ", perimeter=" + calcPerimeter() +
                '}';
    }


    public double calcArea(){
       return  width*length;

    }
    public double calcPerimeter(){
        return 2*(width+length);


    }

    public static void main(String[] args) {
        Rectangle rec1=new Rectangle(1.2,3.4);

        System.out.println(rec1);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

    }
}





/*

Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length

				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area,
					and perimeter of rectangle when object is passed in print statement
 */