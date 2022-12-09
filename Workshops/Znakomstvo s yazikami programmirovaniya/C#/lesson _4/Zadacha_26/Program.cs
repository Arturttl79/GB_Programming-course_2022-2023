/* Задача 26: Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.
456 -> 3
78 -> 2
89126 -> 5 */


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

int CountOfDigits(int x)
{
    int cnt = 0;
    while(x > 0)
    {
        cnt+=1;
        x /=10;
    }
    return cnt;
}

System.Console.WriteLine(CountOfDigits(GetNumber("Enter number: ")));