/* Задача 24: Напишите программу, которая принимает на вход число (А) и выдаёт сумму чисел от 1 до А.
7 -> 28
4 -> 10
8 -> 36
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

// метод, который считает сумму от 1 до n
int GetSumm(int number)
{
    int summ = 0;

    for (int i = 1; i <= number; i++)
    {
        summ+= i; // summ = summ + i;
    }
    return summ;
}

int number = GetNumber("Введите число больше 0: ");
int summ = GetSumm(number);

Console.WriteLine($"сумма чисел от 1 до {number} = {summ}");
