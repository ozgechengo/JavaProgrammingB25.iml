package day45_Interface.InterfaceTask;

public abstract class Car {
    private final String model;
    private final String make;
    private final int year;
    private double price;
    private String color;

    public Car(String model, String make, int year, double price, String color) {
        setColor(color);
        setPrice(price);


        if (make.isBlank() || make.isEmpty() || make==null) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
            this.make=make;



        if (model.isBlank() || model.isEmpty() || model==null) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
        this.model = model;

        if (year < 1886) {
            throw new RuntimeException("Invalid Year: " + year);
        }
        this.year = year;


    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }

        this.price = price;
    }



    public void setColor(String color) {
        if (color.isBlank() || color.isEmpty() || color==null) {
            throw new RuntimeException("Name cannot be empty or blank");
        }
            this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return getClass().getSimpleName() +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void start();
    public abstract void drive();

    private void stop(){
        System.out.println(model+ " has stopped !");
    }

}



/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

					If invalid arguments are given for setting the instances, then manually throw an exception

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */