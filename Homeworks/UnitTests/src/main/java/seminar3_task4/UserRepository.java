package seminar3_task4;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public void unauthenticateAllExceptAdmins() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }
}
