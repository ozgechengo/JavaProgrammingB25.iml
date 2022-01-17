package tasks_day38.ScrumTeam;

public class ProductOwner extends Employee{


    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void role(){
        System.out.println(getName()+ ", "+ " role is to represent the customer to the development team.");
    }

    @Override
    public String toString() {
        return "Product Owner { " +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "ID=" + getId() +
                ", salary=" + getSalary() +
                ", companyName='" + getJobTitle() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +

                '}';
    }
}


