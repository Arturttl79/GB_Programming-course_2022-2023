// "Фабрика", создающая "продукт" - калькулятор.
public class CalculableFactory implements iCalculableFactory {
    
  public iCalculable create(double primaryReal, double primaryImaginary) {
      return new Calculator(primaryReal, primaryImaginary);
  }
}