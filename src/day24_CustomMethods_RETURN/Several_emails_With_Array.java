package day24_CustomMethods_RETURN;

public class Several_emails_With_Array {
    public static void main(String[] args) {

         String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

         for (String email : emails) {
             domain(email);



        }  }
 public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);




    } }
