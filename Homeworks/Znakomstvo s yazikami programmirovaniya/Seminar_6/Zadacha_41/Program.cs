/* Задача 41: 
Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
* 0, 7, 8, -2, -2 -> 2
* 1, -7, 567, 89, 223-> 3

1. Запрашиваем размерность массива.
2. Запрашиваем числа для массива.
3. Считаем числа больше 0 в заданном массиве.
*/

//запрашиваем размерность массива
int GetNumber(string message)
{
    int result;
    while (true)
    {
        System.Console.Write(message);

        if (int.TryParse(Console.ReadLine(), out result) && result > 0)
        {
            break;
        }
        else
        {
            System.Console.WriteLine("Ввели некорректные данные. Повторите ввод. ");
        }
    }
    return result;
}

//запрашиваем числа для массива
int[] FillArray(string message)
{
    int[] resultArray = new int[GetNumber("Введите размерность массива: ")];
    System.Console.WriteLine(message);

    for (int i = 0; i < resultArray.Length; i++)
    {
        try
        {
            resultArray[i] = int.Parse(Console.ReadLine() ?? "");
        }
        catch (Exception)
        {
            System.Console.WriteLine("Ввели некорректные данные. Повторите ввод. ");
            i = i - 1;
        }
    }
    return resultArray;
}

//считаем числа больше 0 в заданном массиве
int PositiveNumbers(int[] array)
{
    int count = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] > 0)
            count++;
    }
    return count;
}

int[] array = FillArray("Введите любые целые числа через Enter: ");
System.Console.WriteLine("Количество чисел больше 0 в заданном массиве" + "[" + string.Join(", ", array) + "]" + " = " + PositiveNumbers(array));