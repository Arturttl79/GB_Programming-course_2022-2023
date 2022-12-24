/* Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
В итоге получается вот такой массив:
7 4 2 1
9 5 3 2
8 4 4 2
*/

int GetNumber(string message)
{
    int result;
    while (true)
    {
        if(int.TryParse(Console.ReadLine(), out result))
            break;
        else
            System.Console.WriteLine("Введите корректное число.");
    }
    return result;
}

int n = GetNumber("Введите число: ");
System.Console.WriteLine(n);