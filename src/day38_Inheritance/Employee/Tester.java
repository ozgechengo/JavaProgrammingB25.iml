package day38_Inheritance.Employee;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);


    }

    @Override
    public void work() {
        System.out.println(name+"  is  testing");


    }

    public void createTicket() {

        System.out.println(name + "is creating ticket ");

    }
}