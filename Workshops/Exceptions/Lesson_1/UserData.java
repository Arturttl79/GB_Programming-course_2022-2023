package Workshops.Exceptions.Lesson_1;

public class UserData {
    private final String login;
    private final String password;
    private final String confirm;

    public UserData(String login, String password, String confirm) {
        this.login = login;
        this.password = password;
        this.confirm = confirm;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm() {
        return confirm;
    }
}
