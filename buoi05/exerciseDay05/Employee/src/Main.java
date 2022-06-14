import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arrEmployee = new  Employee[7];
        arrEmployee [0]= new Employee("NV1","Nguyễn Trường Giang",Gender.MALE,
                LocalDate.of(1995,12,17),
                "0124576797","giang@.gmail.com","Hà Nội");
        arrEmployee [1]= new Employee("NV2","Quách Ngọc Linh",Gender.FEMALE,
                LocalDate.of(1991,2,19),
                "0799736834","linh@.gmail.com","Hà Nội");
        arrEmployee [2]= new Employee("NV3","Đào Thị Hường",Gender.FEMALE,
                LocalDate.of(1996,3,7),
                "0124379777","huong@.gmail.com","Hà nội");
        arrEmployee [3]= new Employee("NV4","Trần Thị Kim Anh",Gender.FEMALE,
                LocalDate.of(1993,9,23),
                "0349948888","kimanh@.gmail.com","Hưng Yên");
        arrEmployee [4]= new Employee("NV5","Nguyễn Đức Cảnh",Gender.MALE,
                LocalDate.of(1995,10,13),
                "0347855555","canh@.gmail.com","Hải Phòng");
        arrEmployee [5]= new Employee("NV6","Lâm Tâm Như",Gender.FEMALE,
                LocalDate.of(1995,12,17),
                "0345787888","lamtamnhu@.gmail.com","Thái Bình");
        arrEmployee [6]= new Employee("NV7","Đặng Văn Linh",Gender.MALE,
                LocalDate.of(1997,11,1),
                "0347676799","vanlinh@.gmail.com","Hà Nội");
        System.out.println("Danh sách nhân viên: ");
        for (Employee employee:arrEmployee){
            System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                    +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                    +employee.adress);
        }
        System.out.println("-------------------------------------");
        System.out.println("Nhập id nhân viên bạn muốn tìm: ");
        String fId=sc.nextLine();
        for (Employee employee:arrEmployee){
         if (employee.id.equals(fId)){
             System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                     +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                     +employee.adress);
         }
        }
        System.out.println("-------------------------------------");
        System.out.println("Nhập tên nhân viên bạn muốn tìm: ");
        String fName = sc.nextLine();
        for (Employee employee:arrEmployee){
            if (employee.name.contains(fName)){
                System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                        +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                        +employee.adress);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Danh sách nhân viên nam: ");
        for (Employee employee:arrEmployee){
            if (employee.gender.equals(Gender.MALE)){
                System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                        +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                        +employee.adress);
            }
        }
        System.out.println();
        System.out.println("Danh sách nhân viên nữ: ");
        for (Employee employee:arrEmployee){
            if (employee.gender.equals(Gender.FEMALE)){
                System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                        +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                        +employee.adress);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Các nhân viên có địa chỉ ở Hà Nội là:");
        for (Employee employee:arrEmployee){
            if (employee.adress.equalsIgnoreCase("Hà Nội")){
                System.out.println(employee.id+" - "+employee.name+" - "+employee.gender+" - "
                        +employee.dateOfBirth +" - "+employee.mobile+" - "+employee.email+" - "
                        +employee.adress);
            }
        }


    }
}
