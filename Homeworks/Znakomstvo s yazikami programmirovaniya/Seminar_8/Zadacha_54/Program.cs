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
    System.Console.WriteLine(message);

    while (true)
    {
        if (int.TryParse(Console.ReadLine(), out result))
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

void AssortMatrix(int[,] matrix)
{
    int temp;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 1; j < matrix.GetLength(1); j++)
        {
            if (matrix[i, j] > matrix[i, j - 1])
            {
                temp = matrix[i, j - 1];
                matrix[i, j - 1] = matrix[i, j];
                matrix[i, j] = temp;
                j = 0;
            }
        }
    }
}

int m = GetNumber("Введите кол-во строк массива: ");
int n = GetNumber("Введите кол-во столбцов массива: ");
int[,] matrix = InitMatrix(m, n);
PrintMatrix(matrix);
AssortMatrix(matrix);
PrintMatrix(matrix);