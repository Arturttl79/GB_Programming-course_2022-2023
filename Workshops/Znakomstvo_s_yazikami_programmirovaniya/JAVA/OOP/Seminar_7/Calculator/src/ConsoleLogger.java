// Класс, который мы в качестве объекта подключаем в декоратор - LogCalculator.
// Выводит лог в консоль.

public class ConsoleLogger implements iLoggable{

  @Override
  public void log(String message) {
      System.out.println("LOG: " + message);
  }
}