package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String description;
    private String category;
  @SerializedName("director ")
    private String director;

    @SerializedName("release_year")
    private int releaseYear;

    @Override
    public String toString() {
        return id +" - "+title+" - "+description+" - "+category+
                " - "+director+" - "+releaseYear;
    }
}