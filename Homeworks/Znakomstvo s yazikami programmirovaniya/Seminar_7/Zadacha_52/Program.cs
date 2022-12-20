/* Задача 52. Задайте двумерный массив из целых чисел. 
Найдите среднее арифметическое элементов в каждом столбце.

Например, задан массив:
* 1 4 7 2
* 5 9 2 3
* 8 4 2 4
* Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.
*/

//получить размерность массива с консоли
int GetNumber(string message)
{
    int result;
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

//заполнение массива случайными числами
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

//нахождение средней арифметической каждого столбца
double GetAverageInColumn(int[,] matrix)
{
    double count = 0;
    double average = 0;
    for (int i = 0; i < matrix.GetLength(1); i++)
    {
        for (int j = 0; j < matrix.GetLength(0); j++)
        {
            count+=matrix[j, i];
        }
        average = count / matrix.GetLength(0);
        System.Console.Write(Math.Round(average, 2) + "; "); 
        count = 0;       
    }   
    return average;

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

int[,] resultMatrix = InitMatrix(GetNumber("Введите размерность строк m: "), GetNumber("Введите размерность столбцов n: "));
PrintMatrix(resultMatrix);
GetAverageInColumn(resultMatrix);