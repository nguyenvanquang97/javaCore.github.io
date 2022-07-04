import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class filmService {
    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> arrMovie = new ArrayList<>();
        arrMovie.add(new Movie(1, "Bô Già", "nhảm nhí", "Trấn Thành",
                LocalDate.of(2020, 5, 15),
                180));
        arrMovie.add(new Movie(2, "Em Và Trịnh", "nhảm nhí",
                "Phan Gia Nhật Linh",
                LocalDate.of(2022, 6, 12),
                190));
        arrMovie.add(new Movie(3, "Trạng Tí", "vớ vẩn",
                "Phan Gia Nhật Linh",
                LocalDate.of(2021, 12, 9),
                200));
        arrMovie.add(new Movie(4, "Avenger:Endgame", "action",
                "Christopher Markus và Stephen McFeely",
                LocalDate.of(2018, 1, 1),
                220));
        return arrMovie;
    }

    public ArrayList<Serial> getAllSerial() {
        ArrayList<Serial> arrSerial = new ArrayList<>();
        arrSerial.add(new Serial(5, "Thương Ngày Nắng Về", "nhảm nhí",
                "Bùi Tiến Huy", LocalDate.of(2022, 4, 17),
                50, 40));
        arrSerial.add(new Serial(6, "Chồng Cũ,Vợ Cũ,Người Yêu Cũ",
                "nhảm nhí", "Không Biết",
                LocalDate.of(2022, 4, 17),
                39, 45));
        arrSerial.add(new Serial(7, "Nhà Trọ Balanha", "nhảm nhí",
                "Không biết", LocalDate.of(2020, 8, 17),
                69, 41));
        return arrSerial;
    }

    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public Movie creatMovie() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        boolean flag = true;
        int id = 0;
        while (flag) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu!");
                System.out.println("Vui lòng nhập lại");
            }
        }
        System.out.println("NHập tiêu dề:");
        String tittle = sc.nextLine();
        System.out.println("Nhập thể loại:");
        String category = sc.nextLine();
        System.out.println("Nhập đạo diễn");
        String filmDirector = sc.nextLine();
        flag = true;
        LocalDate premiereDate = null;
        while (flag) {
            try {
                System.out.println("Nhập ngày công chiếu(Năm-Tháng-Ngày): ");
                Date input = df.parse(sc.nextLine());
                premiereDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                flag = false;
            } catch (ParseException e) {
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            }
        }
        flag = true;
        int time = 0;
        while (flag) {
            try {
                System.out.println("Nhập thời lượng(phút):");
                time = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu!");
                System.out.println("Vui lòng nhập lại");
            }
        }
        Movie newMovie = new Movie(id, tittle, category, filmDirector, premiereDate, time);
        return newMovie;
    }

    public Serial creatSerial() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        boolean flag = true;
        int id = 0;
        while (flag) {
            try {
                System.out.println("Nhập id: ");
                id = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu!");
                System.out.println("Vui lòng nhập lại");
            }
        }
        System.out.println("NHập tiêu dề:");
        String tittle = sc.nextLine();
        System.out.println("Nhập thể loại:");
        String category = sc.nextLine();
        System.out.println("Nhập đạo diễn");
        String filmDirector = sc.nextLine();
        flag = true;
        LocalDate premiereDate = null;
        while (flag) {
            try {
                System.out.println("Nhập ngày công chiếu(Năm-Tháng-Ngày): ");
                Date input = df.parse(sc.nextLine());
                premiereDate = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                flag = false;
            } catch (ParseException e) {
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            }
        }
        flag = true;
        int episodes= 0;
        int timeAverage = 0;
        while (flag) {
            try {
                System.out.println("Nhập số tập:");
                episodes =Integer.parseInt(sc.nextLine());
                System.out.println("Nhập thời lượng trung bình(phút):");
                timeAverage = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu!");
                System.out.println("Vui lòng nhập lại");
            }
        }
        Serial newSerial = new Serial(id, tittle, category, filmDirector, premiereDate,episodes,timeAverage);
        return newSerial;
    }
    public void findFilmByName(ArrayList<Movie> movieArrayList,ArrayList<Serial>serialArrayList,String fname){
        int count = 0;
        for (Movie movie: movieArrayList ){
            if (movie.getTitle().toLowerCase().contains(fname.toLowerCase())){
                System.out.println(movie);
                count++;
            }
        }
        for (Serial serial: serialArrayList){
            if (serial.getTitle().toLowerCase().contains(fname.toLowerCase())){
                System.out.println(serial);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không tìm thấy kết quả");
        }
    }
}

