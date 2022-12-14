/* Задача 37: Найдите произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент, второй и предпоследний и т.д. 
Результат запишите в новом массиве.
[1 2 3 4 5] -> 5 8 3
[6 7 3 6] -> 36 21
*/

//получить размерность массива с консоли
int GetNumber(string message)
{
    int result;
    while (true)
    {
        System.Console.WriteLine(message);

        if (int.TryParse(Console.ReadLine(), out result) && result > 0)
        {
            break;
        }
        else
        {
            System.Console.WriteLine("Vveli nevernye danniye. Vvedite korrektnoe chislo");
        }
    }
    return result;
}

//получить заполненный массив рандомными числами
int[] InitArray(int dimension)
{
    int[] array = new int[dimension];
    Random rnd = new Random();

    for (int i = 0; i < dimension; i++)
    {
        array[i] = rnd.Next(-9, 10);
    }

    return array;
}

//распечатать массив на консоль
void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        System.Console.Write($"{array[i]} ");
    }
    System.Console.WriteLine();
}

//найти новый массив с произведениями первого и последнего значений заданного массива
int[] GetMultiply(int[] array)
{
    int length;

    if (array.Length % 2 == 0)
        length = array.Length / 2;
    else
        length = array.Length / 2 + 1;

    int[] result = new int[length];

    for (int i = 0; i < length; i++)
    {
        if(i == array.Length - 1 - i)
            result[i] = array[i];
        else
            result[i] = array[i] * array[array.Length - 1 - i];
    }
    return result;
}

int[] array = InitArray(GetNumber("Vvedite razmernost` massiva: "));
int[] multiply = GetMultiply(array);
PrintArray(array);
PrintArray(multiply);