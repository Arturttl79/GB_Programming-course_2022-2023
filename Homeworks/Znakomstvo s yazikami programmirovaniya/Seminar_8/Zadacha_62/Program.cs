/* Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.
Например, на выходе получается вот такой массив:
01 02 03 04
12 13 14 05
11 16 15 06
10 09 08 07
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
            System.Console.WriteLine("Введите корректное число.");
    }
    return result;
}

void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if (matrix[i, j] < 10)
                System.Console.Write("0" + matrix[i, j] + " ");
            else
                System.Console.Write(matrix[i, j] + " ");
        }
        System.Console.WriteLine();
    }
    System.Console.WriteLine();
}

void FillArrayBySpiral(int[,] matrix)
{
    int startNumber = GetNumber("Введите начальное число для спирального заполнения матрицы: ");
    int m = matrix.GetLength(0);

    for (int i = 0; i < m; i++)
    {
        matrix[0, i] = startNumber++;
        matrix[i, m - 1] = startNumber + 2;
        matrix[m - 1, m - 1 - i] = startNumber + 5;
        if (i != m - 1)
        {
            matrix[m - 1 - i, 0] = startNumber + 8;
            matrix[1, i] = startNumber + 10;
            matrix[2, m - 1 - i] = startNumber + 12;
        }
        else 
            break;
    }
}

int[,] matrix = new int[4, 4];
FillArrayBySpiral(matrix);
PrintMatrix(matrix);