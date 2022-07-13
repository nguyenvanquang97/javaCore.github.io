package org.example.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Util;

import java.time.LocalDate;
import java.util.Arrays;



@NoArgsConstructor
@Getter
@Setter
public class Film {
    private String id;
    private String title;
    private String slug;
    private String describe;
    private String[] category;
    private LocalDate premiereDate;
    private int view;

    public Film( String title,String describe, String[] category, LocalDate premiereDate, int view) {
        this.id = Util.generateId(5);;
        this.title = title;
        this.slug = Util.VNCharacterUtils.removeAccent(title).replaceAll(" ","-");
        this.describe = describe;
        this.category = category;
        this.premiereDate = premiereDate;
        this.view = view;
    }

    @Override
    public String toString() {
        return id + " - "+title+" - "+slug+" - "+ Arrays.toString(category) +" - "+premiereDate+" - "+view;
    }
}
