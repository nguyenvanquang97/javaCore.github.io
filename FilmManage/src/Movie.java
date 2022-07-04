import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Movie extends Film{
    private int time;

    public Movie() {
    }

    public Movie(int id, String title, String category, String filmDirector, LocalDate premiereDate, int time) {
        super(id, title, category, filmDirector, premiereDate);
        this.time = time;
    }

    public Movie(int id, String title, String category, String filmDirector, Date premiereDate) {
    }

    public Movie(int id, String title, String category, String filmDirector, LocalDate premiereDate) {
    }

    public Movie(int id, String tittle, String category, String filmDirector, LocalDate premiereDate, int episodes, int timeAverage) {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +" - "+ time+" phút";
    }
}