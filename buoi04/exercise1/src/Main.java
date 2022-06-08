import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ của bạn: ");
        String ho = sc.nextLine();
        System.out.println("Nhập tên đệm: ");
        String tenDem = sc.nextLine();
        System.out.println("Nhập tên của bạn: ");
        String ten =sc.nextLine();
        String fullName=ho +" "+tenDem+" " +ten;
        fullName=fullName.trim().toLowerCase();
        fullName= fullName.replaceAll("\\s+", " ");
        String[] temp= fullName.split(" ");
        fullName="";
        for(int i=0;i<temp.length;i++) {
            fullName+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                fullName+=" ";

        }
        System.out.println(fullName);

    }

}
