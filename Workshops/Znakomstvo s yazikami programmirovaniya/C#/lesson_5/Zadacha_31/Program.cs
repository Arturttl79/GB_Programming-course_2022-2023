/* Задача 31: Задайте массив из 12 элементов, заполненный случайными числами из промежутка [-9, 9]. 
Найдите сумму отрицательных и положительных элементов массива.
Например, в массиве [3,9,-8,1,0,-7,2,-1,8,-3,-1,6] сумма положительных чисел равна 29, сумма отрицательных равна -20.


1. Получить размерность массива
2. Получить заполненный массив рандомными числами
3. Распечатать массив на консоль
4. Найти сумму положительных элементов
5. Найти сумму отрицательных элементов
6.* Попробовать сделать это в одном методе
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

/*
//найти сумму положительных элементов
int GetPositiveSumm(int[] array)
{
    int summ = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] > 0)
            summ+= array[i];
    }
    return summ;
}

//найти сумму отрицательных элементов
int GetNegativeSumm(int[] array)
{
    int summ = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] < 0)
            summ+= array[i];
    }
    return summ;
}
*/

//1ый аргумент - сумма положительных, 2ой - отрицательных
(int, int) GetSumms(int[] array)
{
    int positiveSumm = 0;
    int negativeSumm = 0;

    for (int i = 0; i < array.Length; i++)
    {
        if(array[i] < 0)
            negativeSumm += array[i];
        else
            positiveSumm += array[i];
    }
    return (positiveSumm, negativeSumm);
}

int dimension = GetNumber("Vvedite razmernost` massiva: ");
int[] massiv = InitArray(dimension);
PrintArray(massiv);
(int posSumm, int negSumm) = GetSumms(massiv);
System.Console.WriteLine($"Сумма положительных чисел = {posSumm}. Сумма отрицательных чисел = {negSumm}");