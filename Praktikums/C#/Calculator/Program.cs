while(true)
{
    Console.Clear();
System.Console.WriteLine("Введите первое число: ");
double firstNumber, secondNumber;
bool firstInput = double.TryParse(Console.ReadLine(), out firstNumber);
System.Console.WriteLine("Введите второе число: ");
bool secondInput = double.TryParse(Console.ReadLine(), out secondNumber);
System.Console.WriteLine("Введите знак вычисления: ");
ConsoleKey consoleKey = Console.ReadKey().Key;
System.Console.WriteLine();

if(consoleKey == ConsoleKey.OemPlus)
    {
        double result = firstNumber + secondNumber;
        System.Console.WriteLine($"{firstNumber} + {secondNumber} = {result}");
    }
else if(consoleKey == ConsoleKey.OemMinus)
    {
        double result = firstNumber - secondNumber;
        System.Console.WriteLine($"{firstNumber} - {secondNumber} = {result}");
    }
else if(consoleKey == ConsoleKey.Oem2)
    {
        double result = firstNumber / secondNumber;
        System.Console.WriteLine($"{firstNumber} / {secondNumber} = {result}");
    }
else if(consoleKey == ConsoleKey.D8)
    {
        double result = firstNumber * secondNumber;
        System.Console.WriteLine($"{firstNumber} * {secondNumber} = {result}");
    }
else 
    System.Console.WriteLine("Vveli nepravilnoe chislo");
Console.ReadLine();
}