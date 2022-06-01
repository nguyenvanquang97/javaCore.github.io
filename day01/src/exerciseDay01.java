import java.util.Random;

public class exerciseDay01 {
    public static void main(String[] args) {

        Random rd = new Random();
        int a = rd.nextInt(100);
        int b = rd.nextInt(100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b =" + (a + b));
        System.out.println("a - b =" + (a - b));
        System.out.println("b - a =" + (b - a));
        System.out.println("a * b =" + (a * b));
        System.out.println("a / b =" + (a / b));
        System.out.println("b / a =" + (b / a));
// so sánh i++ và ++i
        //i++
        int i = rd.nextInt(100);
        System.out.println("giá tri ban đầu của i =" + i);
        int j = i++;
        System.out.println("giá tri mới của i =" + i);
        System.out.println("i++ =" + j);
        //i tăng lên 1 đơn vị nhưng i++ trả về giá trị ban đầu của i
        //++i
        System.out.println("giá trị ban đầu của i = " + i);
        int k = ++i;
        System.out.println("giá trị mới của i =" + i);
        System.out.println("++i =" + k);
        //i tăng lên 1 đơn vị và ++i trả về giá trị mới của i
        //so sánh
        System.out.println(j == k ? "i++ bằng ++i" : "i++ không bằng ++i");
        System.out.println(j > k ? "i++ lớn hơn ++i" : "++i lớn hơn i++");
// ++i luôn lớn hơn i++

    }
}
