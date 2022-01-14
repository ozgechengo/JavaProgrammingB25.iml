package day38_Inheritance.Employee;

public class ProductOwner extends Employee{


    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }


    @Override
    public void work() {
        System.out.println("Is doing putting  user stries on BackLog");


    }
}
