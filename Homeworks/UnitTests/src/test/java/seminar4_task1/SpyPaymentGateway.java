package seminar4_task1;

public class SpyPaymentGateway implements PaymentGateway {

    private int processPaymentCallCount = 0;

    @Override
    public boolean processPayment(double amount) {

        processPaymentCallCount++;

        // Возвращаем true, как настоящий платежный шлюз
        return true;
    }

    public int getProcessPaymentCallCount() {
        return processPaymentCallCount;
    }
}