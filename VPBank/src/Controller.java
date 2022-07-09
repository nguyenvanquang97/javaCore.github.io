import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controller {
    UserService service;
    ArrayList<User> userArrayList;
    Scanner sc;
    ArrayList<HistoryTrading>historyTradings;


    public Controller() {
        historyTradings=HistoryTradingService.getAllHistoryTrading();
        service=new UserService();
        userArrayList=service.getAllUser();
        sc =new Scanner(System.in);
    }

    public void main(){
        while (true){
            Util.menu();
            boolean flag =true;
            while (flag){
                try {

                    System.out.println("Lựa chọn của bạn là:");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            User user = service.login(userArrayList);
                            loginsuccess(user);
                            break;
                        case 2:
                            User newUser =register();
                            userArrayList.add(newUser);
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Không có lựa chọn này!");
                    }
                    flag = false;
                }catch (NumberFormatException e){
                    System.out.println("Nhập sai kiểu dữ liệu");
                    System.out.println("Vui lòng nhập lại");
                }
            }
        }
    }
    public void loginsuccess(User user){
        boolean flag = true;
    while (true){
        Util.submenu();
            try{
                System.out.println("Lựa chọn của bạn là:");
                int choose=Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        showAccountBalance(user);
                        break;
                    case 2:
                        tradeMoney(user);
                        break;
                    case 3:
                        showHistoryTrading(user);
                        break;
                    case 4:
                        main();
                    default:
                        System.out.println("Không có lựa chọn này!");
                }
            flag =false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai kiểu dữ liệu");
                System.out.println("Vui lòng nhập lại");
            }
        }
    }
    public void showAccountBalance(User user){
        System.out.println("Số dư tài khoản :"+ user.getAccountBalance());
    }
    public void tradeMoney(User user){
        boolean flag = true;
        while (flag){
            System.out.println("Nhập số tài khoản nhận:");
            String acoutNumberTake = sc.nextLine();
            int count =0;
            if (service.checkAcountNumber(acoutNumberTake)){
                for (User a : userArrayList){
                    if (a.getAccountNumber().equals(acoutNumberTake)){
                        count ++;
                        boolean flagMoneySend =true;
                        while (flag){
                            System.out.println("Nhập số tiền cần chuyển:");
                            long moneySend =Long.parseLong(sc.nextLine());
                            if (checkMoneySend(moneySend,user)){
                                System.out.println("Nhập nội dung chuyển tiền:");
                                String describe = sc.nextLine();
                                user.setAccountBalance(user.getAccountBalance()-moneySend);
                                a.setAccountBalance(a.getAccountBalance()+moneySend);
                                System.out.println("Chuyển tiền thành công");
                                HistoryTrading newHistoryTrading = historyTrading(user,a,describe,moneySend);
                                historyTradings.add(newHistoryTrading);
                                flag = false;
                            }
                            else {
                                System.out.println("Số tiền chuyển không hợp lệ");
                                System.out.println("Số tiền chuyển cần lớn hơn 50.000 và số dư tài khoản còn lại phải luôn lớn hơn 50.000");
                                System.out.println("Vui lòng nhập lại");
                            }
                        }
                    }
                }
                if (count == 0){
                    System.out.println("Số tài khoản nhận không tồn tại");
                    System.out.println("Vui lòng nhập lại");
                }
                flag = false;
            }
            else {
                System.out.println("Số tài khoản sai định dạng");
                System.out.println("Vui lòng nhập lại");
            }
        }
    }
    public boolean checkMoneySend(Long moneySend,User user){
       if (moneySend>50000 && moneySend<(user.getAccountBalance()-50000)){
           return true;
       }else {
           return false;
       }
    }
    public HistoryTrading historyTrading(User user,User userTakeMoney,String describe, long moneySend){
        String idTrading=null;
        LocalDate dateTrading = LocalDate.now();
        String acountNumbertake =userTakeMoney.getAccountNumber();
        HistoryTrading newHistoryTrading =new HistoryTrading(user.getAccountNumber(),idTrading,dateTrading,describe,acountNumbertake,moneySend);
        return newHistoryTrading;
    }
    public void showHistoryTrading(User user){
        int count =0;
        System.out.println("Lịch sử giao dịch: ");
        for (HistoryTrading h:historyTradings ){
            if (h.getAccountNumber().contains(user.getAccountNumber())){
                System.out.println(h);
                count++;
            }
        }if(count==0){
            System.out.println("Chưa có giao dịch nào");
        }
    }
    public User register(){
        String phoneNumber= creatPhoneNumber();
        String acountNumber =creatAcountNumber();
        System.out.println("Nhập passwood:");
        String passWood = sc.nextLine();
        System.out.println("Đăng kí tài khoản thành công.Bạn được nhận 5 củ vào tài khoản:v");
        User newUser =new User(phoneNumber,passWood,acountNumber,5000000);
        return newUser;
    }
    public String creatPhoneNumber(){
        boolean flag =true;
        String phoneNumber =null;
        while (flag){
            int count =0;
            System.out.println("Nhập số điện thoại:");
             phoneNumber = sc.nextLine();
            if (service.checkPhoneNumber(phoneNumber)){
                for (User u: userArrayList){
                    if (u.getPhoneNumber().equals(phoneNumber)){
                        System.out.println("Số điện thoại đã tồn tại");
                        System.out.println("Vui lòng nhập lại");
                        flag =true;
                        count++;
                    }
                }
                if (count ==0){
                    flag =false;
                    return phoneNumber;
                }
        }else {
                System.out.println("Số điện thoại không hợp lệ!");
                System.out.println("Vui lòng nhập lại");
                flag =true;
            }
    }
        return phoneNumber;
    }
    public String creatAcountNumber(){
        boolean flag =true;
        String acountNumber =null;
        while (flag){
            int count =0;
            System.out.println("Nhập số tài khoản:");
            acountNumber = sc.nextLine();
            if (service.checkAcountNumber(acountNumber)){
                for (User u: userArrayList){
                    if (u.getAccountNumber().equals(acountNumber)){
                        System.out.println("Số tài khoản đã tồn tại");
                        System.out.println("Vui lòng nhập lại");
                        flag =true;
                        count++;
                    }
                }
                if (count ==0){
                    flag =false;
                    return acountNumber;
                }
            }else {
                System.out.println("Số tài khoản không hợp lệ!");
                System.out.println("Vui lòng nhập lại");
                flag =true;
            }
        }
        return acountNumber;
    }

}
