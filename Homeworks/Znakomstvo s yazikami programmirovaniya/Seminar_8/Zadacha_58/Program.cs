/* Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Например, даны 2 матрицы:
2 4 | 3 4
3 2 | 3 3
Результирующая матрица будет:
18 20
15 18
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

int[,] MultiplyMatrix(int[,] firstMatrix, int[,] secondMatrix)
{
    int[,] resultMatrix = new int[firstMatrix.GetLength(0), secondMatrix.GetLength(1)];
    int count;

    for (int i = 0; i < resultMatrix.GetLength(0); i++)
    {
        for (int j = 0; j < resultMatrix.GetLength(1); j++)
        {
            count = 0;
            while(count < firstMatrix.GetLength(1))
            {
                resultMatrix[i, j]+= firstMatrix[i, count] * secondMatrix[count, j];
                count++;
            }
        }
    }
    return resultMatrix;        
}

int mFirstMatrix = GetNumber("Введите кол-во строк первого массива: ");
int nFirstMatrix = GetNumber("Введите кол-во столбцов первого массива: ");
int mSecondMatrix = GetNumber("Введите кол-во строк второго массива: ");
int nSecondMatrix = GetNumber("Введите кол-во столбцов второго массива: ");
int[,] firstMatrix = InitMatrix(mFirstMatrix, nFirstMatrix);
int[,] secondMatrix = InitMatrix(mSecondMatrix, nSecondMatrix);

while(true)
{
    if(firstMatrix.GetLength(1) == secondMatrix.GetLength(0))
    {
        System.Console.WriteLine();
        System.Console.WriteLine("Первая заданная матрица: ");
        PrintMatrix(firstMatrix);
        System.Console.WriteLine("Вторая заданная матрица: ");
        PrintMatrix(secondMatrix);
        System.Console.WriteLine("Результат умножения матриц: ");
        PrintMatrix(MultiplyMatrix(firstMatrix, secondMatrix));
        break;
    }
    else
        System.Console.WriteLine("Кол-во столбцов первой матрицы должно совпадать с кол-вом строк второй матрицы.");
    System.Console.WriteLine();
}