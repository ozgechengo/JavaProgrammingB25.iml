package tasks_day38.ScrumTeam;

public class BussinessAnaliysist extends Employee{




    public BussinessAnaliysist(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void analyze(){
        System.out.println(getName()+ " is analyzing the documents");
    }

    @Override
    public String toString() {
        return "Bussiness Analiysist { " +
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




/*
5. Create a sub class of EMployee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have


 */
