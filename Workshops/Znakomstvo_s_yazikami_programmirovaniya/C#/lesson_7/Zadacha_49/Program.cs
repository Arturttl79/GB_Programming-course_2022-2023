/* Задача 49: Задайте двумерный массив. Найдите элементы, у которых оба индекса чётные, 
и замените эти элементы на их квадраты.
Например, изначально массив
 выглядел вот так:
1 4 7 2
5 9 2 3
8 4 2 4
Новый массив будет выглядеть 
вот так:
1 4 7 2
5 81 2 9
8 4 2 4

*/

//получить размерность массива с консоли
int GetNumber(string message)
{
    int result = 0;
    while (true)
    {
        System.Console.WriteLine(message);

        if (int.TryParse(Console.ReadLine(), out result))
        {
            break;
        }
        else
        {
            System.Console.WriteLine("Vveli nevernye danniye. Vvedite korrektnoe chislo");
        }
    }
    return result;
}

int[,] InitMatrix(int rows, int columns)
{
    int[,] matrix = new int[rows, columns];
    Random rnd = new Random();

    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            matrix[i,j] = rnd.Next(1, 10);
        }
    }
    return matrix;
}

//замена элементов четных массива на квадрат
int[,] GetMatrix(int[,] matrix)
{
    for (int i = 0; i < matrix.GetLength(0); i++)
    {
        for (int j = 0; j < matrix.GetLength(1); j++)
        {
            if(i % 2 == 1 && j % 2 == 1)
                matrix[i,j] = matrix[i,j] * matrix[i,j];
        }
    }
    return matrix;
}


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

int rows = GetNumber("Введите кол-во строк: ");
int columns = GetNumber("Введите кол-во столбцов: ");
int[,] matrix = InitMatrix(rows, columns);
PrintMatrix(matrix);
GetMatrix(matrix);
PrintMatrix(matrix);