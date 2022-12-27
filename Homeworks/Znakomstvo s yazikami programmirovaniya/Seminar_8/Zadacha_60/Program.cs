/* Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. 
Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.
Массив размером 2 x 2 x 2
66(0,0,0) 25(0,1,0)
34(1,0,0) 41(1,1,0)
27(0,0,1) 90(0,1,1)
26(1,0,1) 55(1,1,1)
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

int[,,] InitThreeDimArray(int m, int n, int p)
{
    int[,,] array = new int[m, n, p];
    Random rnd = new Random();
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < p; k++)
            {
                array[i, j, k] = rnd.Next(10, 100);
            }
        }
    }
    return array;
}

void PrintThreeDimArray(int[,,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(2); k++)
            {
                System.Console.Write($"{array[i, j, k]}({i},{j},{k}) ");
            }
            System.Console.WriteLine();
        }
    }
    System.Console.WriteLine();
}

int m = GetNumber("Введите размерность m трехмерного массива: ");
int n = GetNumber("Введите размерность n трехмерного массива: ");
int p = GetNumber("Введите размерность p трехмерного массива: ");
int[,,] threeDimensionArray = InitThreeDimArray(m, n, p);
PrintThreeDimArray(threeDimensionArray);