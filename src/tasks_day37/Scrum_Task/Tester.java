package tasks_day37.Scrum_Task;

public class Tester extends Employee_two {



    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, "SDET", salary, companyName);



    }

    public String toString() {
        return "Tester{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void createTicket(){
        System.out.println(name+ " is creating ticket");
    }
}
