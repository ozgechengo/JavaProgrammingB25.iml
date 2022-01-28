package day41_Exceptions;


import tasks_day38.ScrumTeam.Employee;

public class Multi_Catch_Blocks {
    public static void main(String[] args) {

        Employee employee=null;


        try {

            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
           e.printStackTrace();
        }catch (ArithmeticException e){

            System.out.println("Secong catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");






        }



    }
}
