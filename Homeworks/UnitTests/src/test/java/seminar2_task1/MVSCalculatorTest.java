package seminar2_task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MVSCalculatorTest {

    private MVSCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new MVSCalculator();
    }

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        //assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}