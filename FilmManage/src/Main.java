import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        filmService service=new filmService();
        ArrayList<Movie> movieArrayList=service.getAllMovie();
        ArrayList<Serial> serialArrayList=service.getAllSerial();
        boolean flag = true;
        while (flag){
            while (true){
                  Util.menu();
                try {
                  System.out.println("Lựa chọn của bạn là:");
                  int choose =Integer.parseInt(sc.nextLine());
                  switch (choose){
                      case 1:
                          service.show(movieArrayList);
                          break;
                      case 2:
                          service.show(serialArrayList);
                          break;
                      case 3:
                          Util.subMenu();
                          System.out.println("Lựa chọn của bạn là: ");
                          int chooseAddFilm=Integer.parseInt(sc.nextLine());
                          switch (chooseAddFilm){
                              case 1:
                                  Movie newMove =service.creatMovie();
                                  movieArrayList.add(newMove);
                                  break;
                              case 2:
                                  Serial newSerial =service.creatSerial();
                                  serialArrayList.add(newSerial);
                                  break;
                              default:
                                  System.out.println("Không có lựa chọn này");
                          }
                          break;
                      case 4:
                          System.out.println("Nhập tên phim cần tìm:");
                          String fname =sc.nextLine();
                          service.findFilmByName(movieArrayList,serialArrayList,fname);
                          break;
                      default:
                          System.out.println("Không có lựa chọn này");
                  }
              }
              catch (NumberFormatException e){
                  System.out.println("Nhập sai kiểu dữ liệu!");
                  System.out.println("Vui lòng nhập lại");
              }
            }

        }

    }
}
