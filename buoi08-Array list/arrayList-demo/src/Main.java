import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInteger =new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println(listInteger);
        for (Integer i:listInteger){
            System.out.print(i +"\t");
        }
        System.out.println();
        //thêm phần tử
        listInteger.add(2,6);
        System.out.println("danh sách sau khi chèn");
        System.out.println(listInteger);
        //cập nhật phần tử
        listInteger.set(0,7);
        System.out.println("danh sách sau khi cập nhật:");
        System.out.println(listInteger);
        //xóa phần tử
        listInteger.remove(0);
        System.out.println("danh sách sau khi xóa:");
        System.out.println(listInteger);
        System.out.println(listInteger.indexOf(5));
        //kích thước mảng
        System.out.println("kích thước: "+listInteger.size());
        System.out.println("phần tử ở vị trí cuối cùng: "+listInteger.get(listInteger.size()-1));
        //sắp xếp mảng ,mặc định là tăng dần
        Collections.sort(listInteger);
        System.out.println(listInteger);
        //đảo ngược mảng
        Collections.reverse(listInteger);
        System.out.println(listInteger);
        //đảo linh tinh:))
        Collections.shuffle(listInteger);
        System.out.println(listInteger);

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(9);
        list2.add(4);
        //chèn list vào chỗ index 1
        list2.addAll(1,listInteger);
        System.out.println(list2);
    }
}
