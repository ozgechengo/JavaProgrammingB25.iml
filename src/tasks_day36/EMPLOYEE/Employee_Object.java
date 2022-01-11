package tasks_day36.EMPLOYEE;

public class Employee_Object {
    public static void main(String[] args) {

        Developer developer=new Developer();
        developer.setInfo("JACK",'M',32,1231,"DEV",145.434);
        Driver driver =new Driver();
        driver.setInfo("OKKES",'M',42,12121,"DRIVER",65.233);
        Tester tester=new Tester();
        tester.setInfo("AYSE",'F',35,2121,"TESTER",96.232);
        Teacher teacher=new Teacher();
        teacher.setInfo("AYLA",'F',45,434,"TEACHER",87.232);


        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);



        driver.driving();
        driver.work();
        developer.coding();
        developer.fixingBugs();
        developer.work();
        tester.testing();
        tester.work();
        tester.creatingTicket();
        teacher.teaching();
        teacher.work();










    }



}
