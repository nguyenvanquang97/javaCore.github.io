public class Book {
    public int id;
    public String tittle;
    public String description;
    public String author;
    public int year;

    public Book(int id, String tittle, String description, String author, int year) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.author = author;
        this.year = year;
    }

    public Book(){
        System.out.println("contructor mặc định");

    }
}
