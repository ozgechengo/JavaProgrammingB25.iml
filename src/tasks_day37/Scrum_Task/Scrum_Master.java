package tasks_day37.Scrum_Task;

public class Scrum_Master extends Employee_two {

    public Scrum_Master(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID," SCRUM MASTER", salary, companyName);
    }

    public void coaching(){

        System.out.println(jobTitle+" "+name+ "is coaching the team.");

    }


    public String toString() {
        return "Scrum_Master{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
