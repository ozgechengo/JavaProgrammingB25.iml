package day38_Inheritance.Employee;

public class Employee {

    public String name;
    public int age ;
    public char gender;
    public int id;
    public String jobTitle;
    public double salary ;
    public String company;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.company = company;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", JobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }


    public void  work(){
        System.out.println(name+" is working ");


    }
}
