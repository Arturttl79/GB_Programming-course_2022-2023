/* Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. 
Выполнить с помощью рекурсии.
N = 5 -> "5, 4, 3, 2, 1"
N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"
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

string ReturnResult(int number)
{
    if (number == 1)
        return number.ToString();
    else
    {
        return number + ", " + ReturnResult(number - 1);
    }
}

int number = GetNumber("Введите положительное целое число: ");
System.Console.WriteLine(ReturnResult(number));