import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("hôm nay là: "+ today);
        LocalDate date=LocalDate.of(2020,12,10);
        System.out.println(date);
        System.out.println("hôm nay là ngày: "+today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

    }
}
