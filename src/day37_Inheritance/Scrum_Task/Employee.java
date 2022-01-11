package day37_Inheritance.Scrum_Task;

public class Employee extends Person {

    public String jobTitle;
    public int iD;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.iD = iD;
        this.salary = salary;
        this.companyName = companyName;
    }



    public void work(){

        System.out.println(jobTitle + " "+ name+ " is working");
    }

    public String toString() {
        return "Employee{" +
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
