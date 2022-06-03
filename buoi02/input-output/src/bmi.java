import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Cân nặng : ");
//        double weight = sc.nextDouble();
//        System.out.println("chiều cao : ");
//        double height = sc.nextDouble();
//        double bmi = weight/(height*height);
//        System.out.println("chỉ số bmi là : "+ bmi);
//        tính điểm trung bình
//        System.out.println("nhập điểm toán:");
//        double diemToan =sc.nextDouble();
//        System.out.println("nhập điểm văn:");
//        double diemVan =sc.nextDouble();
//        System.out.println("nhập điểm lý:");
//        double diemLy =sc.nextDouble();
//        System.out.println("nhập điểm hóa:");
//        double diemHoa =sc.nextDouble();
//        double diemTb = (diemHoa + diemLy +diemToan +diemVan)/4;
//        System.out.println("điểm trung bình : "+ diemTb);
//        System.out.println(  diemTb>5?"đạt":"trượt");

        //tính chu vi
        System.out.println("nhập chiều dài: ");
       double chieuDai = sc.nextDouble();
       System.out.println(("nhập chiều rộng :"));
       double chieuRong =sc.nextDouble();
       double chuVi= (chieuRong+chieuDai)*2;
       double dienTich = chieuRong*chieuDai;
       System.out.printf("chu vi hình chữ nhật là %f,diện tích hình chữ nhật là %f"
       ,chuVi,dienTich);


    }
}
