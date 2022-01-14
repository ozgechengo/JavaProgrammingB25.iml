package day38_Inheritance.Employee;

public class BussinessAnalyst extends Employee {
    public BussinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary, String company) {
        super(name, age, gender, id, jobTitle, salary, company);
    }

    @Override
    public void work() {
        System.out.println(name+"is  analising");
    }
    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }



}


