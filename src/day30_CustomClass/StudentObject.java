package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {


        Student student1=new Student();

        student1.setInfo("OZGE",'F',42,12133123,'A');

        System.out.println(student1);


        System.out.println("---------------------------------------------------");


        Student student2=new Student();
        student2.setInfo("BURAK",'M',16,233331,'A');

        Student student3=new Student();

        student3.setInfo("BERK",'M',8,454434,'C');


        Student student4=new Student();

        student4.setInfo("CIHAN",'M',41,3434,'F');

        Student student5=new Student();

        student5.setInfo("HIKMET",'F',70,23213,'B');



        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);


    }


}