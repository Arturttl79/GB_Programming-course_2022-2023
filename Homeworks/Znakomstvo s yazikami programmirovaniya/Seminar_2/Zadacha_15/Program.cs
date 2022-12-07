// Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

Console.WriteLine("Введите число, обозначающую день недели (от 1 до 7): ");
int input = Convert.ToInt32(Console.ReadLine());

if(input > 0 && input < 8)
{
    if(input >= 6)
        Console.WriteLine($"{input} число - выходной день!");
    else
        Console.WriteLine($"{input} число - не выходной день!");
}
else
{
    Console.WriteLine($"Число {input} не является днем недели");
}
