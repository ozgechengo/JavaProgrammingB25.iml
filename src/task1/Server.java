package task1;


public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ",Is your server  fullTime  ? : " + fullOrPart() +
                '}';
    }

    public void takeOrder() {
        System.out.println(name + "is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + "is cleaning the table");

        }
    public String fullOrPart(){
        String fullOrPart = (fullTime)? "full-time" : "part-time";

        return fullOrPart;
    }

    }

