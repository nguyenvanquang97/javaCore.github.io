package org.example.Model;

import java.time.LocalDate;

public class Serial extends Film{
    private int episodes;
    private Status status;

    public Serial() {
    }

    public Serial(int episodes, Status status) {
        this.episodes = episodes;
        this.status = status;
    }

    public Serial(String title, String describe, String[] category, LocalDate premiereDate, int view, int episodes, Status status) {
        super(title, describe, category, premiereDate, view);
        this.episodes = episodes;
        this.status = status;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return super.toString()+" - "+ episodes+ " tập"+ " - "+"TÌnh trạng:"+status;
    }
}
