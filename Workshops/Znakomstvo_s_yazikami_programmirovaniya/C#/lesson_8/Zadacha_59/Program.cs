/* Задача 59: Задайте двумерный массив из целых чисел. Напишите программу, 
которая удалит строку и столбец, на пересечении которых расположен наименьший элемент массива.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
5 2 6 7
Наименьший элемент - 1, на выходе получим 
следующий массив:
9 4 2
2 2 6
3 4 7
*/

void PrintMatrix(int[,] mtrx)
{
    for (int i = 0; i < mtrx.GetLength(0); i++)
    {
        for (int j = 0; j < mtrx.GetLength(1); j++)
        {
            Console.Write($"{mtrx[i, j]} ");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}

int[,] GenerateRandomMatrix(int min, int max, int m, int n)
{
    int[,] mtrx = new int[m, n];
    Random r = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            mtrx[i, j] = r.Next(min, max + 1);
        }
    }
    return mtrx;
}

int[,] GetMatrix(int[,] matrix)
{
    int m = 0;
    int n = 0;
    int[,] getMatrix = new int[matrix.GetLength(0) - 1, matrix.GetLength(1) - 1];
    int minimum = matrix[0, 0];
    int x = 0;
    int y = 0;
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if(minimum > matrix[i, j])
            {
                minimum = matrix[i, j];
                x = i;
                y = j;
            }
        }
    }

    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        if(i != x)
            for (int j = 0; j < matrix.GetLength(1); j++)
            {
                if(j != y)
                {
                    getMatrix[m, n] = matrix[i, j];
                    n++;
                }
                else
                    continue;
            }
        else
            continue;
    n = 0;
    m++;
    }
    return getMatrix;
}

int[,] randMatrix = GenerateRandomMatrix(0, 9, 4, 6);
PrintMatrix(randMatrix);
PrintMatrix(GetMatrix(randMatrix));
