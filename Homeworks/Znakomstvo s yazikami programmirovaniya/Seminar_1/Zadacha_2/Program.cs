Console.WriteLine("Vvedite pervoe chislo: ");
string input1 = Console.ReadLine() ?? "";
int number1 = Convert.ToInt32(input1);
Console.WriteLine("Vvedite vtoroe chislo: ");
string input2 = Console.ReadLine() ?? "";
int number2 = Convert.ToInt32(input2);
if (number1 > number2)
    Console.WriteLine($"Max = {number1}, Min = {number2}");
else 
    Console.WriteLine($"Max = {number2}, Min = {number1}");