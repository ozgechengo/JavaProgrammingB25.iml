package day24_CustomMethods_RETURN;

public class email {
    public static void main(String[] args) {
         domain("ozgesengocen@gmail.com");
    }

    public static void domain(String email) {
        
    String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf('.'));

        System.out.println(domain);

    }
}
