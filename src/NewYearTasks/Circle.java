package NewYearTasks;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;


    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = radius * 2;

    }

    public double calcArea() {
        double area = radius * radius * pi;
        return area;
    }

    public double calcPremiter() {
        double perimeter = diameter * pi;
        return perimeter;
    }

    public static double printPi() {
        return pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPremiter() +
                '}';
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(1.2, 1.4);

        System.out.println(circle1);
    }
}


/*
HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement



 */