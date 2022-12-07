// Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.

Console.WriteLine("Введите любое число: ");
int input = Convert.ToInt32(Console.ReadLine());
string number = Convert.ToString(input);

if(input < 100)
{
    Console.WriteLine($"Третьей цифры в числе {input} - нет!");
}
else
{
    Console.WriteLine(number[2]);
}