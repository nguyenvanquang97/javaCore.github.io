import java.time.LocalDate;
import java.time.LocalTime;

public class FilmSevice {
    public Movie[] getAllMovie(){
     Movie [] arrMovie=new Movie[4];
     arrMovie[0]=new Movie(1,"Bô Già","nhảm nhí","Trấn Thành",
             LocalDate.of(2020,5,15 ),
             LocalTime.of(2,4));
        arrMovie[1]=new Movie(2,"Em Và Trịnh","nhảm nhí",
                "Phan Gia Nhật Linh",
                LocalDate.of(2022,6,12 ),
                LocalTime.of(2,10));
        arrMovie[2]=new Movie(3,"Trạng Tí","vớ vẩn",
                "Phan Gia Nhật Linh",
                LocalDate.of(2021,12,9 ),
                LocalTime.of(2,4));
        arrMovie[3]=new Movie(4,"Avenger:Endgame","action",
                "Christopher Markus và Stephen McFeely",
                LocalDate.of(2018,1,1 ),
                LocalTime.of(2,30));
        return arrMovie;
    }
    public Serial[] getAllSerial(){
        Serial[] arrSerial=new Serial[3];
        arrSerial[0]=new Serial(5,"Thương Ngày Nắng Về","nhảm nhí",
                "Bùi Tiến Huy",LocalDate.of(2022,4,17),
                40,LocalTime.of(0,40));
        arrSerial[1]=new Serial(6,"Chồng Cũ,Vợ Cũ,Người Yêu Cũ",
                "nhảm nhí", "Không Biết",
                 LocalDate.of(2022,4,17),
                40,LocalTime.of(0,45));
        arrSerial[2]=new Serial(7,"Nhà Trọ Balanha","nhảm nhí",
                "Không biết",LocalDate.of(2020,8,17),
                40,LocalTime.of(0,40));
        return arrSerial;

    }
    public void ShowMovie(Movie[] arrMovie){
        System.out.println("Tất cả Movive:");
        for (Movie a : arrMovie){
            System.out.println(a.getId()+" - "+a.getTitle()+" - "+a.getCategory()
                    +" - "+a.getFilmDirector()+" - "+a.getPremiereDate()
                    +" - "+a.getTime());
        }
    }
    public void ShowSerial(Serial[] arrSerial){
        System.out.println("Tất cả Serial:");
        for (Serial b : arrSerial){
            System.out.println(b.getId()+" - "+b.getTitle()+" - "+b.getCategory()
                    +" - "+b.getFilmDirector()+" - "+b.getPremiereDate()
                    +" - "+b.getEpisodes()+" - "+b.getTimeAverage());

        }
    }
    public void FindFilmByName(Movie[] arrMovie,Serial[] arrSerial,
                               String fName){
        int count =0;
        for (Movie a: arrMovie){
            if (a.getTitle().contains(fName)){
                System.out.println(a.getId()+" - "+a.getTitle()+" - "+a.getCategory()
                        +" - "+a.getFilmDirector()+" - "+a.getPremiereDate()
                        +" - "+a.getTime());
            count++;

            }

        }
        for (Serial b: arrSerial){
            if (b.getTitle().contains(fName)){
                System.out.println(b.getId()+" - "+b.getTitle()+" - "+b.getCategory()
                        +" - "+b.getFilmDirector()+" - "+b.getPremiereDate()
                        +" - "+b.getEpisodes()+" - "+b.getTimeAverage());
                count++;
            }
        }
        if (count==0){
            System.out.println("Không tìm thấy phim này!!!");
        }


    }
}
