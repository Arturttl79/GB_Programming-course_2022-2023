// Для всех операций принимаем два числа - действительную часть комплексного числа и мнимую.
// На семинаре мы принимали целые числа.
// Здесь придётся использовать double, т.к. будет деление, а оно не всегда целочисленное.
public interface iCalculable {
  iCalculable sum(double real, double imaginary);
  iCalculable multi(double real, double imaginary);
  iCalculable devide(double real, double imaginary);
  double[] getResult();
}