Console.WriteLine("Vvedite polozhitel`noe chislo: ");
string input = Console.ReadLine() ?? "";
int number = Convert.ToInt32(input);

if (number > 0)
{
    for (int i = 1; i <= number; i++)
    if (i % 2 == 0)
        Console.Write(i + " ");
} else
{
    Console.Write($"Chislo {number} - ne polozhitel`noe");
    return;
}