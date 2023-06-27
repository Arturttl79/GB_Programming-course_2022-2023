package calculator;

public class DecLogCalcFactory implements iCalculableFactory{
    private iLoggable logger;

    public DecLogCalcFactory(iLoggable logger) {
        this.logger = logger;
    }

    public iCalculable create(int primaryArg) {
        return new DecLogCalc(new Calculator(primaryArg), logger);
    }
}
