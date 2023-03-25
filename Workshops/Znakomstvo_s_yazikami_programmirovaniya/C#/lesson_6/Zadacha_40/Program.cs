/* Задача 40. Напишите программу, которая принимает на вход три числа 
и проверяет, может ли существовать треуголбник с сторонами такой длины.
Теорема о неравенстве треугольника: каждая сторона треугольника меньше суммы двух других сторон.
*/

//получить три числа с консоли
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

//проверить на существование треугольника с заданными тремя числами.
bool CheckTriangle(int a, int b, int c)
{
    return a < b + c && b < a + c && c < a + b;
}

int a = GetNumber("Введите первую длину треугольника: ");
int b = GetNumber("Введите вторую длину треугольника: ");
int c = GetNumber("Введите третью длину треугольника: ");
Console.WriteLine("Треугольник со сторонами " + a + ", " + b + ", " + c + (CheckTriangle(a, b, c) ? " " : " не ") + "может существовать");
