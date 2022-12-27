/* Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, 
которая будет находить строку с наименьшей суммой элементов.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
5 2 6 7
Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка
*/

int GetNumber(string message)
{
    int result;
    System.Console.WriteLine(message);
    
    while (true)
    {
        if(int.TryParse(Console.ReadLine(), out result))
            break;
        else
            System.Console.WriteLine("Введите корректное число.");
    }
    return result;
}

int[,] InitMatrix(int m, int n)
{
    int[,] matrix = new int[m, n];    
    Random rnd = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            matrix[i, j] = rnd.Next(1, 10);
        }
    }
    return matrix;
}

void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            System.Console.Write(matrix[i, j] + " ");
        }
        System.Console.WriteLine();
    }
    System.Console.WriteLine();
}

int RowWithMinSumm(int[,] matrix)
{
    int[] summ = new int[matrix.GetLength(0)];
    int result = 1;
    
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            summ[i]+=matrix[i, j];
        }
    }

    int minSumm = summ[0];

    for (int k = 0; k < summ.Length; k++)
    {
        if(summ[k] < minSumm)
        {
            minSumm = summ[k];
            result = k + 1;
        }
    }
    return result;        
}

while(true)
{
    int m = GetNumber("Введите кол-во строк массива: ");
    int n = GetNumber("Введите кол-во столбцов массива (число столбцов должно быть отличным от числа строк): ");
    if(m != n)
    {
        int[,] matrix = InitMatrix(m, n);
        PrintMatrix(matrix);
        int result = RowWithMinSumm(matrix);
        System.Console.WriteLine($"В данном двумерном массиве наименьшая сумма элементов в {result} строке!");
        break;
    }
    else 
        System.Console.WriteLine("Кол-во строк и столбцов не должно совпадать. Введите заново данные.");
    System.Console.WriteLine();
}