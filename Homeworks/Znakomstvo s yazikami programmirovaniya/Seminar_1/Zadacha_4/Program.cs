Console.WriteLine("Vvedite pervoe chislo: ");
string input1 = Console.ReadLine() ?? "";
int number1 = Convert.ToInt32(input1);
Console.WriteLine("Vvedite vtoroe chislo: ");
string input2 = Console.ReadLine() ?? "";
int number2 = Convert.ToInt32(input2);
Console.WriteLine("Vvedite tretye chislo: ");
string input3 = Console.ReadLine() ?? "";
int number3 = Convert.ToInt32(input3);
int maxNumber = number1;

if (maxNumber < number2)
    maxNumber = number2;
if (maxNumber < number3)
    maxNumber = number3;
Console.WriteLine($"Max = {maxNumber}");