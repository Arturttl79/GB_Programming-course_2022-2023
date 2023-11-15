package seminar4_task1;

import java.util.ArrayList;
import java.util.List;

public class FakePaymentGateway implements PaymentGateway {

    private List<Double> paymentHistory = new ArrayList<>();

    @Override
    public boolean processPayment(double amount) {

        paymentHistory.add(amount);

        // Здесь может быть альтернативная логика обработки платежа, но она не выполняется.
        return true;
    }

    public List<Double> getPaymentHistory() {
        return paymentHistory;
    }
}