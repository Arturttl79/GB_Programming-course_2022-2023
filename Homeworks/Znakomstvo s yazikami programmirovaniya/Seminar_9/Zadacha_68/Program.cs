/* Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
m = 2, n = 3 -> A(m,n) = 9
m = 3, n = 2 -> A(m,n) = 29
*/

long GetNumber(string message)
{
    long result;
    System.Console.Write(message);

    while (true)
    {
        if (long.TryParse(Console.ReadLine(), out result) && result >= 0)
            break;
        else
            System.Console.WriteLine("Вы ввели некорректные данные. Введите заново число.");
    }
    return result;
}

long AckermannFunction(long m, long n)
{
    if (m == 0) return n + 1;
    else if (m > 0 && n == 0) return AckermannFunction(m - 1, 1);
    else return AckermannFunction(m - 1, AckermannFunction(m, n - 1));
}

long m = GetNumber("Введите первое число для функции Аккермана: ");
long n = GetNumber("Введите второе число для функции Аккермана: ");
long result = AckermannFunction(m, n);
System.Console.WriteLine($"m = {m}, n = {n} -> A(m,n) = {result}");