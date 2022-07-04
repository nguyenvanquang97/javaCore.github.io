import java.time.LocalDate;

public class Serial extends Film{
    private int episodes;
    private int timeAverage;

    public Serial() {
    }

    public Serial(int id, String title, String category, String filmDirector, LocalDate premiereDate, int episodes, int timeAverage) {
        super(id, title, category, filmDirector, premiereDate);
        this.episodes = episodes;
        this.timeAverage = timeAverage;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int getTimeAverage() {
        return timeAverage;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setTimeAverage(int timeAverage) {
        this.timeAverage = timeAverage;
    }

    @Override
    public String toString() {
        return super.toString()+" - "+ episodes+ " tập"+ " - "+timeAverage+ " phút";
    }
}