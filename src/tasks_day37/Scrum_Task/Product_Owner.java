package tasks_day37.Scrum_Task;

public class Product_Owner extends Employee_two {
    public Product_Owner(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID,"Product Owner", salary, companyName);
    }

    public void role(){
        System.out.println(name+ ", "+ " role is to represent the customer to the development team.");
    }


    }

