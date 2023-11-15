package seminar3_task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberInIntervalTest {

    @ParameterizedTest
    @CsvSource({"2, false", "33, true", "25, true", "100, true", "188, false"})
    public void numberInIntervalTest(int n, boolean expectedResult) {

        // Создаём эксземпляр класса
        NumberInInterval task = new NumberInInterval();

        // Проверяем работу метода numberInInterval на параметрах из @CsvSource
        boolean result = task.numberInInterval(n);

        assertEquals(expectedResult, result); // JUnit
        assertThat(result).isEqualTo(expectedResult); // AssertJ
    }
}
