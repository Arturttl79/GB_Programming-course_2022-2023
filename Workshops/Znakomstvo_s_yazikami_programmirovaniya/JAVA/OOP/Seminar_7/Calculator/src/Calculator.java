// Неизменяемый класс калькулятора.

public final class Calculator implements iCalculable {

  // Действительная часть комплексного числа
  private double real;

  // Мнимая часть комплексного числа
  private double imaginary;

  // Конструктор
  public Calculator(double primaryReal, double primaryImaginary) {
      this.real = primaryReal;
      this.imaginary = primaryImaginary;
  }

  // Суммируем 
  @Override
  public iCalculable sum(double argReal, double argImaginary) {
      this.real += argReal;
      this.imaginary += argImaginary;
      return this;
  }

  // Умножаем
  @Override
  public iCalculable multi(double argReal, double argImaginary) {
      this.real = this.real * argReal - this.imaginary * argImaginary;
      this.imaginary = this.real * argImaginary + this.imaginary * argReal;
      return this;
  }

  // Делим
  @Override
  public iCalculable devide(double argReal, double argImaginary) {
      double denominator = argReal * argReal + argImaginary * argImaginary;
      this.real = (this.real * argReal + this.imaginary * argImaginary) / denominator;
      this.imaginary = (this.imaginary * argReal - this.real * argImaginary) / denominator;
      return this;
  }
  
  // Возвращаем результат в виде массива из двух элементов: получившейся действительной и мнимой части комплексного числа
  @Override
  public double[] getResult() {
      return new double[] {this.real, this.imaginary};
  }

}