// Задача 42. Напишите программу, которая преобразовывает десятичное число в двоичное.

//получить десятичное число
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

//перевод числа из десятичной в двоичную
string DecToBin(int number)
{
    string binary = String.Empty;

    while(number >= 1)
    {
        binary += number % 2;
        number = number / 2;
    }
    return new string (binary.Reverse().ToArray());
}

string result = DecToBin(GetNumber("Введите десятичное число: "));
System.Console.WriteLine(String.Join("", result));