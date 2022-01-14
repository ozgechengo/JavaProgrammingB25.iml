package day37_Inheritance.Scrum_Task;

public class ProductOwner extends Employee {


    public ProductOwner(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender,"Product Owner", iD, salary, companyName);
    }

}
