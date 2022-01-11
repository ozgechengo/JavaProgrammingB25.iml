package task1;

public class Cheff {

    public String name;
    public int  employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Cheff{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ",is  your cheff fullTime ? : " +fullOrPart() +
                '}';
    }
    public void makeOrder(){
        System.out.println(  name + "is making an order");
    }
    public void washDishes() {
        System.out.println(name + "is washing the dishes");
    }
     public String fullOrPart(){
        String fullOrPart = (fullTime)? "full-time" : "part-time";

        return fullOrPart;
    }


}
