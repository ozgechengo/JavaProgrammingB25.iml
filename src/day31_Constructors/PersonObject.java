package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

         Person  person1=new Person("OZGE",'F',42);
         Person  person2=new Person("Cihan",'M',41);
         Person  person3=new Person("Ksenia",'F',38);

         person2.gender='F';

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
