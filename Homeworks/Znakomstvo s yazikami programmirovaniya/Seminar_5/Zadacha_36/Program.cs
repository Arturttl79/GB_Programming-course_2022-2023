/* Задача 36: 
Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

* [3, 7, 23, 12] -> 19

* [-4, -6, 89, 6] -> 0
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
        array[i] = rnd.Next(-99, 100);
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

//найти сумму элементов на нечетных позициях
int OddSumm(int[] array)
{
    int summ = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if(i % 2 == 1)
            summ = summ + array[i];
    }
    return summ;
}

int[] array = InitArray(GetNumber("Vvedite razmernost` massiva: "));
PrintArray(array);
int oddSumm = OddSumm(array);
System.Console.WriteLine("Сумма элементов, стоящих на нечётных позициях = " + oddSumm);