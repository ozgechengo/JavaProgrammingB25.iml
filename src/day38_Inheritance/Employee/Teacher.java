package day38_Inheritance.Employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }


    @Override
    public void work() {
        System.out.println("Is  teaching");


    }




    public void teaching() {
        System.out.println("Is doing putting  user stries on BackLog");


    }
}
