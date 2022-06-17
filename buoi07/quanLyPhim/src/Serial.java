import java.time.LocalDate;
import java.time.LocalTime;

public class Serial extends Film{
    private int Episodes;
    private LocalTime timeAverage;

    public Serial() {
    }

    public Serial(int id, String title, String category, String filmDirector, LocalDate premiereDate, int episodes, LocalTime timeAverage) {
        super(id, title, category, filmDirector, premiereDate);
        Episodes = episodes;
        this.timeAverage = timeAverage;
    }

    public int getEpisodes() {
        return Episodes;
    }

    public LocalTime getTimeAverage() {
        return timeAverage;
    }

    public void setEpisodes(int episodes) {
        Episodes = episodes;
    }

    public void setTimeAverage(LocalTime timeAverage) {
        this.timeAverage = timeAverage;
    }
}
