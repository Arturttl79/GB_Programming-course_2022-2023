package seminar4_task1;

// Класс PaymentProcessor, который мы будем тестировать
public class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount) {
        return gateway.processPayment(amount);
    }
}