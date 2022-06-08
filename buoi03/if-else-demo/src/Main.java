import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x =14;
//        if( x % 2==0){
//            System.out.println(x + " là số chẵn");
//            System.out.println("Done!!!");
//        }
//        else {
//            System.out.println(x + " là số lẻ");
//        }
////        lồng câu lệnh if else
//        int a= 5;
//        int b =7;
//        int c = 10;
//        if ( a < b){
//            if (a < c){
//                System.out.println(a+" là nhỏ nhất");
//            }
//            else {
//                System.out.println(c+" là nhỏ nhất");
//            }
//        }
//        double bmi = 27.7;
//        if ( bmi < 18){
//            System.out.println("bạn gầy vl");
//        }
//        else if (bmi    >= 18 && bmi < 22) {
//            System.out.println("bạn bình thường");
//
//
//        }
//        else {
//            System.out.println("bạn péo vkl");
//        }
//        cho 3 cạnh a,b,c
//                kiểm tra xem có phải tam giác không
//        double a = 9;
//        double b = 8;
//        double c = 4;
//        if (a + b > c){
//            if (a + c > b){
//                if ( b + c > a){
//                    System.out.println(" đây là ba cạnh của tam giác");
//                }
//                else {
//                    System.out.println("đây éo phải tam giác");
//                }
//            }
//            else {
//                System.out.println("đây éo phải tam giác");
//            }
//        }
//        else {
//            System.out.println("đây éo phải tam giác");
//        }
//        switch-case
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số: ");
//        int number = sc.nextInt();
//        switch ( number){
//            case 2:
//                System.out.println("thứ 2");
//                break;
//            case 3:
//                System.out.println("thứ 3");
//                break;
//            case 4:
//                System.out.println("thứ 4");
//                break;
//            case 5:
//                System.out.println("thứ 5");
//                break;
//            case 6:
//                System.out.println("thứ 6");
//                break;
//            case 7:
//                System.out.println("thứ 7");
//                break;
//            case 8:
//                System.out.println("chủ nhật");
//                break;
//            default:
//                System.out.println("không có ngày này");
//        }
//        kiểm tra 1 tháng có bao nhiêu ngày
        System.out.println(" nhập 1 tháng bất kì:");
//        int thang = sc.nextInt();
//        switch (thang){
//            case 1,3,5,7,8,10,12:
//                System.out.println("tháng "+thang+" có 31 ngày");
//                break;
//            case 2:
//                System.out.println("tháng "+thang+" có 28 hoặc 29 ngày");
//                break;
//            case 4,6,9,11:
//                System.out.println("tháng "+thang+" có 30 ngày");
//                break;
//            default:
//                System.out.println("éo có tháng này ");
//        }
        System.out.println("Lựa chọn của bạn là :");
        System.out.println("1 - xem tất cả sản phẩm");
        System.out.println("2 - tìm sản phẩm theo tên");
        System.out.println("3 - xem giỏ hàng");
        System.out.println("4 - exit");
        int x = sc.nextInt();
        switch (x){
            case 1:
            System.out.println("danh sách sản phẩm");
            System.out.println("abc xyz");
            break;
            case 2:
                System.out.println("nhập tên sản phẩm");
                break;
            case 3:
                System.out.println("giỏ hàng của ban");
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("nhập từ 1 đến 4 thôi!!!");


        }
    }
}
