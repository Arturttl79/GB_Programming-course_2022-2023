package seminar4_task1;

// Интерфейс PaymentGateway, который наш класс зависит от него
public interface PaymentGateway {
    boolean processPayment(double amount);
}