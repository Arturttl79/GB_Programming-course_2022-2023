System.Console.WriteLine("Введите первое число: ");
double firstNumber, secondNumber;
bool firstInput = double.TryParse(Console.ReadLine(), out firstNumber);
System.Console.WriteLine("Введите второе число: ");
bool secondInput = double.TryParse(Console.ReadLine(), out secondNumber);
System.Console.WriteLine("Введите знак вычисления: ");
ConsoleKey consoleKey = Console.ReadKey().Key;

if(consoleKey == ConsoleKey.Add)
    System.Console.WriteLine("Add");
else if(consoleKey == ConsoleKey.Subtract)
    System.Console.WriteLine("Subtract");
else 
    System.Console.WriteLine("Vveli nepravilnoe chislo");


/* switch (consoleKey)
{
    case ConsoleKey.Multiply:
        Console.WriteLine("Multiply");
        break;

    case ConsoleKey.Add:
        Console.WriteLine("Add");
        break;

    case ConsoleKey.Subtract:
        Console.WriteLine("Subtract");
        break;

    case ConsoleKey.Divide:
        Console.WriteLine("Divide");
        break;
    
    default:
        Console.WriteLine("Mistake");
        break;

}
*/