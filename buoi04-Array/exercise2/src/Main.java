import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers;
        System.out.println("Nhập số phần tử của mảng");
       int n = sc.nextInt();
        numbers = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+(i+1) +":");
            numbers [i]=sc.nextInt();
            if (numbers[i]%2==0){
                numbers[i]+=1;
            }

        }
        System.out.print("Mảng của bạn là: ");
        for (int j = 0;j<n;j++){
            System.out.print(numbers[j]+"\t");
        }

    }
}
