package calculator;


public class DecLogCalc implements iCalculable{
    private iCalculable decorated;
    private iLoggable logger;

    public DecLogCalc(iCalculable decorated, iLoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Pervoe znacheniye kalkulyatora %d. Nachalo vyzova metoda sum", firstArg));
        iCalculable result = decorated.sum(arg);
        logger.log(String.format("Vyzov metoda sum proizoshel"));
        return result;
    }

    @Override
    public iCalculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Pervoe znacheniye kalkulyatora %d. Nachalo vyzova metoda multi", firstArg));
        iCalculable result = decorated.multi(arg);
        logger.log(String.format("Vyzov metoda multi proizoshel"));
        return result;
    }

    @Override
    public int getResult() {
        int result = decorated.getResult();
        logger.log(String.format("Polucheniye rezultata %d", result));
        return result;
    }

    
}
