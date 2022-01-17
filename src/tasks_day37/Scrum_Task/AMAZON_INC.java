package tasks_day37.Scrum_Task;

import java.util.Arrays;

public class AMAZON_INC {
    public static void main(String[] args) {

   String company ="GoogleInc";






        Tester tester1=new Tester("OZGE",42,'F',23,"SDET",125000,company);
        Tester tester2=new Tester("BERK",21,'M', 3233,"QA",130000,company);
        Tester tester3=new Tester("BURAK",19,'M',323,"SDET",128000,company);
        Tester tester4=new Tester("CiHAN",36,'F',545,"QA",125000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};



        Developer developer1=new Developer("MEHMET", 34, 'M', 112, "Senior Java Developer", 180000, company);
        Developer developer2=new Developer("AHMET", 48, 'F', 43, "Junior Java Developer", 120000, company);
        Developer developer3=new Developer("TARIK", 62, 'M', 322, "Java Developer", 140000, company);
        Developer developer4=new Developer("MURAT", 45, 'M', 323, "Full Stack Developer", 280000, company);
        Developer developer5=new Developer("FATMA", 50, 'F', 232, "JS Developer", 160000, company);

        Developer[] developers={developer1,developer2,developer3,developer4,developer5};


        Product_Owner pro = new Product_Owner("Suhaib", 29, 'M',1,160000, company);

        Bussiness_Analiysist ban = new Bussiness_Analiysist("Cihad", 30, 'M', 2, 150000, company);

        Scrum_Master sm = new Scrum_Master("Anel", 26, 'F', 3, 145000, company);

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