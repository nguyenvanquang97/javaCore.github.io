import java.util.Random;
import java.util.Scanner;

public class exercise1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//
        int height;


        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước của hình vuông: ");
        height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        // bài tập in hình tam giác
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }

}

