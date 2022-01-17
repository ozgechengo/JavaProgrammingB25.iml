package tasks_day38.ScrumTeam;

import java.util.Arrays;

public class GoogleInc {


        public static void main(String[] args) {

            String company = "Google Inc";

            ProductOwner po = new ProductOwner("ozge", 29, 'M', 1, "PO", 123.44);
            BussinessAnaliysist ba = new BussinessAnaliysist("Berk", 30, 'M', 2, "BA", 234.111);
            Scrum_Master sm = new Scrum_Master("BURAK", 26, 'M', 3, "SM", 323.121);


            Tester tester1 = new Tester("ozge", 42, 'F', 5654, "SDET", 123.415);
            Tester tester2 = new Tester("berk", 23, 'F', 233, "QE", 142.316);
            Tester tester3 = new Tester("burak", 22, 'F', 122, "SDET", 128.000);
            Tester tester4 = new Tester("ayse", 22, 'F', 132, "SDET", 128.000);
            Tester tester5= new Tester("nilufer", 46, 'F', 32, "SDET", 128.000);


            Tester[] testers = {tester1, tester2, tester3 };


            Developer developer1 = new Developer("Mehmet", 40, 'M', 1213, "Senior Java Developer", 3665);
            Developer developer2 = new Developer("Fatma", 18, 'F', 2323, "Junior Java Developer", 364.232);
            Developer developer3 = new Developer("Tarik", 26, 'M', 432, "Java Developer", 140.000);
            Developer developer4 = new Developer("MESE", 56, 'M', 435, "Java Developer", 140.000);
            Developer developer5 = new Developer("NESE", 36, 'M', 436, "Java Developer", 140.000);


            Developer[] developers = {developer1, developer2, developer3, developer4,developer5  };

            System.out.println("EKLENEN   ARRAY ");
            Scrum_Team scrumTeam = new Scrum_Team(po,ba,sm);
            scrumTeam.addDevelopers(developers);
            //scrumTeam.addDeveloper(developer1);
            //scrumTeam.addTesters(testers);
            //scrumTeam.addDeveloper(developer1);
            System.out.println(scrumTeam);

            System.out.println("==========remove=========");


            System.out.println(Arrays.toString(developers));
            System.out.println(Arrays.toString(testers));
            scrumTeam.removeTester(132);

            System.out.println(scrumTeam);
            System.out.println(tester4);

            System.out.println("--------- added developer ---------------");

            System.out.println(scrumTeam);
            scrumTeam.addDeveloper(developer5);
            scrumTeam.addTester(tester5);
            System.out.println(scrumTeam);


            System.out.println(scrumTeam);



            System.out.println("-----------get salary tester ----------------------");

            for (Tester tester : scrumTeam.getTesters()) {
                System.out.println(tester.getName() + " : " + tester.getSalary());
            }

            System.out.println("--------  get salary   developer  ------------------------");

            for (Developer developer : scrumTeam.getDevelopers()) {
                System.out.println(developer.getName() + " : " + developer.getSalary());
            }
        }}

