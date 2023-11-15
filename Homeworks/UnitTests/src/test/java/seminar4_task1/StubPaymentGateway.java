package seminar4_task1;

public class StubPaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        // Имитация обработки платежа
        if (amount > 0) {
            return true; // Успешный платеж
        } else {
            return false; // Неуспешный платеж
        }
    }
}