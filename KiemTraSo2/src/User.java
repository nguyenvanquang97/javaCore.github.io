public class User {
    private String userName;
    private String passWood;
    private String email;

    public User() {
    }

    public User(String userName, String passWood, String email) {
        this.userName = userName;
        this.passWood = passWood;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWood() {
        return passWood;
    }

    public void setPassWood(String passWood) {
        this.passWood = passWood;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



