
Console.WriteLine("Введите число 1");
string input0 = Console.ReadLine() ?? "";
Console.WriteLine("Введите число 2");
string input1 = Console.ReadLine() ?? "";
int num0 = Convert.ToInt32(input0);
int num1 = Convert.ToInt32(input1);

if ((num0 * num0) == num1)
{
    Console.WriteLine($"Число {num0} является квадратом числа {num1}");
} else
{
    Console.WriteLine($"Число {num0} не является квадратом числа {num1}");    
}