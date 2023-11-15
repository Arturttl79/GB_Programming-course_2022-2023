package seminar4_task1;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentProcessorMockTest {

    @Test
    public void testMakePaymentWithSuccessfulPayment() {

        // Создаем мок-объект PaymentGateway
        PaymentGateway mockGateway = mock(PaymentGateway.class);

        // Устанавливаем, что при вызове processPayment с любой суммой должен вернуться true
        when(mockGateway.processPayment(anyDouble())).thenReturn(true);

        // Создаем экземпляр PaymentProcessor, передавая мок-объект
        PaymentProcessor processor = new PaymentProcessor(mockGateway);

        // Вызываем метод makePayment с суммой 100.0
        boolean result = processor.makePayment(100.0);

        // Проверяем, что метод processPayment был вызван ровно один раз с любой суммой
        verify(mockGateway, times(1)).processPayment(anyDouble());

        // Проверяем результат, который должен быть true
        assertTrue(result); // JUnit
    }
}