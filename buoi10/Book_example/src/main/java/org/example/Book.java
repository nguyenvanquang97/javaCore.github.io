package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    @SerializedName("page_number")
    private int pageNumber;
    @SerializedName("release_year")
    private int releaseYear;




}