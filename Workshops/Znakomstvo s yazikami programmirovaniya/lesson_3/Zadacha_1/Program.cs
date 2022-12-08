// Напишите программу, которая по заданному номеру четверти, показывает диапазон возможных координат точек в этой четверти (x и y).

string Method(int quarter)
{
    switch (quarter)
    {
        case 1:
            return "x = [0; + inf], y = [0; + inf]";
        case 2:
            return "x = [0; - inf], y = [0; + inf]";
        case 3:
            return "x = [0; - inf], y = [0; - inf]";
        case 4:
            return "x = [0; + inf], y = [0; - inf]";
        default:
            return "Нужно ввести число от 1 до 4";
    }
}
int number = Convert.ToInt32(Console.ReadLine());
Console.WriteLine(Method(number));