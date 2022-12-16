/* Задача 43: 
Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.
* b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

1. Запрашиваем входные данные: b1, k1, b2, k2;
2. Находим точку пересечения двух прямых: y = k1 * x + b1, y = k2 * x + b2;
3.* Чертим линии в двумерном массиве.
*/

//запрашиваем входные данные: b1, k1, b2, k2
double GetNumber(string message)
{
    double result;
    while (true)
    {
        System.Console.Write(message);

        if (double.TryParse(Console.ReadLine(), out result))
        {
            break;
        }
        else
        {
            System.Console.WriteLine("Ввели некорректные данные. Повторите ввод. ");
        }
    }
    return result;
}

//находим точку пересечения двух прямых: y = k1 * x + b1, y = k2 * x + b2 в плоскости (x;y)
(double, double) CrossPoint(double b1, double k1, double b2, double k2)
{
    double x = 0;
    double y = 0;

    if(k1 == k2 && b1 == b2)
        System.Console.WriteLine("Линии лежат друг на друге (все точки первой и второй линий сходятся).");
    else if(k1 == k2 && b1 != b2)
        System.Console.WriteLine("Первая и вторая линии параллельны друг другу (не пересекаются).");
    else
    {
        x = ((b2 - b1) / (k1 - k2));
        y = k1 * x + b1;
    }
    return (x, y);
}

double b1 = GetNumber("Введите значение b1: ");
double k1 = GetNumber("Введите значение k1: ");
double b2 = GetNumber("Введите значение b2: ");
double k2 = GetNumber("Введите значение k2: ");
(double crossPointX, double crossPointY) = CrossPoint(b1, k1, b2, k2);
System.Console.WriteLine("(" + crossPointX + ";" + crossPointY + ")");

//*чертим линии в двумерном массиве. Шаг = 0.5. "+" - пересечение двух прямых.
string[,] matrix = new string[50, 50];
for (double i = matrix.GetLength(0) / 2; i >= - matrix.GetLength(0) / 2; i = i - 0.5)
{
    for (double j = - matrix.GetLength(1) / 2; j <= matrix.GetLength(1) / 2; j = j + 0.5)  
    {
        if(i == k1 * j + b1 && i == k2 * j + b2)
            System.Console.Write("+");
        else if(i == k1 * j + b1)
            System.Console.Write("*");
        else if (i == k2 * j + b2)
            System.Console.Write("*");
        else if(j == 0)
            System.Console.Write(".");
        else if(i == 0)
            System.Console.Write(".");
        else
            System.Console.Write(" ");  
    }
System.Console.WriteLine();
}

/*
string[,] matrix = new string[50, 50];
double x = - matrix.GetLength(1) / 2;
double y = matrix.GetLength(0) / 2;

while(y > - matrix.GetLength(0) / 2)
{
    while(x < matrix.GetLength(1) / 2)
    {
       if(y == k1 * x + b1 && y == k2 * x + b2)
            System.Console.Write("+");
        else if(y == k1 * x + b1)
            System.Console.Write("*");
        else if (y == k2 * x + b2)
            System.Console.Write("*");
        else if(x == 0)
            System.Console.Write("|");
        else if(y == 0)
            System.Console.Write("-");
        else
            System.Console.Write(" ");
        x = x + 1;  
    }
    System.Console.WriteLine();
    y = y - 1;
    continue;
}
*/