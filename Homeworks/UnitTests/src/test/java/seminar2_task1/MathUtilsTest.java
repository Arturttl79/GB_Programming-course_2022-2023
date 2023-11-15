package seminar2_task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 6",
                "0, 5, 0",
                "-2, -4, 8",
                "10, -2, -20"})
    public void testMultiply(int a, int b, int expectedResult) {
        int result = MathUtils.multiply(a, b);
        assertEquals(expectedResult, result, "Некорректное умножение");
    }
}