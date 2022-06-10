import java.util.Random;

public class exercise3 {
    public static void main(String[] args) {
        //câu 3
        Random rd = new Random();
        int number = rd.nextInt();
        System.out.println("Ta có số ngẫu nhiên: " + number);
        boolean soNguyenTo = isPrimeNumber(number);
        if (soNguyenTo == true) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải số nguyên tố");
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }
}
