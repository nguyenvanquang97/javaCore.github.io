import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    public ArrayList<User> getAllUser(){
        ArrayList<User> userArrayList =new ArrayList<>();
        userArrayList.add(new User("0123456789","0123456789","0123456789",5000000 ));
        userArrayList.add(new User("0384162133","0123456789","0384162133",5000000));
        return userArrayList;
    }
    public User login (ArrayList<User> userArrayList){
        Scanner sc =new Scanner(System.in);
      boolean flag =true;
      while (flag){
          boolean flagPhoneNumber = true;
          String phoneNumber=null;
          while (flagPhoneNumber){
              System.out.println("Nhập số điện thoại:");
              phoneNumber =sc.nextLine();
              if (checkPhoneNumber(phoneNumber)){
                  flagPhoneNumber = false;
              }
              else {
                  System.out.println("Số điện thoại không hợp lệ!");
                  System.out.println("Vui lòng nhập lại");
                  flagPhoneNumber =true;
              }
          }
          System.out.println("Nhập passwood:");
          String passwood =sc.nextLine();
          int count = 0;
          for(User u : userArrayList){
              if (u.getPhoneNumber().equals(phoneNumber)&& u.getPassWood().equals(passwood)){
                  System.out.println("Đăng nhập thành công");
                  count++;
                  flag=false;
                  return u;
              }
          }
          if (count==0){
              System.out.println("Sai thông tin tài khoản hoặc mật khẩu!");
              flag = true;
          }
      }
      return null;
    }
    static final String REGEX_PHONE_NUMBER="^0\\d{9}$";
    public static boolean checkPhoneNumber(String email){
        boolean checkPhoneNumber = email.matches(REGEX_PHONE_NUMBER);
        return checkPhoneNumber;
    }
    static final String REGEX_ACOUNT_NUMBER="^\\d{8,16}$";
    public boolean checkAcountNumber(String acountNumber){
        boolean checkAcountNumber = acountNumber.matches(REGEX_ACOUNT_NUMBER);
        return checkAcountNumber;
    }

}
