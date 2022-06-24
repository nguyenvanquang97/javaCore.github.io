package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class bookService {
    public  Scanner sc =new Scanner(System.in);
public  void showAllBook(ArrayList<Book> allBook){

    for (Book b:allBook){
        System.out.print(b.getId()+" - "+b.getTitle() +" - ");
        for (int i=0;i<b.getCategory().length;i++){
            System.out.print( " "+b.getCategory()[i]);
            if (i<b.getCategory().length-1){
                System.out.print("|");
            }
        }
        System.out.print(" - "+b.getAuthor()+" - "+b.getPageNumber()
                +" - "+b.getReleaseYear());
        System.out.println();
    }
}

public void findBookByName(ArrayList<Book> allBook){

    System.out.println("Nhập tên sách bạn muốn tìm: ");
    String fName =sc.nextLine();
    int count =0;
    for (Book b:allBook){
        if (b.getTitle().toLowerCase().contains(fName)){
            System.out.print(b.getId()+" - "+b.getTitle() +" - ");
            for (int i=0;i<b.getCategory().length;i++){
                System.out.print( " "+b.getCategory()[i]);
                if (i<b.getCategory().length-1){
                    System.out.print("|");
                }
            }
            System.out.print(" - "+b.getAuthor()+" - "+b.getPageNumber()
                    +" - "+b.getReleaseYear());
            System.out.println();
            count++;
        }
        }
    if (count==0){
        System.out.println("Không tìm thấy sách này!");
    }
    }
public void findBookByCategory(ArrayList<Book>allBook){
    System.out.println("Nhập thể loại bạn muốn tìm: ");
    String fCategory =sc.nextLine();
    int count =0;
    for (Book b:allBook){
        for (int j=0;j<b.getCategory().length;j++){
            if (b.getCategory()[j].toLowerCase().contains(fCategory)){
                System.out.print(b.getId()+" - "+b.getTitle() +" - ");
                for (int i=0;i<b.getCategory().length;i++){
                    System.out.print( " "+b.getCategory()[i]);
                    if (i<b.getCategory().length-1){
                        System.out.print("|");
                    }
                }
                System.out.print(" - "+b.getAuthor()+" - "+b.getPageNumber()
                        +" - "+b.getReleaseYear());
                System.out.println();
                count++;
            }
        }
    }
    if (count ==0){
        System.out.println("Không có thể loại này!");
    }

}
    public void sortListByPageNumber(ArrayList<Book> allBook) {
        allBook.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo sô trang: ");
        showAllBook(allBook);
    }
    public void sortListByReleaseYear(ArrayList<Book> allBook) {
        allBook.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2)
            {
                return o2.getReleaseYear()-o1.getReleaseYear();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo năm xuất bản: ");
        showAllBook(allBook);
    }

}
