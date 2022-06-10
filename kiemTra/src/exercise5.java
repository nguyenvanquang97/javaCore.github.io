import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số hàng: ");
        int row = sc.nextInt();
        System.out.println("nhập số cột: ");
        int col = sc.nextInt();
        int[][] arr =new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("các phần tử trên đường chéo chính là: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (i==j){
                    System.out.print(arr[i][j]+"\t");
                }

            }
        }
        System.out.println();
        System.out.println("Mảng thứ 2");
        int [][] arr2 = new int[row][col];
        arr2 =arr;
        int [][] arr3 = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Cộng 2 mảng");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr3[i][j]=arr[i][j]+arr2[i][j];

                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
