//распечатать массив на консоль
void PrintMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            System.Console.Write($"{matrix[i, j]} ");
        }
        System.Console.WriteLine();
    }
    System.Console.WriteLine();
}


int[,] arr = 
{
    {1, 4, 7, 2 },
    {5, 9, 2, 3 },
    {8, 4, 2, 4 },
    {5, 2, 6, 7 }
};

int[] line0 = new int[arr.GetLength(1)];
int[] line1 = new int[arr.GetLength(1)];

for (int i = 0; i < line0.Length; i++)
{
    line0[i] = arr[0, i];
}

for (int i = 0; i < line0.Length; i++)
{
    line1[i] = arr[arr.GetLength(0) - 1, i];
}

PrintMatrix(arr);

for (int i = 0; i < line0.Length; i++)
{
    arr[0, i] = line1[i];
}

for (int i = 0; i < line0.Length; i++)
{
    arr[arr.GetLength(0) - 1, i] = line0[i];
}

Console.WriteLine();
Console.WriteLine();
PrintMatrix(arr);
