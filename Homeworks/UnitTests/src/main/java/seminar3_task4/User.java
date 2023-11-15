package seminar3_task4;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        isAuthenticate = this.name.equals(name) && this.password.equals(password);
        return isAuthenticate;
    }
}
