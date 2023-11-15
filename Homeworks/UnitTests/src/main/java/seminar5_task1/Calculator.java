package seminar5_task1;

public class Calculator {

    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public int add(int a, int b) {
        int result = a + b;
        logger.log("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        logger.log("Вычитание: " + a + " - " + b + " = " + result);
        return result;
    }
}
