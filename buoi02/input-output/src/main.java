import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // tạo dối tượng scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên của ban :");
        String name =sc.nextLine();
        System.out.println("nhập tuổi của bạn: ");
//        int age =sc.nextInt();
        // ép kiểu
        int age =Integer.parseInt(sc.nextLine());
        System.out.println("Tôi đến từ :");
        String address = sc.nextLine();
        System.out.println("tên tôi là:"+ name +",năm nay tôi : "+ age +"tuổi"
            +",tôi đến từ :"+ address        );
    }
}
