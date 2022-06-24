import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public void main(){
        ArrayList<User> allUser =new ArrayList<>();
        User user =new User("0","0","0");
        allUser.add(user);
        Scanner sc = new Scanner(System.in);
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
                            User user1 =service.signUp(allUser);
                            allUser.add(user1);
                            break;


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


    public Service() {
    }

    public Scanner sc =new Scanner(System.in);
    public User signUp(ArrayList<User> allUser) {


        System.out.println();
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
                        System.out.println("username đã tồn tại");
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
        User user1 = new User (userName1,passWood1,email1);
        return user1;
    }
    public void login (ArrayList<User> allUser){
        System.out.println("Nhập username: ");
       String userName = sc.nextLine();
        System.out.println("Nhập passwood");
        String passWood =sc.nextLine();
        int count = 0;
        for (User a:allUser) {
            if (a.getUserName().equals(userName) && a.getPassWood().equals
                    (passWood)) {
                System.out.println("Chào mừng " + userName);
                count++;
                Util.subMenu();
                int choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:

                       boolean flag =true;
                       while (flag){
                           System.out.println("Nhập username mới: ");
                           String newUserName =sc.nextLine();
                           for (User p:allUser){
                               if (!p.getUserName().equals(newUserName)){
                                   a.setUserName(newUserName);
                                   flag =false;
                               }
                               else {
                                   System.out.println("Username đã tồn tại");
                                   System.out.println("Vui lòng nhập lại");
                               }
                           }

                       }

                        break;

                    case 2:
                        boolean flag1 =true;
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
                        System.out.println("Nhập passwood mới: ");
                        String newPassWood = sc.nextLine();
                        a.setPassWood(newPassWood);
                        break;
                    case 4:
                        main( );
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không có lựa chọn này!");


                }


            }
        }

           if (count==0){
                Util.subMenu2();
                int choose = Integer.parseInt(sc.nextLine());

                    switch (choose) {
                        case 1:
                            login(allUser);
                        case 2:
                            System.out.println("Nhập email");
                            String emailForgot = sc.nextLine();
                            for (User a : allUser) {
                                if (a.getEmail().equals(emailForgot)) {
                                    System.out.println("Chào mừng " + a.getUserName());
                                } else {
                                    System.out.println("Chưa tồn tại tài khoản");
                                }
                            }
                    }

            }
        }







    public static boolean checkEmail(String email){
        boolean checkEmail = email.matches(REGEX_EMAIL);
        return checkEmail;
    }
}
