package tasks_day37.Scrum_Task;

public class Bussiness_Analiysist extends Employee_two {

    public Bussiness_Analiysist(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID,"Bussiness Analyst", salary, companyName);
    }

    public void analyze(){
        System.out.println(name+ " is analyzing the documents");
    }

    public String toString() {
        return "Bussiness_Analiysist{" +
                "ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
