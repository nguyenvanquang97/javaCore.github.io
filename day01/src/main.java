import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("tôi là quang");
        int a=3;
        int b=4;
        int c=5;
//        Toán tử 3 ngôi
        System.out.println( (a+b) > c? "Đúng":"Sai");
        System.out.println(  a % 2 == 0 ? a + " là số chẵn" : a + " là số lẻ");
     //ví dụ
        double diemToan = 8;
        double diemLy =9;
        double diemVan=5;
        double diemHoa =6;
        double diemTb =(diemHoa+diemLy+diemToan+diemVan)/4;
        System.out.println(      diemTb >5? "Học sinh đủ điểm qua môn":"Học sinh không đủ điểm qua môn");
//       class Math
        System.out.println(Math.PI);
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(c,diemTb));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,3));
        //tạo dối tượng
        //<tên lớp><tên biến tham chiếu>=new <tên class>();
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);
        System.out.println(rdNumber);
//        ép kiểu ngầm định
        int age =25;
        double d = age;
//        ép kiểu tường minh
        double point =8.5;
        int p =(int) point;
        System.out.println(p);
        int x = 10;
        int y = 3;
        System.out.println((double)x/y);
















    }

}
