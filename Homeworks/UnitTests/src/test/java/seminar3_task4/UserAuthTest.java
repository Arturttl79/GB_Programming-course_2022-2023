package seminar3_task4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAuthTest {

    User user1;
    User user2;
    User user3;
    UserRepository userRepository;

    @BeforeEach
    void init() {

        // Создаём юзеров
        user1 = new User("Maxim", "qwerty", true);
        user2 = new User("Boris", "12345", false);
        user3 = new User("Svetlana", "asdfg", false);

        // Добавляем юзеров в репозиторий (UserRepository.data)
        userRepository = new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);

        // Все юзеры проходят аутентификацию
        user1.authenticate("Maxim", "qwerty");
        user2.authenticate("Boris", "12345");
        user3.authenticate("Svetlana", "asdfg");
    }

    @Test
    @DisplayName("Проверка, что все юзеры успешно прошли аутентификацию")
    void authenticateTest() {
        for (User user : userRepository.data) {
            assertEquals(true, user.isAuthenticate); // JUnit
            assertThat(true).isEqualTo(user.isAuthenticate); // AssertJ
        }
    }

    @Test
    @DisplayName("Проверка unauthenticateAllExceptAdmins() - все юзеры кроме админов должны разлогиниться")
    void unauthenticateAllExceptAdminsTest() {
        userRepository.unauthenticateAllExceptAdmins();
        for (User user : userRepository.data) {
            assertEquals(user.isAdmin, user.isAuthenticate); // JUnit
            assertThat(user.isAdmin).isEqualTo(user.isAuthenticate); // AssertJ
        }
    }
}
