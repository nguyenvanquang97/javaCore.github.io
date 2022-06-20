import jdk.jshell.execution.Util;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd =new Random();
        Scanner sc = new Scanner(System.in);
        PlayerService service = new PlayerService();
        ArrayList<Player> allPlayer = service.getAllPlayer();
        System.out.println("Danh sách tất cả cầu thủ: ");
        service.Show(allPlayer);
        ArrayList<Player> gkPlayer = service.getGkPlayer(allPlayer);
        ArrayList<Player> dfPlayer = service.getDfPlayer(allPlayer);
        ArrayList<Player> mfPlayerPlayer = service.getMfPlayer(allPlayer);
        ArrayList<Player> fwPlayer = service.getFwPlayer(allPlayer);
        System.out.println();

        while (true) {
            Ulti.menu();
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Đội hình ra sân: ");
                    ArrayList<Player> team4_4_2 =service.buildTeam(gkPlayer,dfPlayer,
                            mfPlayerPlayer,fwPlayer,4,4,2);
                    service.Show(team4_4_2);
                    break;
                case 2:
                    System.out.println("Đội hình ra sân: ");
                    ArrayList<Player> team4_3_3 =service.buildTeam(gkPlayer,dfPlayer,
                            mfPlayerPlayer,fwPlayer,4,3,3);
                    service.Show(team4_3_3);
                    break;
                case 3:
                    System.out.println("Đội hình ra sân: ");
                    ArrayList<Player> team3_5_2 =service.buildTeam(gkPlayer,dfPlayer,
                            mfPlayerPlayer,fwPlayer,3,5,2);
                    service.Show(team3_5_2);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
