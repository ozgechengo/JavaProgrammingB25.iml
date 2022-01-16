package tasks_day38.Device;

public class Iphone extends Phone {

    private double releaseDate;

    public Iphone(String model, double price ) {
        super("Iphone", model, price );
        setReleaseDate(releaseDate);
    }

    public double getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(double releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void facetime(long number){
        System.out.println(getBrand() + " " + getModel() + " you have faceTime call from  " + number);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                ", releaseDate=" + releaseDate +
                '}';
    }

}




/*


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes




 */