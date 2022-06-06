import java.util.Scanner;

public class exerciseDay03 {
    public static void main(String[] args) {
        String string = "Hello every one";
        System.out.println(string);
        int j=0;
        for (int i=0;i<string.length();i++){
          int  a = string.indexOf("e",i);
            System.out.println("Index của \"e\" là :"+a);
            i = a;
            j++;
        }
        System.out.println("số lần \"e\" xuất hiên là :"+j);
        //bài tập 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì: ");
        String str=sc.next();
        int length =str.length();
       for (  int i=0;i<length;i++){
          if (
                  str.charAt(i)==str.charAt(length-1-i)
          ) {

            if (i==length-1){
                System.out.println("đây là chuỗi nghịch đảo");
            }
            continue;

          }
          else
              System.out.println("đây không phải chuỗi nghịch đảo");
          break;
        }

    }
}
