package day37_Inheritance.Scrum_Task;

public class BussinessAnalyst extends Employee {
    public BussinessAnalyst(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender,"Bussiness Analyst", iD, salary, companyName);
    }


    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }



}
