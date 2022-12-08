/* Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.
* A (3,6,8); B (2,1,-7), -> 15.84
* A (7,-5, 0); B (1,-1,9) -> 11.53
*/

int GetNumber(string message)
{
    bool isCorrect = false;
    int result = 0;

    while(!isCorrect)
    {
        Console.Write(message);
        if(int.TryParse(Console.ReadLine(), out result))
        {
            isCorrect = true;
        }
        else Console.WriteLine("Ввели неверное число");
    }
    return result;
}

int x1 = GetNumber("Введите координату x первой точки: ");
int y1 = GetNumber("Введите координату y первой точки: ");
int z1 = GetNumber("Введите координату z первой точки: ");
int x2 = GetNumber("Введите координату x второй точки: ");
int y2 = GetNumber("Введите координату y второй точки: ");
int z2 = GetNumber("Введите координату z второй точки: ");

double result = Math.Sqrt(Math.Pow((x2-x1), 2) + Math.Pow((y2-y1), 2) + Math.Pow((z2-z1), 2));

Console.WriteLine($"Расстояние между двумя точками в трехмерном пространстве будет равно {result}");