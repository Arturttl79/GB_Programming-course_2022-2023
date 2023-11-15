package seminar3_task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(3, 1);
        assertEquals(2, result);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(3, 2);
        assertEquals(6, result);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void divide() {
        int result = calculator.divide(4, 2);
        assertEquals(2, result);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void divideExceptions() {
        assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("Division by zero is not allowed.");

    }

// Проверка на передачу символов вместо цифр
//    @Test
//    public void testAddDoesNotAcceptChar() {
//        try {
//            char invalidChar = 'a';
//            int result = calculator.add(2, invalidChar);
//        } catch (IllegalArgumentException e) {
//            assertThat(e.getMessage()).isEqualTo("Input must be an integer.");
//        }
//    }
}