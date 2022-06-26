import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<User> allUser;
    Scanner sc;
    public Service() {
        sc=new Scanner(System.in);
        allUser =new ArrayList<>();
    }
    public void main(){
//        ArrayList<User> allUser =new ArrayList<>();
        User user =new User("0","0","0");
        allUser.add(user);
        Service service = new Service();
        while (true) {
            Util.menu();

            boolean flag = true;
            while (flag) {
                try {
                    System.out.println("Lựa chọn của bạn là: ");
                    int choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1:
                            service.login(allUser);
                            break;
                        case 2:
                            User user1 =service.signIn(allUser);
                            allUser.add(user1);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");


                    }
                    flag = false;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai kiểu dữ liệu");
                    System.out.println("Vui lòng nhập lại");
                }

            }
        }
    }
    static final String REGEX_EMAIL = "^(.+)@(\\S+)$";
    public User signIn(ArrayList<User> allUser) {
        boolean flag = true;
        String userName1 = null;
        while (flag==true) {
            System.out.println("Nhập username: ");
            userName1 = sc.nextLine();
            for (User u:allUser){

                if (!u.getUserName().contains(userName1)) {
                    flag=false;
                } else {
                    System.out.println("username đã tồn tại");
                    System.out.println("Vui lòng nhập lại");
                }
            }

        }
        flag = true;
        String email1 = null;
        while (flag == true) {
            System.out.println("Nhập email: ");
            email1 = sc.nextLine();
            if (checkEmail(email1)) {
                for (User u : allUser) {
                    if (!u.getEmail().contains(email1)) {
                        flag = false;
                    } else {
                        System.out.println("email đã tồn tại");
                        System.out.println("Vui lòng nhập lại");
                    }
                }
            } else {
                System.out.println("Email không hợp lệ");
                System.out.println("Vui lòng nhập lại");
            }

        }
        flag = true;
        String passWood1 = null;
        while (flag) {
            System.out.println("Nhập PassWood: ");
            passWood1 = sc.nextLine();
            if (passWood1.length() >= 7 || passWood1.length() <= 15) {
                boolean checkPassWood = !passWood1.equals(passWood1.toLowerCase());
                if (checkPassWood) {
                    if (passWood1.contains(".") || passWood1.contains(",")
                            || passWood1.contains("-") || passWood1.contains("_")
                            || passWood1.contains(";")) {
                        flag = false;
                    } else {
                        System.out.println("passwood không hợp lệ");
                        System.out.println("vui lòng nhập lại");
                    }
                }
                else {
                    System.out.println("passwood không hợp lệ");
                    System.out.println("vui lòng nhập lại");
                }
            }
            else {
                System.out.println("passwood không hợp lệ");
                System.out.println("vui lòng nhập lại");
            }
        }
        System.out.println("Đăng kí tài khoản thành công!");
        User user1 = new User (userName1,passWood1,email1);
        return user1;
    }
    public void login (ArrayList<User> allUser){
        System.out.println("Nhập username: ");
        String userName = sc.nextLine();
        int countPassWood = 0;
        int countUserName=0;
        for (User a:allUser) {
            if (a.getUserName().equals(userName)) {
                countUserName++;
                System.out.println("Nhập passwood");
                String passWood =sc.nextLine();
                if (a.getPassWood().equals
                        (passWood)) {
                    System.out.println("Chào mừng " + userName);
                    countPassWood++;
                    Util.subMenu();
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            boolean flag = true;
                            while (flag) {
                                System.out.println("Nhập username mới: ");
                                String newUserName = sc.nextLine();
                                for (User p : allUser) {
                                    if (!p.getUserName().equals(newUserName)) {
                                        a.setUserName(newUserName);
                                        flag = false;
                                    } else {
                                        System.out.println("Username đã tồn tại");
                                        System.out.println("Vui lòng nhập lại");
                                    }
                                }
                            }
                            break;
                        case 2:
                            boolean flag1 = true;
                            while (flag1 == true) {
                                System.out.println("Nhập email: ");
                                String newEmail = sc.nextLine();
                                if (checkEmail(newEmail)) {
                                    for (User b : allUser) {
                                        if (!b.getEmail().contains(newEmail)) {
                                            a.setEmail(newEmail);
                                            flag1 = false;
                                        } else {
                                            System.out.println("username đã tồn tại");
                                            System.out.println("Vui lòng nhập lại");
                                        }
                                    }
                                } else {
                                    System.out.println("Email không hợp lệ");
                                    System.out.println("Vui lòng nhập lại");
                                }
                            }
                            break;
                        case 3:
                            flag = true;
                            while (flag) {
                                System.out.println("Nhập passwood mới: ");
                                String newPassWood = sc.nextLine();
                                if (newPassWood.length() >= 7 || newPassWood.length() <= 15) {
                                    boolean checkPassWood = !newPassWood.equals(newPassWood.toLowerCase());
                                    if (checkPassWood) {
                                        if (newPassWood.contains(".") || newPassWood.contains(",")
                                                || newPassWood.contains("-") || newPassWood.contains("_")
                                                || newPassWood.contains(";")) {
                                            a.setPassWood(newPassWood);
                                            flag = false;
                                        } else {
                                            System.out.println("passwood không hợp lệ");
                                            System.out.println("vui lòng nhập lại");
                                        }
                                    } else {
                                        System.out.println("passwood không hợp lệ");
                                        System.out.println("vui lòng nhập lại");
                                    }
                                } else {
                                    System.out.println("passwood không hợp lệ");
                                    System.out.println("vui lòng nhập lại");
                                }
                            }

                            break;
                        case 4:
                            main();
                            break;
                        case 0:
                            System.exit(0);
                        default:
                            System.out.println("Không có lựa chọn này!");
                    }
                }
            }
        }
        if (countUserName ==0){
            System.out.println("Kiểm tra lại user name");
            login(allUser);
        }
        if (countPassWood==0){
            Util.subMenu2();
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    login(allUser);
                case 2:
                    boolean flag =true;
                    while (flag){
                        int countEmail = 0;
                        System.out.println("Nhập email: ");
                        String emailForgot = sc.nextLine();
                        for (User b : allUser) {
                            if (b.getEmail().equals(emailForgot)) {
                                System.out.println("Chào mừng " + b.getUserName());
                                flag =false;
                                boolean flag1=true;
                                while (flag1){
                                    System.out.println("Nhập mật khẩu mới:");
                                    String newPassWood = sc.nextLine();
                                    if (newPassWood.length() >= 7 || newPassWood.length() <= 15) {
                                        boolean checkPassWood = !newPassWood.equals(newPassWood.toLowerCase());
                                        if (checkPassWood) {
                                            if (newPassWood.contains(".") || newPassWood.contains(",")
                                                    || newPassWood.contains("-") || newPassWood.contains("_")
                                                    || newPassWood.contains(";")) {
                                                flag1 = false;
                                                b.setPassWood(newPassWood);
                                                countEmail++;
                                            } else {
                                                System.out.println("passwood không hợp lệ");
                                                System.out.println("vui lòng nhập lại");
                                            }
                                        }
                                        else {
                                            System.out.println("passwood không hợp lệ");
                                            System.out.println("vui lòng nhập lại");
                                        }
                                    }
                                    else {
                                        System.out.println("passwood không hợp lệ");
                                        System.out.println("vui lòng nhập lại");
                                    }
                                }
                            }
                        }
                        if (countEmail==0){
                            System.out.println("Chưa tồn tại tài khoản");
                        }
                    }
                    break;
                case 3:
                    main();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
    }
    public static boolean checkEmail(String email){
        boolean checkEmail = email.matches(REGEX_EMAIL);
        return checkEmail;
    }
}