/* Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
* 3 -> 1, 8, 27
* 5 -> 1, 8, 27, 64, 125
*/

int GetNumber(string message)
{
    bool isCorrect = false;
    int result = 0;

    while(!isCorrect)
    {
        Console.Write(message);
        if(int.TryParse(Console.ReadLine(), out result) && result > 0)
        {
            isCorrect = true;
        }
        else Console.WriteLine ("Вы ввели неверное число"); 
    }
    return result;
}

int number = GetNumber("Введите любое положительное число: ");

for (int i = 1; i <= number; i++)
{
    double cube = Math.Pow(i, 3);
    Console.Write(cube + " ");
}