public class exercise4 {

    public static void main(String[] args) {
        //câu 4

        int n = 10;
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0;
        int i = 2;
        while (dem < n) {

            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        //  các số nguyên tố nhỏ hơn 10
        System.out.println();
        System.out.println("Các số nguyên tố nhỏ hơn 10 là:");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int j = 3; j < n; j++) {
            if (isPrimeNumber(j)) {
                System.out.print(" " + j);
            }
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
