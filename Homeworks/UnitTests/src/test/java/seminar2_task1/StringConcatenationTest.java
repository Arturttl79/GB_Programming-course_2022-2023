package seminar2_task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringConcatenationTest {

    @ParameterizedTest
    @CsvSource({"Hello, World!, Hello World!",
                "JUnit, 5, JUnit 5",
                "Java, Programming, Java Programming"})
    public void testConcatenation(String str1, String str2, String expectedResult) {
        String result = StringConcatenation.concatenateStrings(str1, str2);
        assertEquals(expectedResult, result, "Некорректная конкатенация строк");
    }
}
