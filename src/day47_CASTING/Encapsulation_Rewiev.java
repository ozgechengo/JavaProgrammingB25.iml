package day47_CASTING;

public class Encapsulation_Rewiev {



    private  String  BookTitle;
    private  final  String publishDate;

    public Encapsulation_Rewiev(String bookTitle, String publishDate) {
       setBookTitle(bookTitle);
        this.publishDate = publishDate;
    }


    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
