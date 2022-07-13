package org.example;

import org.example.Model.Film;
import org.example.Model.Movie;
import org.example.Model.Serial;
import org.example.Service.MovieService;
import org.example.Service.SerialService;
import org.example.Service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MovieService movieService=new MovieService();
        SerialService serialService=new SerialService();
        Service service =new Service();
        Scanner sc =new Scanner(System.in);
        ArrayList<Movie> allMovie=movieService.getAllMovie();
        ArrayList<Serial> allSerial=serialService.getAllSerial();
        ArrayList<Film> allFilm =new ArrayList<>();
        allFilm.addAll(allMovie);
        allFilm.addAll(allSerial);
        while (true){
            Util.menu();
            try {
                System.out.println("Lựa chọn của bọn là:");
                int choose =Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        service.show(allFilm);
                        break;
                    case 2:
                        System.out.println("Nhập tên phim cần tìm:");
                        String fname =sc.nextLine();
                        service.findFilmByName(allFilm,fname);
                        break;
                    case 3:
                        System.out.println("Nhập thể loại phim cần tìm:");
                        String fCategory =sc.nextLine();
                        ArrayList<Film> resultFindFilmByCategory =service.findFilmByCategory(allFilm,fCategory);
                        System.out.println("Tìm được "+resultFindFilmByCategory.size()+" bộ phim:");
                        service.show(resultFindFilmByCategory);
                        break;
                    case 4:
                        System.out.println("Top 3 bộ phim được xem nhiều nhất:");
                        ArrayList<Film> top3FilmMostView=service.top3Film(allFilm);
                        service.show(top3FilmMostView);
                        break;
                    case 5:
                        serialService.completeSerial(allSerial);
                        break;
                    case 6:
                        service.filmInThisYear(allFilm);
                        break;
                    case 7:
                        System.out.println("Nhập các thể loại bạn muốn tìm(Các thể loại cách nhau bởi dấu \",\"):");
                        String fCategories =sc.nextLine();
                        ArrayList<Film> resultFindFilmByCategories =service.findFilmByCategories(allFilm,fCategories);
                        System.out.println("Tìm được "+resultFindFilmByCategories.size()+" bộ phim:");
                        service.show(resultFindFilmByCategories);
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không có lựa chọn này");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            }

        }
    }
}
