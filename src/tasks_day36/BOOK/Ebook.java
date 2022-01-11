package tasks_day36.BOOK;

public class Ebook extends Book {

    public char size;
    public int  pages;

    public Ebook(String title, String type, String author, double price) {
        super(title, type, author, price);
        this.size=size;
        this.pages=pages;
    }

    public void setInfo(char size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void read(){
        System.out.println(title + "is a MUST READ BOOK ! ");

    }

    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}
