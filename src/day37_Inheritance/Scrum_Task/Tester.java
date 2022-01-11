package day37_Inheritance.Scrum_Task;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender, jobTitle, iD, salary, companyName);
    }





    public void createTicket(){

        System.out.println(jobTitle+ " "+name+"is creating ticket " );
    }


    public String toString() {
        return "Tester{" +
                "jobTitle='" + jobTitle + '\'' +
                ", iD=" + iD +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
