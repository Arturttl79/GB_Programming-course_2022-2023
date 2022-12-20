/* Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
и возвращает значение этого элемента или же указание, что такого элемента нет.

Например, задан массив:
* 1 4 7 2
* 5 9 2 3
* 8 4 2 4
* 17 -> такого числа в массиве нет
*/

//получить размерность массива с консоли
int GetNumber(string message)
{
    int result = 0;
    while (true)
    {
        System.Console.WriteLine(message);

        if (int.TryParse(Console.ReadLine(), out result) && result > 0)
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

//заполнение матрицы рандомными числами
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

//распечатать матрицу на консоль
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

int elementRowPosition = GetNumber("Введите позицию требуемой строки (позиция начинается с нуля): ");
int elementColumnPosition = GetNumber("Введите позицию требуемого столбца (позиция начинается с нуля): ");

if(elementRowPosition > matrix.GetLength(0) - 1 || elementColumnPosition > matrix.GetLength(1) - 1)
    System.Console.WriteLine("такой позиции в массиве нет!");
else
{
    PrintMatrix(matrix);
    System.Console.WriteLine($"Значение элемента в позиции [{elementRowPosition};{elementColumnPosition}] = {matrix[elementRowPosition, elementColumnPosition]}");
}