package org.example.Model;

import java.time.LocalDate;

public class Movie extends Film{
    private int time;

    public Movie() {
    }

    public Movie(String title, String describe, String[] category, LocalDate premiereDate, int view, int time) {
        super(title, describe, category, premiereDate, view);
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +" - "+ time+" phút";
    }

}
