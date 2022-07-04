import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Film {
    private int id;
    private String title;
    private String category;
    private String filmDirector;
    private LocalDate premiereDate;

    public Film() {
    }

    public Film(int id, String title, String category, String filmDirector, LocalDate premiereDate) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.filmDirector = filmDirector;
        this.premiereDate = premiereDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public LocalDate getPremiereDate() {
        return premiereDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public void setPremiereDate(LocalDate premiereDate) {
        this.premiereDate = premiereDate;
    }

    @Override
    public String toString() {
        return id + " - "+title+" - "+ category+ " - "+ filmDirector+ " - "+premiereDate;
    }
}