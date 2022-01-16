package tasks_day38.Person;

public class StudentClass {

    public static void main(String[] args) {


        CydeoStudent cydeo = new CydeoStudent("Bulent Ersoy", 76, 'M', 33, "ENGINEERING", 'A', "CYDEO", 68, 25,"JAVA");

        System.out.println(cydeo.getProgrammingLanguage());
        System.out.println(cydeo.getStudentId());

        cydeo.setGender('F');
        cydeo.sleep();
        cydeo.drink();
        cydeo.eat();
        System.out.println(cydeo);



        System.out.println("=============================================");

        GraduatedStudent graduated = new GraduatedStudent("SEZEN AKSU", 62, 'F', 1, "ART ", 'A', "UCLA");

        graduated.study();
        graduated.eat();
        graduated.drink();

        System.out.println(graduated);
        System.out.println(graduated.getAge());
        System.out.println(graduated.getName());
        System.out.println(graduated.getGender());




        System.out.println("-----------------------------------------------");

        Student student = new Student("AYSE  YILMAZ", 21, 'F',111, "MATH", 'B', "GEORGIA TECH");
        student.setName("OZGE BEKTAY");
        student.study();
        student.drink();
        student.sleep();
         System.out.println(student.getGrade());
         System.out.println(student);



        System.out.println("====================================================================================================");
        UnderGraduatedStudent under = new UnderGraduatedStudent("TARIK AKAN", 68, 'F', 418, "IT", 'A', "NYU");
        under.eat();
        under.setAge(70);
        under.study();
        under.drink();
        System.out.println(under);

        System.out.println(under.getSchoolName());




    }
}



