package seminar5_task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIntegrationTest {

    @Test
    public void testCalculatorIntegration() {

        // Создаем логгер для тестирования
        Logger logger = new Logger();

        // Создаем калькулятор, передавая логгер
        Calculator calculator = new Calculator(logger);

        // Выполняем операции с калькулятором
        calculator.add(5, 3);
        calculator.subtract(10, 4);

        // Получаем логи из логгера
        List<String> logs = logger.getLogs();

        // Проверяем, что логи записаны правильно
        assertEquals(2, logs.size());
        assertEquals("Сложение: 5 + 3 = 8", logs.get(0));
        assertEquals("Вычитание: 10 - 4 = 6", logs.get(1));
    }
}