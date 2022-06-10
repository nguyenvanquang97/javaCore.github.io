import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise6 {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập email của bạn: ");
        String emailAddress = sc.next();
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        if (patternMatches(emailAddress, regexPattern)==true){
            System.out.println("email hợp lệ!!");
        }
        else {
            System.out.println("email không hợp lệ!!");
        }
        System.out.println("nhập số điện thoại: ");
        String str = sc.next();
        if (str.length()<9){
            System.out.println("sdt không hợp lệ!");
        }else {
            if (str.length()<11){
                System.out.println("sdt hợp lệ!!");
            }
            else {
                System.out.println("sđt không hợp lệ!!");
            }
        }

    }



    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}