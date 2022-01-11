package tasks_day36.BOOK;

public class AudioBook extends Book{

    public double length;
    public String narrator;

    public AudioBook(String title, String type, String author, double price) {
        super(title, type, author, price);


            this.narrator=narrator;
            this.length=length;
        }


    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }



    public void listen(){

        System.out.println("You are listening "+title +" from  "+ narrator );
    }



}
