import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book [] arrBook = new Book[5];
        arrBook [0]=new Book("book1", "PHÀM NHÂN TU TIÊN",
                "Vong ngữ","tiên hiệp","NXB Kim Đồng", 2008);
        arrBook[1]=new Book("book2","THẦN MỘ","Ngô Biển Quân",
                "kiếm hiệp","NXB Kim Đồng",2010);
        arrBook[2]=new Book("book3","TIÊN NGHỊCH","Nhĩ Căn",
                "tiên hiệp","NXB Kim Đồng",2010);
        arrBook[3]=new Book("book4","BÁCH LUYỆN THÀNH TIÊN","Huyền Vũ",
                "huyền huyễn","NXB Kim Đồng",2022);
        arrBook[4]=new Book("book5","TRU TIÊN","Tiêu Đỉnh",
                "ngôn tình","NXB Kim Đồng",2022);
        System.out.println("Tất cả các sách: ");
        for (Book book:arrBook){
            System.out.println(book.id+" - "+book.title+" - "+book.author
                    +" - "+book.category+" - "
                    +book.publishingCompany+" - "+book.year);
        }
        System.out.println("----------------------------------");
        System.out.println("Nhập tên sách bạn muốn tìm(viết hoa):");
        String fTittle =sc.nextLine();
        for (Book book:arrBook){
           if (book.title.contains(fTittle)){
               System.out.println(book.id+" - "+book.title+" - "+book.author
                       +" - "+book.category+" - "
                       +book.publishingCompany+" - "+book.year);
           }
        }
        System.out.println("----------------------------------");
        System.out.println("Nhập thể loại sách muốn tìm:");
        String fCategory =sc.nextLine();
        for (Book book:arrBook){
            if (book.category.equalsIgnoreCase(fCategory)){
                System.out.println(book.id+" - "+book.title+" - "+book.author
                        +" - "+book.category+" - "
                        +book.publishingCompany+" - "+book.year);
            }
        }
        System.out.println("----------------------------------");
        System.out.println("các sách xuất bản trong năm nay:");
        for (Book book:arrBook){
            if (book.year==2022){
                System.out.println(book.id+" - "+book.title+" - "+book.author
                        +" - "+book.category+" - "
                        +book.publishingCompany+" - "+book.year);
            }
        }

    }

}
