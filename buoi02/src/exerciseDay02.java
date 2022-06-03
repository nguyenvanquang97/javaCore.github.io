import java.util.Random;
import java.util.Scanner;

public class exerciseDay02 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1: ");
        int number = sc.nextInt();
        int randomNumber = rd.nextInt(1,100);
        System.out.println("Ta có số thứ 2 ngẫu nhiên từ 1 đến 100 là: " + randomNumber);
        System.out.println(number == randomNumber ? "số thứ nhất bằng số thứ 2" : "số thứ nhất không bằng số thứ 2");
        System.out.println(number > randomNumber ? "số thứ nhất lớn hơn số thứ 2" : "số thứ 2 lớn hơn số thứ nhất");
    }
}
