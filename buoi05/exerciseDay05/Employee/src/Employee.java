import java.time.LocalDate;

public class Employee {
    public String id;
    public String name;
    public Gender gender;
    public LocalDate dateOfBirth;
    public String mobile;
    public String email;
    public String adress;

    public Employee() {
    }

    public Employee(String id, String name, Gender gender, LocalDate dateOfBirth, String mobile, String email, String adress) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.mobile = mobile;
        this.email = email;
        this.adress = adress;
    }
}
