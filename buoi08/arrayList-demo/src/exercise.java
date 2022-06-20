import java.util.ArrayList;

public class exercise {
    public static void main(String[] args) {
        //tạo array list để chứa các phần tử kiểu String
        //thêm phần tử vào array list
        //lấy ra số lượng phần tử
        //đếm các phần tử java trong array list
        ArrayList<String>string =new ArrayList<>();
        string.add("java");
        string.add("javaScrip");
        string.add("C#");
        string.add("C++");
        string.add("Python");
        string.add("java");
        System.out.println(string);
        System.out.println("Số phần tử là: "+string.size());
        int count=0;
        for (String a:string){

            if (a.equals("java")){
                count++;
            }
        }
        System.out.println("số lần java xuất hiện là: "+ count);

    }
}
