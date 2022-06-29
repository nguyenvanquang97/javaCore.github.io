import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a =10;
//        int b =0;
//        int c =a/b;
//        System.out.println(c);
//        int[] arr =new int[-3];
        Scanner sc =new Scanner(System.in);
       try {
           System.out.println("nhập số bất kì: ");
           int x =sc.nextInt();
           System.out.println(x);
            int[] arr =new int[x];
       }catch (InputMismatchException e){
           System.out.println("Nhập sai kiểu dữ liệu!");
       }catch (NegativeArraySizeException e){
           System.out.println("Kích thước mảng phải là số dương");
       }finally {
           System.out.println("Khối này luôn được thực thi");
       }
    }
}
