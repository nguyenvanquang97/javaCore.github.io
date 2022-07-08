import java.util.ArrayList;

public class User {
    private String phoneNumber;
    private String passWood;
    private String accountNumber;
    private long AccountBalance;


    public User() {
    }

    public User(String phoneNumber, String passWood, String accountNumber, long accountBalance ) {
        this.phoneNumber = phoneNumber;
        this.passWood = passWood;
        this.accountNumber = accountNumber;
        AccountBalance = accountBalance;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWood() {
        return passWood;
    }

    public void setPassWood(String passWood) {
        this.passWood = passWood;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        AccountBalance = accountBalance;
    }
}

