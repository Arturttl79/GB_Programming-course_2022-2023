/* Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.

* 3, 5 -> 243 (3⁵)

* 2, 4 -> 16 */

int GetNumber(string message)
{
    int result = 0;
    bool isCorrect = false;

    while(!isCorrect)
    {
        System.Console.Write(message);
        if(int.TryParse(Console.ReadLine(), out result) && result > 0)
        {
            isCorrect = true;
        }
        else System.Console.WriteLine("Вы ввели некорректное число. Повторите, пожалуйста, ввод.");    
    }
    return result;
}

int GetResult(int x, int y)
{
    int result = x;
    for (int i = 1; i < y; i++)
    {
        result = result * x;    
    }
    System.Console.WriteLine($"Число {x} в натуральную степень {y} = {result}.");
    return result;
}

int inputA = GetNumber("Введите число А: ");
int inputB = GetNumber("Введите число B: ");
int output = GetResult(inputA, inputB);