/* Задача 57: Составить частотный словарь элементов двумерного массива. 
Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
1, 2, 3 
4, 6, 1 
2, 1, 6
1 встречается 3 раза 
2 встречается 2 раз 
3 встречается 1 раз 
4 встречается 1 раз 
6 встречается 2 раза
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

void CalculateNumbers (int[,] matrix)
{
    int m = matrix.GetLength(0);
    int n = matrix.GetLength(1);
    int numberOfElements = m * n;
    int number = 0;
    int count = 0;
    int total = 0;

    while (total != numberOfElements)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(matrix[i, j] == number)
                {
                    count++;
                }
            }
        }
        if(count>0)
            System.Console.WriteLine($"Число {number} встречается {count} раз;");
        total+= count;
        count = 0;
        number++;
    }
}

int[,] randMatrix = GenerateRandomMatrix(0, 100, 4, 6);
PrintMatrix(randMatrix);
CalculateNumbers(randMatrix);