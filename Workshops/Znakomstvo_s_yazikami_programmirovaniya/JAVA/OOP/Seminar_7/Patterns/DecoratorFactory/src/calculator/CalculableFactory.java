package calculator;

public class CalculableFactory implements iCalculableFactory {
    public iCalculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
