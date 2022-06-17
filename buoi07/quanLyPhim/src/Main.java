import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        FilmSevice sevice =new FilmSevice();
        Movie[] arrMovie=sevice.getAllMovie();
        Serial[] arrSerial =sevice.getAllSerial();
        sevice.ShowMovie(arrMovie);
        sevice.ShowSerial(arrSerial);
        System.out.println("Nhập tên phim bạn muốn tìm(viết hoa chữ cái đầu tiên):");
        String fName =sc.nextLine();
        sevice.FindFilmByName(arrMovie,arrSerial,fName);


    }
}
