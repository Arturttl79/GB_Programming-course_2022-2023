Console.WriteLine("Введите число: ");
string numberStr = Console.ReadLine() ?? "";
int number = Convert.ToInt32(numberStr);

int result = number * number;

Console.WriteLine($"Квадрат числа {number} = {result}");