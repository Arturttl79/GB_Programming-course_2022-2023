// Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.

int GetSecondNumber(int number)
{
    int secondNumber = (number % 100) / 10;
    return secondNumber; 
}

Console.WriteLine("Введите трехзначное число: ");
int input = Convert.ToInt32(Console.ReadLine());

if(input > 99 && input < 1000)
{
    int result = GetSecondNumber(input);
    Console.WriteLine($"Второе число трехзначного числа {input} = {result}");
}
else Console.WriteLine($"Число {input} - не трехзначное");