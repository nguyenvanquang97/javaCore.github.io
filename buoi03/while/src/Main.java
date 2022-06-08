import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);

//        while (age<18){
//            System.out.println("nhập tuổi :");
//            age = sc.nextInt();
//        }
//        System.out.println("bạn đủ tuổi bầu cử!");
//    }
        Random rd = new Random();
//        int rdNumber = rd.nextInt(100);
//        boolean flag = true;
//        while (flag){
//            System.out.println("đoán số");
//            int number = sc.nextInt();
//            if (number>rdNumber){
//                System.out.println("bạn đoán lớn quá rồi");
//            }
//            else if ((number<rdNumber)) {
//                System.out.println("bạn đoán bé quá rồi");
//            }
//            else {
//                System.out.println("bạn trúng số rồi");
//                flag =false;
//            }
//
//            }
    int a = 0;
    int b =0;
    int c = 0;
    double x;
    double x1;
      double x2;
    while (a==0){
        System.out.println("nhập a: ");
            a = sc.nextInt();

    }
        System.out.println("nhập b:");
            b = sc.nextInt();
        System.out.println("nhập c:");
           c = sc.nextByte();
         double delta =b*b - 4*a*c;
         if (delta<0){
             System.out.println("phương trình vô nghiệm");


         }
         else if (delta==0){
             x = -b/2*a;
             System.out.println("phương trình có nghiệm kép x = :"+x);
         }
         else{
             x1=(-b + Math.sqrt(delta))/2*a;
             x2 =(-b-Math.sqrt(delta))/2*a;
             System.out.println("phương trình có 2 nghiệm");
         }
      }
}



