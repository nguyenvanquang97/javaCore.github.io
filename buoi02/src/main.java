import java.util.StringJoiner;

public class main {
    public static void main(String[] args) {
        //Khai báo chuỗi
        //ưu tiên cách này
        String name = "Quang";
        System.out.println("Tôi tên là : " + name);
        String address = new String("Hà Nội");
        System.out.println("tôi đến từ :"+ address);

        System.out.println("Độ dài chuỗi adress là :"+ address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toLowerCase());
        //so sánh chuỗi
        System.out.println(name.equals(address));
        //Có phân biệt in hoa và in thường

        String name1 = "quang";
        System.out.println(name.equalsIgnoreCase(name1));
        // k phân biệt in hoa và thường

        String name2 = new String("Quang");
        System.out.println("name == name2" +name==name2);
        // sẽ trả về false vì 2 thằng lưu ở 2 nơi khác nhau,nên sử dụng equals

        System.out.println(name.charAt(1));
        // lấy ra kí tự ở vị trí 1,dếm từ o

        System.out.println(name.indexOf("n"));
        //tìm chữ "n" nằm ở vị trí bao nhiêu,chu ý:nếu có nhiều hơn 2 chữ thì chỉ trả về chữ đầu

        System.out.println(name.lastIndexOf("n"));
        //tìm chữ "n" ở vị trí cuối cùng

        System.out.println(name.indexOf("n",2));
        //vẫn tìm chữ "n" nhưng bắt đầu tìm từ vị trí số 2

        String gender = " male ";
        System.out.println(gender.trim());
        //Loại bỏ khoảng trắng ở đầu và cuối chuỗi

        String myAddress ="Hà Nội Việt Nam";
        System.out.println(myAddress.substring(3 ,5));
//        lấy ra chuỗi từ vị trí 3 đến 5,nếu chỉ 1 số thì lấy từ 3 đến cuối

        //Vd muốn viết hoa kí tự đầu của 1 chuỗi
        String myName ="tuấn";
        String upperCase = myName.toUpperCase();
        String result =upperCase.charAt(0)+myName.substring(1);
        System.out.println(result);

        //hằng
//        static final int MAX =100;
        //khai báo hằng MAX kiểu số nguyên = 100

        System.out.println("Xin chào.tôi tên là NGỌC.\n tôi đến từ HÀ GIANG");
        // \n: xuống dòng
        // \t: cách
        // \" thêm dấu ngoặc

        //Enum
//        gender nam =gender.MALE;
//        System.out.println();
//        gender nữ =gender.FEMALE;
//        System.out.println();



    }
}
