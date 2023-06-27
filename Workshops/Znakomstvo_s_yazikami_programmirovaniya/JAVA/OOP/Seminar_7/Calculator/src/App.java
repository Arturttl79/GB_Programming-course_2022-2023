/*
Калькулятор комплексных чисел - сложение, умножение и деление.
За основу берём калькулятор с семинара.
*/ 

public class App {
  public static void main(String[] args) throws Exception {
      
      // Примеряем паттерн Декоратор - мы хотим использовать класс логгера для дополнения неизменяемого класса калькулятора методами логгирования.
      // Создаём экземпляр "фабрики", которая создаёт через метод create() "продукт" - декоратор калькулятора LogCalculator, с подключенным логгером.
      iCalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());

      // Запускаем вьюшку, отвечающую за вывод программы.
      ViewCalculator view = new ViewCalculator(calculableFactory);
      view.run();
  }
}