import java.time.LocalDate;
import java.time.LocalTime;

public class Book {
    public String id;
    public String title;
    public String author;

    public String category;
    public String publishingCompany;
    public int year;


    public Book() {
    }

    public Book(String id, String title, String author, String category, String publishingCompany, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publishingCompany = publishingCompany;
        this.year = year;
    }
}
