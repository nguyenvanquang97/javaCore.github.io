import java.time.LocalDate;
import java.time.LocalTime;

public class Movie extends Film{
    private LocalTime time;

    public Movie() {
    }

    public Movie(int id, String title, String category, String filmDirector, LocalDate premiereDate, LocalTime time) {
        super(id, title, category, filmDirector, premiereDate);
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
