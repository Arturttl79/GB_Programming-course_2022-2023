// Напишите программу, которая выводит случайное число из отрезка [10,99] и показывает наибольшую цифру числа.

// Возвращает рандомное число из отрезка [left, right]
int GetRandomNumber(int left, int right)
{
    Random rnd = new Random();
    int number = rnd.Next(left, right + 1); //[left, right)
    return number;
}

// возвращает максимальную цифру числа
int GetMaxDigitOfNumber(int number)
{
    int firstDigit = number / 10;
    int secondDigit = number % 10;

    if(firstDigit > secondDigit)
        return firstDigit;
    else 
        return secondDigit;
}

int number = GetRandomNumber(10, 99);
Console.WriteLine($"Сгенерированное число: {number}");

int maxDigit = GetMaxDigitOfNumber(number);
Console.WriteLine($"Самое большое число: {maxDigit}");
