

package org.example.Service;

import org.example.Model.Film;
import org.example.Model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;

public class MovieService {

    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> arrMovie = new ArrayList<>();
        ArrayList<Film> arrayList=new ArrayList<>();
        arrMovie.add(new Movie("Bố già","Phim Việt Nam",new String[]{"Tâm lý","Hài"}, LocalDate.of(2020,12,3),15000,180));
        arrMovie.add(new Movie("Đề thi đẫm máu","Phim Trung Quốc",new String[]{"Tâm lý","Trinh thám","Kinh dị"}, LocalDate.of(2015,7,3),35000,180));
        arrMovie.add(new Movie("Ánh sáng thành phố","Phim Trung Quốc",new String[]{"Tâm lý","Trinh thám"}, LocalDate.of(2015,8,3),20000,160));
        arrMovie.add(new Movie("Avenger:End game","Phim Mỹ",new String[]{"Hành động","Viễn tưởng","Chuyển thể"}, LocalDate.of(2020,1,1),100000,240));
        arrMovie.add(new Movie("Trạng Tí","Phim Việt Nam",new String[]{"Chuyển thể","Hài"}, LocalDate.of(2022,1,1),18000,180));
        return arrMovie;
    }
}

