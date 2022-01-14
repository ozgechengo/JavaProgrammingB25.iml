package day37_Inheritance.Scrum_Task;

public class BusinessAnalyst extends Employee {
    public BusinessAnalyst(String name, int age, char gender, String jobTitle, int iD, double salary, String companyName) {
        super(name, age, gender,"Bussiness Analyst", iD, salary, companyName);
    }



    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }



}
