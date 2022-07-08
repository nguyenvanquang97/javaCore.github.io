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
        historyTradings=getAllHistoryTrading();
        service=new UserService();
        userArrayList=service.getAllUser();
        sc =new Scanner(System.in);
    }

    public void main(){
        while (true){
            boolean flag =true;
            Util.menu();
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
    while (true){
        Util.submenu();
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
            if (checkAcountNumber(acoutNumberTake)){
                for (User a : userArrayList){
                    if (a.getAccountNumber().equals(acoutNumberTake)){
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
                                System.out.println("Vui lòng nhập lại");
                            }
                        }
                    }
                }
                flag = false;
            }
            else {
                System.out.println("Số tài khoản sai định dạng");
                System.out.println("Vui lòng nhập lại");
            }

        }

    }
    static final String REGEX_ACOUNT_NUMBER="^\\d{8,16}$";
    public boolean checkAcountNumber(String acountNumber){
        boolean checkPhoneNumber = acountNumber.matches(REGEX_ACOUNT_NUMBER);
        return checkPhoneNumber;
    }
    public boolean checkMoneySend(Long moneySend,User user){
       if (moneySend>50000 && moneySend<(user.getAccountBalance()-50000)){
           return true;
       }else {
           return false;
       }
    }
    public HistoryTrading historyTrading(User user,User userTakeMoney,String describe, long moneySend){
        Random rd = new Random();
        int idTrading=rd.nextInt();
        LocalDate dateTrading = LocalDate.now();
        String acountNumbertake =userTakeMoney.getAccountNumber();
        HistoryTrading newHistoryTrading =new HistoryTrading(user.getAccountNumber(),idTrading,dateTrading,describe,acountNumbertake,moneySend);
        return newHistoryTrading;
    }
    public void showHistoryTrading(User user){
        System.out.println("Lịch sử giao dịch: ");
        for (HistoryTrading h:historyTradings ){
            if (h.getAccountNumber().contains(user.getAccountNumber())){
                System.out.println(h);
            }
        }
    }
    public  ArrayList<HistoryTrading> getAllHistoryTrading(){
        ArrayList<HistoryTrading> historyTradings =new ArrayList<>();
        historyTradings.add(new HistoryTrading("0333333333",0,LocalDate.now(),"null","0123456789",0));
        return historyTradings;
    }

}
