/* Задача 27: Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.

* 452 -> 11

* 82 -> 10

* 9012 -> 12 */

int GetNumber(string message)
{
    bool isCorrect = false;
    int result = 0;

    while(!isCorrect)
    {
        System.Console.Write(message);

        if(int.TryParse(Console.ReadLine(), out result) && result > 0)
        {
            isCorrect = true;
        }
        else
        {
            System.Console.WriteLine("Некорректный ввод. Введите число");
        }
    }
    return result;
}

int input = GetNumber("Введите положительное число: ");
int number = input;
int count = 0;
for (int i = 0; i < number; i++)
{
    count = count + number % 10;
    number = number / 10;
}
count = number + count;
System.Console.WriteLine($"Сумма цифр в числе {input} = {count}.");