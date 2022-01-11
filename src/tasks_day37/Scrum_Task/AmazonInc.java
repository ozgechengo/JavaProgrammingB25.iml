package tasks_day37.Scrum_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

   String company ="AmazonInc";


         Product_Owner pro = new Product_Owner("Suhaib", 29, 'M',1,160000, company);

        Bussiness_Analiysist ban = new Bussiness_Analiysist("Cihad", 30, 'M', 2, 150000, company);

        Scrum_Master sm = new Scrum_Master("Anel", 26, 'F', 3, 145000, company);




        Tester tester1=new Tester("Chinara",32,'F',23,"SDET",125000,company);
        Tester tester2=new Tester("Yasaman",31,'F', 3233,"QA",130000,company);
        Tester tester3=new Tester("Irena",29,'F',323,"SDET",128000,company);
        Tester tester4=new Tester("Cihad",26,'M',545,"QA",125000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};



        Developer developer1=new Developer("Max", 40, 'M', 112, "Senior Java Developer", 180000, company);
        Developer developer2=new Developer("Allison", 18, 'F', 43, "Junior Java Developer", 120000, company);
        Developer developer3=new Developer("Tom", 26, 'M', 322, "Java Developer", 140000, company);
        Developer developer4=new Developer("Manas", 40, 'M', 323, "Full Stack Developer", 280000, company);
        Developer developer5=new Developer("Evelyn", 30, 'F', 232, "JS Developer", 160000, company);

        Developer[] developers={developer1,developer2,developer3,developer4,developer5};



       Scrum_Team scrumTeam = new Scrum_Team(pro,ban, sm);


       scrumTeam.addDeveloper(developer1);
       scrumTeam.addDevelopers(developers);

       scrumTeam.addTester(tester1);
       scrumTeam.addDevelopers(developers);

       scrumTeam.removeDeveloper(112);
       scrumTeam.removeTesters(545);


        System.out.println(tester1.name);
        System.out.println(developer2.salary);
        System.out.println(developer1.age);
         System.out.println(Arrays.toString(developers));
        System.out.println(Arrays.toString(testers));
        System.out.println(tester1);
        System.out.println(developer1);


    }

}

/*








 */