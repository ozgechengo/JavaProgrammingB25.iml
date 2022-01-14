package day38_Inheritance.Employee;

public class ScrumMaster extends Employee {
    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }


    @Override
    public void work() {
        System.out.println("Is hosting the meeting");


    }



}
