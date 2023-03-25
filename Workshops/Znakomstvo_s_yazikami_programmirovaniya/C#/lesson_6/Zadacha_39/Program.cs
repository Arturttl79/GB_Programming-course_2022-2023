// Zadacha 39: Программа, которая переворачивает одномерный массив.

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
        array[i] = rnd.Next(1, 10);
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

//перевернуть массив
int[] RevertArray(int[] array)
{
    int[] result = new int[array.Length];

    for (int i = array.Length - 1; i >= 0; i--)
    {
        result[array.Length - 1 - i] = array[i];
    }
    return result;
}

int dimension = GetNumber("Введите размерность массива: ");
int[] array = InitArray(dimension);
PrintArray(array);

int[] result = RevertArray(array);
PrintArray(result);

Array.Reverse(result);
PrintArray(result);