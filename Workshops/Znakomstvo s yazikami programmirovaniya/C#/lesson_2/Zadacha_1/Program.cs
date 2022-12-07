// Напишите программу, которая выводит случайное трехзначное число и удаляет вторую цифру этого числа.

int GetRandomNumber()
{
    return new Random().Next(100, 1000); // 100 ... 999
}

/*void ShowRandomNumber(int number)
{
    Console.WriteLine($"Случайное трехзначное число: {number}");
    string str = number.ToString();
    Console.WriteLine($" = {str[0]}{str[2]}");
}
*/

void ShowRandomNumberSecond(int number)
{
    int result = (number / 100) * 10 + number % 10;
    Console.WriteLine($"Случайное трехзначное число: {number}");
    Console.WriteLine(result);
    return;    
}

ShowRandomNumberSecond(GetRandomNumber());

/*
int GetRandomNumber(int left, int right)
{
    Random rnd = new Random();
    int number = rnd.Next(left, right + 1);
    return number;
}

int GetMaxDigitOfNumber
*/