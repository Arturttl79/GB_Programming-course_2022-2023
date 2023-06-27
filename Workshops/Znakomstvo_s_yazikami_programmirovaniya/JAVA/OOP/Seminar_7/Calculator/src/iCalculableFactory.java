// Интерфейс для "фабрик":
// - CalculableFactory (создаёт калькулятор);
// - LogCalculableFactory (создаёт декоратор LogCalculator, с помощью которого мы добавляем логгер к калькулятору).

public interface iCalculableFactory {
  iCalculable create(double primaryReal, double primaryImaginary);
}