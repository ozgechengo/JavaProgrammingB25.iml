package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {


        Tester tester1 = new Tester("OZGE", 34, "QA", 110000);
        Tester tester2 = new Tester("ALI", 43, "SDET", 142000);
        Tester tester3 = new Tester("ALEX", 25, "SE", 135000);
        Tester tester4 = new Tester("LAYA", 89, "SDET", 115000);

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("OLGA", 46, "DEV", 158000);
        Developer developer2 = new Developer("BUSRA", 37, "DEV", 127000);
        Developer developer3 = new Developer("MERVE", 72, "DEV", 136000);
        Developer developer4 = new Developer("ZEHRA", 65, "DEV", 145000);

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Mehmet", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("----------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);

        }

        System.out.println("----------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper + " : " + eachDeveloper.salary);
        }

        scrum.removeTester(43);


        System.out.println(scrum);
    }
}