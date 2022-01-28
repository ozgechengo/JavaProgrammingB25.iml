package day40_FinalKeyword;

public class calisma {

    static  int pages;
    static String author;

    static {
        author = "Stephen King";
        pages =500;
    }



    public static void main(String[] args) {

        calisma c = new calisma();



        calisma c2 = new calisma();
        System.out.println(c2.author);
        c.author = "charles";

        System.out.println(c2.author);
        System.out.println(c.author);
        System.out.println(c.author.equals(c2.author));
        System.out.println(c.pages == c2.pages);

    }
}