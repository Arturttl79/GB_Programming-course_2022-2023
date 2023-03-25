// Zadacha_44. Записать числа фибоначчи.

//получить кол-во чисел Фибоначчи
int GetNumber(string message)
{
    int result;
    while (true)
    {
        System.Console.WriteLine(message);

        if (int.TryParse(Console.ReadLine(), out result) && result >= 0)
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

//вычисляем числа Фибоначчи и выводим на экран
int[] FibonacciNumbers(int number)
{
    int[] fibonacci = new int[number + 1];
    int count = 1;
    while(count <= number)
    {
        if(count == 1 || count == 2)
        {
            fibonacci[count] = 1;
            System.Console.WriteLine($"Число Фибоначчи под индексом {count} = {fibonacci[count]}");
        }
        else
        {
            fibonacci[count] = fibonacci[count - 1] + fibonacci[count - 2];
            System.Console.WriteLine($"Число Фибоначчи под индексом {count} = {fibonacci[count]}");
        }
        count++;
    }
    return fibonacci;
}

int[] array = FibonacciNumbers(GetNumber("Введите размерность чисел Фибоначчи: "));