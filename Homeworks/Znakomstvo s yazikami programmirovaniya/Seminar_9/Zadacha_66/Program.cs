/* Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму 
натуральных элементов в промежутке от M до N.
M = 1; N = 15 -> 120
M = 4; N = 8. -> 30
*/

int GetNumber(string message)
{
    int result;
    System.Console.Write(message);

    while (true)
    {
        if (int.TryParse(Console.ReadLine(), out result) && result > 0)
            break;
        else
            System.Console.WriteLine("Вы ввели некорректные данные. Введите заново число.");
    }
    return result;
}

int FindSumm(int m, int n)
{
        if (m == n) return m;
        else return m + FindSumm(m + 1, n);
}

int m = GetNumber("Введите число M: ");
int n = GetNumber("Введите число N: ");
if (m > n)
{
    System.Console.WriteLine("Число М должно быть меньше N!");
}
else
{
    int summ = FindSumm(m, n);
    System.Console.WriteLine($"M = {m}; N = {n} -> {summ}");
}