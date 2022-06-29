import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
    StudentService service;
    ArrayList<Student> listStudent;
    Scanner sc;

    public Controller() {
        service = new StudentService();
        listStudent = service.getAllStudent();
        sc = new Scanner(System.in);
    }

    public void main(){
        while (true){
            Util.menu();
            System.out.println("Lựa chọn của bạn là: ");
            int choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1:
                    show();
                    break;
                case 2:
                    showStudentListByClass();
                    break;
                case 3:
                    Student newStudent = createNewStudent();
                    service.addNewStudent(listStudent, newStudent);
                    break;
                case 4:
                    updateStudentPoint();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                   Util.submenu();
                    System.out.println("Lựa chọn của bạn là: ");
                    int choose2 = Integer.parseInt(sc.nextLine());
                    switch (choose2){
                        case 1:
                            sortListByName();
                            break;
                        case 2:
                            sortListByAge();
                            break;
                        case 3:
                            sortListByPoint();
                            break;
                        default:
                            System.out.println("Không có lựa chọn này!");
                    }

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void show(){
        for (Student s : listStudent){
            System.out.println(s);
        }
    }

    public Student createNewStudent(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập điểm: ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lớp: ");
        String classroom = sc.nextLine();

        Student newStudent = new Student(id, name, age, address, point, classroom);
        return newStudent;
    }

    public Student findStudentById(){
        System.out.println("Nhập id học sinh: ");
        int id = Integer.parseInt(sc.nextLine());

        for(Student s : listStudent){
            if(s.getId() == id){
                return s;
            }
        }

        return null;
    }
    public void updateStudentPoint(){
        Student fStudent = findStudentById();
        if(fStudent != null){
            System.out.println(fStudent);
        }else {
            System.out.println("Không tìm thấy học sinh");
        }
        System.out.println("Nhập điểm mới: ");
        double newPoint = Double.parseDouble(sc.nextLine());

        service.updateStudentPoint(fStudent, newPoint);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(fStudent);
    }

    public void deleteStudent(){
        Student fStudent = findStudentById();
        if(fStudent != null){
            System.out.println(fStudent);
        }else {
            System.out.println("Không tìm thấy học sinh");
        }
        service.deleteStudent(listStudent, fStudent);
    }
    public ArrayList<Student> showStudentListByClass() {
        System.out.println("Nhập lớp bạn muốn xem: ");
        String a =sc.nextLine();
        ArrayList<Student> classStudent = new ArrayList<>();
        for (Student s : listStudent) {
            if (s.getClassroom().toLowerCase().contains(a.toLowerCase())) {
                classStudent.add(s);
                System.out.println(s);
            }


        }
        return classStudent;
    }
    public void sortListByName() {
        listStudent.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tên: ");
        for (Student s:listStudent){
            System.out.println(s);
        }
    }
    public void sortListByAge() {
        listStudent.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo tuổi: ");
        for (Student s:listStudent){
            System.out.println(s);
        }
    }
    public void sortListByPoint() {
        listStudent.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (Math.round(o1.getPoint())- Math.round(o2.getPoint()));
            }
        });
        System.out.println("Danh sách sau khi sắp xếp theo điểm: ");
        for (Student s:listStudent){
            System.out.println(s);
        }
    }
}