package Tasks_day45;

import day43_ABSTRACTION.Person.Developer;
import day43_ABSTRACTION.Person.Employee;
import day43_ABSTRACTION.Person.Tester;

import java.util.ArrayList;
import java.util.List;

public class Emplooyee {


    public static void main(String[] args) {


        Employee[] myEmployees = {new Tester("Sherali", 32, 'M', 1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28, 'M', 3, "SDET", 95000),
                new Developer("Cristina", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Developer("Gulistan", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Yuliya", 28, 'F', 7, "QE", 120000),
                new Developer("Cassendra", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Aygu", 25, 'F', 9, "SDET", 133000),
                new Developer("Sophie", 26, 'F', 10, "Back-end Developer", 155000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Developer("Fady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Developer("Enes", 26, 'M', 14, "Full Stack Developer", 98000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000)};


        List<Employee> scrumTeam = new ArrayList<>();
        List<Employee> myDevelopers = new ArrayList<>();
        List<Employee> myTesters = new ArrayList<>();


        for (Employee each : myEmployees) {
            scrumTeam.add(each);
        }

        for (Employee each : myEmployees) {

            if (each.getClass().getSimpleName().equalsIgnoreCase("Tester")) {
                myTesters.add(each);
            }

            if (each.getClass().getSimpleName().equalsIgnoreCase("Developer"))
                myDevelopers.add(each);
        }


        double minsalary = myDevelopers.get(0).getSalary();
        for (Employee eachSalary : myDevelopers) {


            if (eachSalary.getSalary() < minsalary) {
                minsalary = eachSalary.getSalary();
            }
        }


        double maxsalary = myDevelopers.get(0).getSalary();
        for (Employee eachSalary : myDevelopers) {


            if (eachSalary.getSalary() > maxsalary) {
                maxsalary = eachSalary.getSalary();
            }
        }


        double minsalaryTESTER = myTesters.get(0).getSalary();
        for (Employee eachSalary : myTesters) {


            if (eachSalary.getSalary() < minsalaryTESTER) {
                minsalaryTESTER = eachSalary.getSalary();
            }
        }


        double maxsalaryTESTER = myTesters.get(0).getSalary();
        for (Employee eachSalary : myTesters) {


            if (eachSalary.getSalary() > maxsalaryTESTER) {
                maxsalaryTESTER = eachSalary.getSalary();
            }
        }


        System.out.println(myTesters);
        System.out.println(myDevelopers);
        System.out.println(scrumTeam);
        System.out.println("Min Salary in DEVELOPERS TEAM  " + minsalary);
        System.out.println("MAX SALARAY in DEVELOPERS TEAM " + maxsalary);
        System.out.println("Min Salary in TESTERS TEAM  " + minsalaryTESTER);
        System.out.println("MAX SALARAY in TESTERS TEAM " + maxsalaryTESTER);


    }


}




