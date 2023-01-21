Console.Write("Vvedite chislo: ");
int number = int.Parse(Console.ReadLine() ?? "");

void CalculateNumbers(int number, int sum)
{
    if (number == 0)
    {
        System.Console.WriteLine(sum);
        return;
    }
    else
        sum = sum + number % 10;
        CalculateNumbers(number % 10, sum);
}

CalculateNumbers(number, 0);