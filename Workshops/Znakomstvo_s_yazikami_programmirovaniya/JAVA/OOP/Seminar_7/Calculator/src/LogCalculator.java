// Декоратор, с помощью которого мы добавляем логгирование к калькулятору

public class LogCalculator implements iCalculable{

  // Подключаем к классу объект калькулятора и логгера
  private iCalculable decorated;
  private iLoggable logger;

  public LogCalculator(iCalculable decorated, iLoggable logger){
      this.decorated = decorated;
      this.logger = logger;
  }

  // Переопределяем метод сложения, добавив в него логгирование
  @Override
  public iCalculable sum(double argReal, double argImaginary) {
      
      double[] firstArg = decorated.getResult();
      
      logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
      
      logger.log(String.format("Начало вызова метода sum со вторым значением калькулятора: действительная часть "+String.format("%.2f", argReal)+", мнимая часть "+String.format("%.2f", argImaginary)));
      
      iCalculable result = decorated.sum(argReal, argImaginary);
      
      logger.log(String.format("Вызов метода sum произошел"));
      
      return result;
  }

  // Переопределяем метод умножения, добавив в него логгирование
  @Override
  public iCalculable multi(double argReal, double argImaginary) {
      
      double[] firstArg = decorated.getResult();
      
      logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
      
      logger.log(String.format("Начало вызова метода multi со вторым значением калькулятора: действительная часть "+String.format("%.2f", argReal)+", мнимая часть "+String.format("%.2f", argImaginary)));
      
      iCalculable result = decorated.multi(argReal, argImaginary);
      
      logger.log(String.format("Вызов метода multi произошел"));
      
      return result;
  }

  // Переопределяем метод деления, добавив в него логгирование
  @Override
  public iCalculable devide(double argReal, double argImaginary) {
      
      double[] firstArg = decorated.getResult();
      
      logger.log(String.format("Первое значение калькулятора: действительная часть "+String.format("%.2f", firstArg[0])+", мнимая часть "+String.format("%.2f", firstArg[1])));
      
      logger.log(String.format("Начало вызова метода devide со вторым значением калькулятора: действительная часть "+String.format("%.2f", argReal)+", мнимая часть "+String.format("%.2f", argImaginary)));
      
      iCalculable result = decorated.devide(argReal, argImaginary);
      
      logger.log(String.format("Вызов метода devide произошел"));
      
      return result;
  }
  
  // Переопределяем метод возврата результата, добавив в него логгирование
  @Override
  public double[] getResult() {
      double[] result = decorated.getResult();
      logger.log(String.format("Получение результата: действительная часть "+String.format("%.2f", result[0])+", мнимая часть "+String.format("%.2f", result[1])));
      return result;
  }
}