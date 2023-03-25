// Принимает на вход число и возвращает его сумму.

System.Console.WriteLine("Введите число: ");
int n = int.Parse(Console.ReadLine() ?? "");
int sum = 0;
int SumRec(int num, int sum)
{
    if (num == 0) return sum;
    else 
    {
        sum += num % 10;
        return SumRec(num / 10, sum);
    }
}

System.Console.WriteLine(SumRec(n, sum));
