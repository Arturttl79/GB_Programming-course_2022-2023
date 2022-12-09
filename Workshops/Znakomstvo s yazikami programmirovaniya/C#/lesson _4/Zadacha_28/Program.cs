/* Задача 28: Напишите программу, которая принимает на вход число N и выдаёт произведение чисел от 1 до N.
4 -> 24 
5 -> 120
*/

int GetNumber(string message)
{
    bool isCorrect = false;
    int result = 0;

    while(!isCorrect)
    {
        System.Console.WriteLine(message);

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


decimal GetMulptiply(int number)
{
    decimal result = 1;
    for (int i = 1; i <= number; i++)
    {
        result =  i * result;
    }
    return result;
}

int number = GetNumber("Please enter positive number: ");
decimal multiply = GetMulptiply(number);
System.Console.WriteLine($"Faktorial chisla {number} = {multiply}");