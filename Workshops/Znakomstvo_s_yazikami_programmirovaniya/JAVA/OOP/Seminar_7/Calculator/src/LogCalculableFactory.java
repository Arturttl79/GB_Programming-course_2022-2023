// "Фабрика", которая создаёт наш декоратор LogCalculator, с помощью которого мы добавляем логгер к калькулятору.

public class LogCalculableFactory implements iCalculableFactory{

  private iLoggable logger;

  public LogCalculableFactory(iLoggable logger){
      this.logger = logger;
  }
  @Override
  public iCalculable create(double primaryReal, double primaryImaginary) {
      return new LogCalculator(new Calculator(primaryReal, primaryImaginary), logger);
  }
}