package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();
        ArrayList<Book> allBook = new ArrayList<>();
        try {
            FileReader reader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<Book>>() {
            }.getType();
            allBook = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            System.out.println("Sai đường dẫn file!");
        }
        bookService service = new bookService();
        while (true) {
            Util.menu();

            boolean flag = true;
            while (flag) {
                try {
                    System.out.println("Lựa chọn của bạn là: ");
                    int choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1:
                            service.showAllBook(allBook);
                            break;
                        case 2:
                            service.findBookByName(allBook);
                            break;
                        case 3:
                            service.findBookByCategory(allBook);
                            break;
                        case 4:
                            service.sortListByPageNumber(allBook);
                            break;
                        case 5:
                            service.sortListByReleaseYear(allBook);
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này!");
                    }
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai kiểu dữ liệu");
                    System.out.println("Vui lòng nhập lại");
                }

            }
        }
    }
}
