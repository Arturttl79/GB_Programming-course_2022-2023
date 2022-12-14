/* Задача 34: 
Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.

[345, 897, 568, 234] -> 2
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
        array[i] = rnd.Next(100, 1000);
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

//посчитать кол-во четных чисел в массиве
int PositiveNumbers(int[] array)
{
    int count = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] % 2 == 0)
            count++;
    }
    return count;
}

int[] array = InitArray(GetNumber("Vvedite razmernost` massiva: "));
int result = PositiveNumbers(array);
PrintArray(array);
System.Console.WriteLine($"Kolichestvo chetnyh chisel v massive = {result}.");