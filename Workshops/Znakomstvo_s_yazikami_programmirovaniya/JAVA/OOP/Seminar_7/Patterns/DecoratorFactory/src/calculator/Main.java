package calculator;

public class Main {
    public static void main(String[] args) {
        iCalculableFactory calculableFactory = new DecLogCalcFactory(new Logger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
