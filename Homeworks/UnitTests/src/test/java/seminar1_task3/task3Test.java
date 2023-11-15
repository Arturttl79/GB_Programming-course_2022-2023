package seminar1_task3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class task3Test {
    public static void main(String[] args) {
        int x = -1;
        // Проверяем, что x неотрицательно с использованием оператора assert
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println("Программа продолжает выполнение");
    }
    // Аннотация @Test указывает, что метод testAssertions() является тестовым методом
    @Test
    public void testAssertions() {
        // Примеры использования AssertJ для проверки утверждений

        // Создаем строку для тестирования
        String text = "Hello, World";

        // Проверяем, что строка не равна null
        Assertions.assertThat(text).isNotNull();

        // Проверяем, что строка начинается с "Hello"
        Assertions.assertThat(text).startsWith("Hello");

        // Проверяем, что строка заканчивается на "World"
        Assertions.assertThat(text).endsWith("World");

        // Проверяем, что строка содержит подстроку "lo, W"
        Assertions.assertThat(text).contains("lo, W");
    }
}
