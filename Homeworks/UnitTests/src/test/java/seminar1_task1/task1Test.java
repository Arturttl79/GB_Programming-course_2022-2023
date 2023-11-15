package seminar1_task1;

//import org.junit.Test;
import org.junit.jupiter.api.*;

public class task1Test {
    @Test
    public void testMethod() {
        //assertEquals(5, 2 + 3);
    }

    @BeforeEach
    public void setup() {
        // Инициализация ресурсов
    }

    @AfterEach
    public void teardown() {
        // Очистка ресурсов
    }

    @BeforeAll
    public static void globalSetup() {
        // Инициализация
    }

    @AfterAll
    public static void globalTeardown() {
        // Очистка
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        //assertEquals(5, 2 + 3);
    }

//    @Test
//    @Disabled
//    public void testMethod() {
//        // этот тест не будет запущен
//    }

//    @ParameterizedTest
//    @ValueSource(ints = {1, 2, 3})
//    public void testMethod(int argument) {
//        assertTrue(argument > 0);
//    }
}
