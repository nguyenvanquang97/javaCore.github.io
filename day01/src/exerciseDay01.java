import java.util.Random;

public class exerciseDay01 {
    public static void main(String[] args) {

        Random rd = new Random();
        int a = rd.nextInt(100);
        int b = rd.nextInt(100);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a + b =" + (a+b));
        System.out.println("a - b =" + (a-b));
        System.out.println("b - a =" + (b-a));
        System.out.println("a * b =" + (a*b));
        System.out.println("a / b =" + (a/b));
        System.out.println("b / a =" + (b/a));
// so sánh i++ và ++i
        int i = rd.nextInt(100);
        System.out.println("i ="+ i);
        int j = i++;
        int k = ++i;
        System.out.println("i++ ="+ j);
        System.out.println("++i ="+ k);
        System.out.println(j == k?"i++ bằng ++i":"i++ không bằng ++i");
        System.out.println(j > k?"i++ lớn hơn ++i":"++i lớn hơn i++");
// ++i luôn lớn hơn i++
    }
}
