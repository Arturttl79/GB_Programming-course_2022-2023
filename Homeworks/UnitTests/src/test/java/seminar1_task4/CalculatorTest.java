package seminar1_task4;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Получение цены со скидкой: проверка правильности возвращаемых значений")
    void testCalculateDiscount() {

        // Проверяем на целых числах
        assertThat(calculator.calculateDiscount(100, 20)).isEqualTo(80);

        // Проверяем на числах с десятичными знаками
        assertThat(calculator.calculateDiscount(100.1, 20)).isEqualTo(80.08);
        assertThat(calculator.calculateDiscount(100, 25.5)).isEqualTo(74.5);

        // Проверяем на числах с нулевой скидкой (нулевую цену передавать нельзя)
        assertThat(calculator.calculateDiscount(100, 0)).isEqualTo(100);

        // Проверяем на выброс правильного типа исключения при передаче нулевой цены
        assertThatThrownBy(() -> calculator.calculateDiscount(0, 20))
                .isInstanceOf(ArithmeticException.class);

        // Проверяем на выброс правильной формулировки исключения при передаче нулевой цены
        assertThatThrownBy(() -> calculator.calculateDiscount(0, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("По ДЗ в ф-ю передаётся сумма покупки. Значит, это должно быть положительное число.");

        // Проверяем на выброс правильного исключения при передаче отрицательной цены
        assertThatThrownBy(() -> calculator.calculateDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class).hasMessage("По ДЗ в ф-ю передаётся сумма покупки. Значит, это должно быть положительное число.");

        // Проверяем на выброс правильного исключения при передаче отрицательной скидки
        assertThatThrownBy(() -> calculator.calculateDiscount(100, -20))
                .isInstanceOf(ArithmeticException.class).hasMessage("Процент скидки не может быть отрицательным и не может превышать 100%");

        // Проверяем на выброс правильного исключения при передаче скидки > 100%
        assertThatThrownBy(() -> calculator.calculateDiscount(100, 200))
                .isInstanceOf(ArithmeticException.class).hasMessage("Процент скидки не может быть отрицательным и не может превышать 100%");
    }


//    @BeforeAll
//    public static void initAll() {
//        System.out.printf("Hiii!!!!!");
//    }
//
//    @AfterAll
//    public static void tearDownAll() {
//        System.out.printf("END!");    }
//
//    @AfterEach
//    public void tearDown() {
//        calculator = null; // Очистка после каждого теста
//    }
//
//    @Test
//    @DisplayName("Проверка равенства значений")
//    void testAssertEquals() {
//        assertEquals(4, calculator.add(2, 2));
//    }
//
//    @Test
//    @DisplayName("Проверка неравенства значений")
//    void testAssertNotEquals() {
//        assertNotEquals(5, calculator.add(2, 2));
//    }
//
//    @Test
//    @DisplayName("Проверка истинного условия")
//    void testAssertTrue() {
//        assertTrue(calculator.add(2, 2) == 4);
//    }
//
//    @Test
//    @DisplayName("Проверка ложного условия")
//    void testAssertFalse() {
//        assertFalse(calculator.add(2, 2) == 5);
//    }
//
//    @Test
//    @DisplayName("Проверка наличия объекта")
//    void testAssertNotNull() {
//        assertNotNull(calculator);
//    }
//
//    @Test
//    @DisplayName("Проверка отсутствия объекта")
//    void testAssertNull() {
//        calculator = null;
//        assertNull(calculator);
//    }
//
//    @Test
//    @DisplayName("Проверка равенства массивов")
//    void testAssertArrayEquals() {
//        int[] expected = {1, 2, 3};
//        int[] actual = {1, 2, 3};
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    @DisplayName("Проверка на генерацию исключений")
//    void testAssertThrows() {
//        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
//    }
//
//    // Дополнительные ассерты
//    @Test
//    @DisplayName("Проверка с сообщением")
//    void testAssertWithMessage() {
//        assertEquals(4, calculator.add(2, 2), "2 + 2 должно быть равно 4");
//    }
//
//    @Test
//    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
//    void testAssertWithLambdaMessage() {
//        assertEquals(4, calculator.add(2, 2), () -> "2 + 2 должно быть равно 4");
//    }
}