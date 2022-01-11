package tasks_day36.BOOK;

public class Book_Object {

    public static void main(String[] args) {

        AudioBook abook=new AudioBook("Kurtlarla Kosan Kadinlar","Non Fiction","JANNY MIDDLE ",19.22);


        Ebook ebook=new Ebook("Kurtlarla KOsan Kadinlar","Non Fiction"," janny middle",23.4);

        ebook.read();
        abook.listen();


        System.out.println(abook);
        System.out.println(ebook);


    }
}
